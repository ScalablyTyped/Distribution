package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement
  extends BaseNode
     with Statement {
  var body: Statement
  var init: js.UndefOr[VariableDeclaration | Expression | scala.Null] = js.undefined
  var test: js.UndefOr[Expression | scala.Null] = js.undefined
  @JSName("type")
  var type_ForStatement: estreeLib.estreeLibStrings.ForStatement
  var update: js.UndefOr[Expression | scala.Null] = js.undefined
}

object ForStatement {
  @scala.inline
  def apply(
    body: Statement,
    `type`: estreeLib.estreeLibStrings.ForStatement,
    init: VariableDeclaration | Expression = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    test: Expression = null,
    trailingComments: js.Array[Comment] = null,
    update: Expression = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (test != null) __obj.updateDynamic("test")(test)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ForStatement]
  }
}

