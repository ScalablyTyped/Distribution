package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryStatement
  extends BaseNode
     with Statement {
  var block: BlockStatement
  var finalizer: js.UndefOr[BlockStatement | scala.Null] = js.undefined
  var handler: js.UndefOr[CatchClause | scala.Null] = js.undefined
  @JSName("type")
  var type_TryStatement: estreeLib.estreeLibStrings.TryStatement
}

object TryStatement {
  @scala.inline
  def apply(
    block: BlockStatement,
    `type`: estreeLib.estreeLibStrings.TryStatement,
    finalizer: BlockStatement = null,
    handler: CatchClause = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TryStatement = {
    val __obj = js.Dynamic.literal(block = block)
    __obj.updateDynamic("type")(`type`)
    if (finalizer != null) __obj.updateDynamic("finalizer")(finalizer)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TryStatement]
  }
}

