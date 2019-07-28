package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueStatement
  extends BaseNode
     with Statement {
  var label: js.UndefOr[Identifier | Null] = js.undefined
  @JSName("type")
  var type_ContinueStatement: typings.estree.estreeStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    `type`: typings.estree.estreeStrings.ContinueStatement,
    label: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (label != null) __obj.updateDynamic("label")(label)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ContinueStatement]
  }
}

