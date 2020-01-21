package typings.domtagger.mod

import typings.std.Attr
import typings.std.ChildNode
import typings.std.Element
import typings.std.Node
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		 * Used to provide a custom algorithm for converting a template
  		 * to a valid HTML text.
  		 */
  var convert: js.UndefOr[js.Function1[/* template */ TemplateStringsArray, String]] = js.undefined
  /**
  		 * Used to postprocess the result of `convert`.
  		 *
  		 * @param transform The default transformation.
  		 */
  var transform: js.UndefOr[js.Function1[/* markup */ String, String]] = js.undefined
  /**
  		 * The type of content to create.
  		 *
  		 * When `'svg'`, the generated template function returns `SVGElement` instances.
  		 *
  		 * @default 'html'
  		 */
  var `type`: js.UndefOr[String] = js.undefined
  /**
  		 * Called when no other node type satisfies the parsed result.
  		 *
  		 * @param node The node
  		 * @param childNodes
  		 */
  def any(node: Node, childNodes: js.Array[ChildNode]): js.Function1[/* markup */ js.Any, Unit]
  /**
  		 * Called when the parsed result is an attribute node.
  		 *
  		 * @param element The element whose attribute to set.
  		 * @param name The raw attribute name.
  		 * @param attribute The attribute node.
  		 *
  		 * @example
  		 * ```ts
  		 * (node, name, attribute) => value => {
  		 * 	const type = typeof value;
  		 * 	if (type === 'boolean' || type === 'function') {
  		 * 		node[name] = value;
  		 * 	} else if (value == null) {
  		 * 		node.removeAttribute(name);
  		 * 	} else {
  		 * 		node.setAttribute(name, value);
  		 * 	}
  		 * }
  		 * ```
  		 */
  def attribute(element: Element, name: String, attribute: Attr): js.Function1[/* value */ js.Any, Unit]
  /**
  		 * How to handle cases where content can only be some text.
  		 *
  		 * The node is one that can only have text.
  		 *
  		 * @param node The node whose text content to set
  		 *
  		 * @example
  		 * ```ts
  		 * node => textContent => {
  		 * 	node.textContent = textContent;
  		 * }
  		 * ```
  		 */
  def text(node: Node): js.Function1[/* textContent */ js.Any, Unit]
}

object Options {
  @scala.inline
  def apply(
    any: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit],
    attribute: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit],
    text: Node => js.Function1[/* textContent */ js.Any, Unit],
    convert: /* template */ TemplateStringsArray => String = null,
    transform: /* markup */ String => String = null,
    `type`: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), attribute = js.Any.fromFunction3(attribute), text = js.Any.fromFunction1(text))
    if (convert != null) __obj.updateDynamic("convert")(js.Any.fromFunction1(convert))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

