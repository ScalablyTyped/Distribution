package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression
  extends BaseNode
     with Expression {
  var left: Expression
  var operator: LogicalOperator
  var right: Expression
  @JSName("type")
  var type_LogicalExpression: estreeLib.estreeLibStrings.LogicalExpression
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: LogicalOperator,
    right: Expression,
    `type`: estreeLib.estreeLibStrings.LogicalExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left, operator = operator, right = right)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[LogicalExpression]
  }
}

