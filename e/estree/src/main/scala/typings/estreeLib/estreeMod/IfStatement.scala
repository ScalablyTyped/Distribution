package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends BaseNode
     with Statement {
  var alternate: js.UndefOr[Statement | scala.Null] = js.undefined
  var consequent: Statement
  var test: Expression
  @JSName("type")
  var type_IfStatement: estreeLib.estreeLibStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    consequent: Statement,
    test: Expression,
    `type`: estreeLib.estreeLibStrings.IfStatement,
    alternate: Statement = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent, test = test)
    __obj.updateDynamic("type")(`type`)
    if (alternate != null) __obj.updateDynamic("alternate")(alternate)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[IfStatement]
  }
}

