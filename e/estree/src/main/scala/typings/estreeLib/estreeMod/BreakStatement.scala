package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakStatement
  extends BaseNode
     with Statement {
  var label: js.UndefOr[Identifier | scala.Null] = js.undefined
  @JSName("type")
  var type_BreakStatement: estreeLib.estreeLibStrings.BreakStatement
}

object BreakStatement {
  @scala.inline
  def apply(
    `type`: estreeLib.estreeLibStrings.BreakStatement,
    label: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (label != null) __obj.updateDynamic("label")(label)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BreakStatement]
  }
}

