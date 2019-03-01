package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueStatement
  extends BaseNode
     with Statement {
  var label: js.UndefOr[Identifier | scala.Null] = js.undefined
  @JSName("type")
  var type_ContinueStatement: estreeLib.estreeLibStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    `type`: estreeLib.estreeLibStrings.ContinueStatement,
    label: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (label != null) __obj.updateDynamic("label")(label)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ContinueStatement]
  }
}

