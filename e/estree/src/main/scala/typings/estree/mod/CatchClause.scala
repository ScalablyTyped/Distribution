package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatchClause
  extends BaseNode
     with Node {
  var body: BlockStatement
  var param: Pattern | Null
  @JSName("type")
  var type_CatchClause: typings.estree.estreeStrings.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: BlockStatement,
    `type`: typings.estree.estreeStrings.CatchClause,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    param: Pattern = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause]
  }
}

