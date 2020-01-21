package typings.domtagger.mod

import typings.domtagger.domtaggerStrings.svg
import typings.std.Attr
import typings.std.ChildNode
import typings.std.Element
import typings.std.Node
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGOptions extends Options {
  @JSName("type")
  var type_SVGOptions: svg
}

object SVGOptions {
  @scala.inline
  def apply(
    any: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit],
    attribute: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit],
    text: Node => js.Function1[/* textContent */ js.Any, Unit],
    `type`: svg,
    convert: /* template */ TemplateStringsArray => String = null,
    transform: /* markup */ String => String = null
  ): SVGOptions = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), attribute = js.Any.fromFunction3(attribute), text = js.Any.fromFunction1(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (convert != null) __obj.updateDynamic("convert")(js.Any.fromFunction1(convert))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[SVGOptions]
  }
}

