package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement
  extends BaseNode
     with _Node {
  var tail: scala.Boolean
  @JSName("type")
  var type_TemplateElement: estreeLib.estreeLibStrings.TemplateElement
  var value: estreeLib.Anon_Cooked
}

object TemplateElement {
  @scala.inline
  def apply(
    tail: scala.Boolean,
    `type`: estreeLib.estreeLibStrings.TemplateElement,
    value: estreeLib.Anon_Cooked,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("tail")(tail)
    __obj.updateDynamic("value")(value)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TemplateElement]
  }
}

