package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhileStatement
  extends BaseNode
     with Statement {
  var body: Statement
  var test: Expression
  @JSName("type")
  var type_WhileStatement: typings.estree.estreeStrings.WhileStatement
}

object WhileStatement {
  @scala.inline
  def apply(
    body: Statement,
    test: Expression,
    `type`: typings.estree.estreeStrings.WhileStatement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): WhileStatement = {
    val __obj = js.Dynamic.literal(body = body, test = test)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[WhileStatement]
  }
}

