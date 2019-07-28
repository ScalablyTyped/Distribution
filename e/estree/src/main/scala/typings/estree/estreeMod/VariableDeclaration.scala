package typings.estree.estreeMod

import typings.estree.estreeStrings.`var`
import typings.estree.estreeStrings.const
import typings.estree.estreeStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends Declaration
     with BaseNode {
  var declarations: js.Array[VariableDeclarator]
  var kind: `var` | let | const
  @JSName("type")
  var type_VariableDeclaration: typings.estree.estreeStrings.VariableDeclaration
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator],
    kind: `var` | let | const,
    `type`: typings.estree.estreeStrings.VariableDeclaration,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations, kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[VariableDeclaration]
  }
}

