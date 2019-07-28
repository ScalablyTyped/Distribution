package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalExpression
  extends BaseNode
     with Expression {
  var alternate: Expression
  var consequent: Expression
  var test: Expression
  @JSName("type")
  var type_ConditionalExpression: typings.estree.estreeStrings.ConditionalExpression
}

object ConditionalExpression {
  @scala.inline
  def apply(
    alternate: Expression,
    consequent: Expression,
    test: Expression,
    `type`: typings.estree.estreeStrings.ConditionalExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate, consequent = consequent, test = test)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ConditionalExpression]
  }
}

