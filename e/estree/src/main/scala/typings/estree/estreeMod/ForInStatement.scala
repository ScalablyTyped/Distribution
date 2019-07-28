package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForInStatement
  extends BaseForXStatement
     with Statement {
  @JSName("type")
  var type_ForInStatement: typings.estree.estreeStrings.ForInStatement
}

object ForInStatement {
  @scala.inline
  def apply(
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typings.estree.estreeStrings.ForInStatement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ForInStatement = {
    val __obj = js.Dynamic.literal(body = body, left = left.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ForInStatement]
  }
}

