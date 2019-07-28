package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStatement
  extends BaseNode
     with Statement {
  var argument: js.UndefOr[Expression | Null] = js.undefined
  @JSName("type")
  var type_ReturnStatement: typings.estree.estreeStrings.ReturnStatement
}

object ReturnStatement {
  @scala.inline
  def apply(
    `type`: typings.estree.estreeStrings.ReturnStatement,
    argument: Expression = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ReturnStatement]
  }
}

