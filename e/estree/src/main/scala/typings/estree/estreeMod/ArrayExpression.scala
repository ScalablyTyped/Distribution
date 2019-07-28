package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayExpression
  extends BaseNode
     with Expression {
  var elements: js.Array[Expression | SpreadElement]
  @JSName("type")
  var type_ArrayExpression: typings.estree.estreeStrings.ArrayExpression
}

object ArrayExpression {
  @scala.inline
  def apply(
    elements: js.Array[Expression | SpreadElement],
    `type`: typings.estree.estreeStrings.ArrayExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ArrayExpression]
  }
}

