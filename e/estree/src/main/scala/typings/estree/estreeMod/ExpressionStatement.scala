package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionStatement
  extends BaseNode
     with Statement {
  var expression: Expression
  @JSName("type")
  var type_ExpressionStatement: typings.estree.estreeStrings.ExpressionStatement
}

object ExpressionStatement {
  @scala.inline
  def apply(
    expression: Expression,
    `type`: typings.estree.estreeStrings.ExpressionStatement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExpressionStatement]
  }
}

