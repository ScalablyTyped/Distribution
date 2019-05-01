package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwaitExpression
  extends BaseNode
     with Expression {
  var argument: Expression
  @JSName("type")
  var type_AwaitExpression: estreeLib.estreeLibStrings.AwaitExpression
}

object AwaitExpression {
  @scala.inline
  def apply(
    argument: Expression,
    `type`: estreeLib.estreeLibStrings.AwaitExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AwaitExpression]
  }
}

