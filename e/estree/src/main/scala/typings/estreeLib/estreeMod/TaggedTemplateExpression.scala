package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedTemplateExpression extends BaseNode {
  var quasi: TemplateLiteral
  var tag: estreeLib.Expression
  @JSName("type")
  var type_TaggedTemplateExpression: estreeLib.estreeLibStrings.TaggedTemplateExpression
}

object TaggedTemplateExpression {
  @scala.inline
  def apply(
    quasi: TemplateLiteral,
    tag: estreeLib.Expression,
    `type`: estreeLib.estreeLibStrings.TaggedTemplateExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi, tag = tag)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
}

