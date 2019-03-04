package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentExpression extends BaseNode {
  var left: Pattern | MemberExpression
  var operator: AssignmentOperator
  var right: estreeLib.Expression
  @JSName("type")
  var type_AssignmentExpression: estreeLib.estreeLibStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    left: Pattern | MemberExpression,
    operator: AssignmentOperator,
    right: estreeLib.Expression,
    `type`: estreeLib.estreeLibStrings.AssignmentExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator, right = right)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AssignmentExpression]
  }
}

