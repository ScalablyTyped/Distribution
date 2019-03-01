package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression extends BaseNode {
  var left: estreeLib.Expression
  var operator: LogicalOperator
  var right: estreeLib.Expression
  @JSName("type")
  var type_LogicalExpression: estreeLib.estreeLibStrings.LogicalExpression
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: estreeLib.Expression,
    operator: LogicalOperator,
    right: estreeLib.Expression,
    `type`: estreeLib.estreeLibStrings.LogicalExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("right")(right)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[LogicalExpression]
  }
}

