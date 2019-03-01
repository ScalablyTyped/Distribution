package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleCallExpression
  extends BaseCallExpression
     with CallExpression {
  @JSName("type")
  var type_SimpleCallExpression: estreeLib.estreeLibStrings.CallExpression
}

object SimpleCallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[estreeLib.Expression | SpreadElement],
    callee: estreeLib.Expression | Super,
    `type`: estreeLib.estreeLibStrings.CallExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): SimpleCallExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("arguments")(arguments)
    __obj.updateDynamic("callee")(callee.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SimpleCallExpression]
  }
}

