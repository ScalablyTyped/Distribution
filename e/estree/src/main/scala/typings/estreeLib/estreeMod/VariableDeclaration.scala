package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends Declaration
     with BaseNode {
  var declarations: js.Array[VariableDeclarator]
  var kind: estreeLib.estreeLibStrings.`var` | estreeLib.estreeLibStrings.let | estreeLib.estreeLibStrings.const
  @JSName("type")
  var type_VariableDeclaration: estreeLib.estreeLibStrings.VariableDeclaration
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator],
    kind: estreeLib.estreeLibStrings.`var` | estreeLib.estreeLibStrings.let | estreeLib.estreeLibStrings.const,
    `type`: estreeLib.estreeLibStrings.VariableDeclaration,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("declarations")(declarations)
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[VariableDeclaration]
  }
}

