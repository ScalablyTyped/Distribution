package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateLiteral extends BaseNode {
  var expressions: js.Array[estreeLib.Expression]
  var quasis: js.Array[TemplateElement]
  @JSName("type")
  var type_TemplateLiteral: estreeLib.estreeLibStrings.TemplateLiteral
}

object TemplateLiteral {
  @scala.inline
  def apply(
    expressions: js.Array[estreeLib.Expression],
    quasis: js.Array[TemplateElement],
    `type`: estreeLib.estreeLibStrings.TemplateLiteral,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions, quasis = quasis)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TemplateLiteral]
  }
}

