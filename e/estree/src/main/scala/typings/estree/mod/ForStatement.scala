package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement
  extends BaseNode
     with Statement {
  var body: Statement
  var init: js.UndefOr[VariableDeclaration | Expression | Null] = js.undefined
  var test: js.UndefOr[Expression | Null] = js.undefined
  @JSName("type")
  var type_ForStatement: typings.estree.estreeStrings.ForStatement
  var update: js.UndefOr[Expression | Null] = js.undefined
}

object ForStatement {
  @scala.inline
  def apply(
    body: Statement,
    `type`: typings.estree.estreeStrings.ForStatement,
    init: js.UndefOr[Null | VariableDeclaration | Expression] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    test: js.UndefOr[Null | Expression] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    update: js.UndefOr[Null | Expression] = js.undefined
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement]
  }
}

