package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryStatement
  extends BaseNode
     with Statement {
  var block: BlockStatement
  var finalizer: js.UndefOr[BlockStatement | Null] = js.undefined
  var handler: js.UndefOr[CatchClause | Null] = js.undefined
  @JSName("type")
  var type_TryStatement: typings.estree.estreeStrings.TryStatement
}

object TryStatement {
  @scala.inline
  def apply(
    block: BlockStatement,
    `type`: typings.estree.estreeStrings.TryStatement,
    finalizer: js.UndefOr[Null | BlockStatement] = js.undefined,
    handler: js.UndefOr[Null | CatchClause] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(finalizer)) __obj.updateDynamic("finalizer")(finalizer.asInstanceOf[js.Any])
    if (!js.isUndefined(handler)) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryStatement]
  }
}

