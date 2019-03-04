package typings
package esprimaLib.esprimaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program
  extends estreeLib.estreeMod.Program {
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[estreeLib.estreeMod.Statement | estreeLib.estreeMod.ModuleDeclaration],
    sourceType: estreeLib.estreeLibStrings.script | estreeLib.estreeLibStrings.module,
    `type`: java.lang.String,
    type_Program: estreeLib.estreeLibStrings.Program,
    comments: js.Array[estreeLib.estreeMod.Comment] = null,
    leadingComments: js.Array[estreeLib.estreeMod.Comment] = null,
    loc: estreeLib.estreeMod.SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tokens: js.Array[Token] = null,
    trailingComments: js.Array[estreeLib.estreeMod.Comment] = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body, sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("type")(type_Program)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tokens != null) __obj.updateDynamic("tokens")(tokens)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Program]
  }
}

