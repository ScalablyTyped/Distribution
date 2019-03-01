package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YieldExpression extends BaseNode {
  var argument: js.UndefOr[estreeLib.Expression | scala.Null] = js.undefined
  var delegate: scala.Boolean
  @JSName("type")
  var type_YieldExpression: estreeLib.estreeLibStrings.YieldExpression
}

object YieldExpression {
  @scala.inline
  def apply(
    delegate: scala.Boolean,
    `type`: estreeLib.estreeLibStrings.YieldExpression,
    argument: estreeLib.Expression = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): YieldExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("delegate")(delegate)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[YieldExpression]
  }
}

