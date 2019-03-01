package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayExpression extends BaseNode {
  var elements: js.Array[estreeLib.Expression | SpreadElement]
  @JSName("type")
  var type_ArrayExpression: estreeLib.estreeLibStrings.ArrayExpression
}

object ArrayExpression {
  @scala.inline
  def apply(
    elements: js.Array[estreeLib.Expression | SpreadElement],
    `type`: estreeLib.estreeLibStrings.ArrayExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ArrayExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("elements")(elements)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ArrayExpression]
  }
}

