package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceExpression extends BaseNode {
  var expressions: js.Array[estreeLib.Expression]
  @JSName("type")
  var type_SequenceExpression: estreeLib.estreeLibStrings.SequenceExpression
}

object SequenceExpression {
  @scala.inline
  def apply(
    expressions: js.Array[estreeLib.Expression],
    `type`: estreeLib.estreeLibStrings.SequenceExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): SequenceExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("expressions")(expressions)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SequenceExpression]
  }
}

