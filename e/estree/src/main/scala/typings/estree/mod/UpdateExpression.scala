package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateExpression
  extends BaseNode
     with Expression {
  var argument: Expression
  var operator: UpdateOperator
  var prefix: Boolean
  @JSName("type")
  var type_UpdateExpression: typings.estree.estreeStrings.UpdateExpression
}

object UpdateExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: UpdateOperator,
    prefix: Boolean,
    `type`: typings.estree.estreeStrings.UpdateExpression,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpression]
  }
}

