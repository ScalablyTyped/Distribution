package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalExpression extends BaseNode {
  var alternate: estreeLib.Expression
  var consequent: estreeLib.Expression
  var test: estreeLib.Expression
  @JSName("type")
  var type_ConditionalExpression: estreeLib.estreeLibStrings.ConditionalExpression
}

object ConditionalExpression {
  @scala.inline
  def apply(
    alternate: estreeLib.Expression,
    consequent: estreeLib.Expression,
    test: estreeLib.Expression,
    `type`: estreeLib.estreeLibStrings.ConditionalExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
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

