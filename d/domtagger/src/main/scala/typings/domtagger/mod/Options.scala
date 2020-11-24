package typings.domtagger.mod

import typings.std.Attr
import typings.std.ChildNode
import typings.std.Element
import typings.std.Node
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Called when no other node type satisfies the parsed result.
    *
    * @param node The node
    * @param childNodes
    */
  def any(node: Node, childNodes: js.Array[ChildNode]): js.Function1[/* markup */ js.Any, Unit] = js.native
  
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
    *     const type = typeof value;
    *     if (type === 'boolean' || type === 'function') {
    *         node[name] = value;
    *     } else if (value == null) {
    *         node.removeAttribute(name);
    *     } else {
    *         node.setAttribute(name, value);
    *     }
    * }
    * ```
    */
  def attribute(element: Element, name: String, attribute: Attr): js.Function1[/* value */ js.Any, Unit] = js.native
  
  /**
    * Used to provide a custom algorithm for converting a template
    * to a valid HTML text.
    */
  var convert: js.UndefOr[js.Function1[/* template */ TemplateStringsArray, String]] = js.native
  
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
    *     node.textContent = textContent;
    * }
    * ```
    */
  def text(node: Node): js.Function1[/* textContent */ js.Any, Unit] = js.native
  
  /**
    * Used to postprocess the result of `convert`.
    *
    * @param transform The default transformation.
    */
  var transform: js.UndefOr[js.Function1[/* markup */ String, String]] = js.native
  
  /**
    * The type of content to create.
    *
    * When `'svg'`, the generated template function returns `SVGElement` instances.
    *
    * @default 'html'
    */
  var `type`: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    any: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit],
    attribute: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit],
    text: Node => js.Function1[/* textContent */ js.Any, Unit]
  ): Options = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), attribute = js.Any.fromFunction3(attribute), text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAny(value: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit]): Self = this.set("any", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttribute(value: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit]): Self = this.set("attribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def setText(value: Node => js.Function1[/* textContent */ js.Any, Unit]): Self = this.set("text", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvert(value: /* template */ TemplateStringsArray => String): Self = this.set("convert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    
    @scala.inline
    def setTransform(value: /* markup */ String => String): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
