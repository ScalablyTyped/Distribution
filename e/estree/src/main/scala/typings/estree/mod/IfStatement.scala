package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends BaseNode
     with Statement {
  var alternate: js.UndefOr[Statement | Null] = js.undefined
  var consequent: Statement
  var test: Expression
  @JSName("type")
  var type_IfStatement: typings.estree.estreeStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    consequent: Statement,
    test: Expression,
    `type`: typings.estree.estreeStrings.IfStatement,
    alternate: js.UndefOr[Null | Statement] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(alternate)) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
}

