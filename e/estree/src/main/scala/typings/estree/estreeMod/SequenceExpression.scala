package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceExpression
  extends BaseNode
     with Expression {
  var expressions: js.Array[Expression]
  @JSName("type")
  var type_SequenceExpression: typings.estree.estreeStrings.SequenceExpression
}

object SequenceExpression {
  @scala.inline
  def apply(
    expressions: js.Array[Expression],
    `type`: typings.estree.estreeStrings.SequenceExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SequenceExpression]
  }
}

