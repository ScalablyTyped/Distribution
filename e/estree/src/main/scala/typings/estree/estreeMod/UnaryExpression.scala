package typings.estree.estreeMod

import typings.estree.estreeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression
  extends BaseNode
     with Expression {
  var argument: Expression
  var operator: UnaryOperator
  var prefix: `true`
  @JSName("type")
  var type_UnaryExpression: typings.estree.estreeStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: UnaryOperator,
    prefix: `true`,
    `type`: typings.estree.estreeStrings.UnaryExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument, operator = operator, prefix = prefix)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UnaryExpression]
  }
}

