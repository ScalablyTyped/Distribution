package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseForXStatement extends BaseNode {
  var body: Statement
  var left: VariableDeclaration | Pattern
  var right: estreeLib.Expression
}

object BaseForXStatement {
  @scala.inline
  def apply(
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: estreeLib.Expression,
    `type`: java.lang.String,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): BaseForXStatement = {
    val __obj = js.Dynamic.literal(body = body, left = left.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BaseForXStatement]
  }
}

