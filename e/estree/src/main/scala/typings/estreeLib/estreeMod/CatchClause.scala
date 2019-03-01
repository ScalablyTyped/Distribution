package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatchClause
  extends BaseNode
     with _Node {
  var body: BlockStatement
  var param: Pattern
  @JSName("type")
  var type_CatchClause: estreeLib.estreeLibStrings.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: BlockStatement,
    param: Pattern,
    `type`: estreeLib.estreeLibStrings.CatchClause,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("param")(param)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[CatchClause]
  }
}

