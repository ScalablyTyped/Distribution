package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateExpression extends BaseNode {
  var argument: estreeLib.Expression
  var operator: UpdateOperator
  var prefix: scala.Boolean
  @JSName("type")
  var type_UpdateExpression: estreeLib.estreeLibStrings.UpdateExpression
}

object UpdateExpression {
  @scala.inline
  def apply(
    argument: estreeLib.Expression,
    operator: UpdateOperator,
    prefix: scala.Boolean,
    `type`: estreeLib.estreeLibStrings.UpdateExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument, operator = operator, prefix = prefix)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UpdateExpression]
  }
}

