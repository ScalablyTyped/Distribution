package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression extends BaseNode {
  var argument: estreeLib.Expression
  var operator: UnaryOperator
  var prefix: estreeLib.estreeLibNumbers.`true`
  @JSName("type")
  var type_UnaryExpression: estreeLib.estreeLibStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: estreeLib.Expression,
    operator: UnaryOperator,
    prefix: estreeLib.estreeLibNumbers.`true`,
    `type`: estreeLib.estreeLibStrings.UnaryExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("argument")(argument)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("prefix")(prefix)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UnaryExpression]
  }
}

