package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStatement
  extends BaseNode
     with Statement {
  var body: js.Array[Statement]
  var innerComments: js.UndefOr[js.Array[Comment]] = js.undefined
  @JSName("type")
  var type_BlockStatement: estreeLib.estreeLibStrings.BlockStatement
}

object BlockStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    `type`: estreeLib.estreeLibStrings.BlockStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BlockStatement]
  }
}

