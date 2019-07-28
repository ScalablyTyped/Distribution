package typings.esprima.esprimaMod

import typings.estree.estreeMod.Comment
import typings.estree.estreeMod.ModuleDeclaration
import typings.estree.estreeMod.SourceLocation
import typings.estree.estreeMod.Statement
import typings.estree.estreeStrings.module
import typings.estree.estreeStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program
  extends typings.estree.estreeMod.Program {
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Statement | ModuleDeclaration],
    sourceType: script | module,
    `type`: String,
    type_Program: typings.estree.estreeStrings.Program,
    comments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    tokens: js.Array[Token] = null,
    trailingComments: js.Array[Comment] = null
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

