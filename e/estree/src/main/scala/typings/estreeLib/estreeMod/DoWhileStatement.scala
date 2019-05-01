package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoWhileStatement
  extends BaseNode
     with Statement {
  var body: Statement
  var test: Expression
  @JSName("type")
  var type_DoWhileStatement: estreeLib.estreeLibStrings.DoWhileStatement
}

object DoWhileStatement {
  @scala.inline
  def apply(
    body: Statement,
    test: Expression,
    `type`: estreeLib.estreeLibStrings.DoWhileStatement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body, test = test)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DoWhileStatement]
  }
}

