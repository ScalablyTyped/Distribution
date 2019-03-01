package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression extends BaseNode {
  var left: estreeLib.Expression
  var operator: BinaryOperator
  var right: estreeLib.Expression
  @JSName("type")
  var type_BinaryExpression: estreeLib.estreeLibStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: estreeLib.Expression,
    operator: BinaryOperator,
    right: estreeLib.Expression,
    `type`: estreeLib.estreeLibStrings.BinaryExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("right")(right)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BinaryExpression]
  }
}

