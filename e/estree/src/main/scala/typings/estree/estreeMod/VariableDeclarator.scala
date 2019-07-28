package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclarator
  extends BaseNode
     with Node {
  var id: Pattern
  var init: js.UndefOr[Expression | Null] = js.undefined
  @JSName("type")
  var type_VariableDeclarator: typings.estree.estreeStrings.VariableDeclarator
}

object VariableDeclarator {
  @scala.inline
  def apply(
    id: Pattern,
    `type`: typings.estree.estreeStrings.VariableDeclarator,
    init: Expression = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (init != null) __obj.updateDynamic("init")(init)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[VariableDeclarator]
  }
}

