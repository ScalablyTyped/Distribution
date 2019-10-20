package typings.estreeDashJsx.estreeDashJsxMod

import typings.estree.estreeMod.BaseNode
import typings.estree.estreeMod.Comment
import typings.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXText extends BaseNode {
  var raw: String
  @JSName("type")
  var type_JSXText: typings.estreeDashJsx.estreeDashJsxStrings.JSXText
  var value: String
}

object JSXText {
  @scala.inline
  def apply(
    raw: String,
    `type`: typings.estreeDashJsx.estreeDashJsxStrings.JSXText,
    value: String,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXText = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXText]
  }
}

