package typings.eslint.eslintMod.AST

import typings.estree.estreeMod.Comment
import typings.estree.estreeMod.ModuleDeclaration
import typings.estree.estreeMod.Statement
import typings.estree.estreeStrings.module
import typings.estree.estreeStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program
  extends typings.estree.estreeMod.Program {
  @JSName("comments")
  var comments_Program: js.Array[Comment]
  @JSName("loc")
  var loc_Program: SourceLocation
  @JSName("range")
  var range_Program: Range
  var tokens: js.Array[Token]
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Statement | ModuleDeclaration],
    comments: js.Array[Comment],
    loc: SourceLocation,
    range: Range,
    sourceType: script | module,
    tokens: js.Array[Token],
    `type`: typings.estree.estreeStrings.Program,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
}

