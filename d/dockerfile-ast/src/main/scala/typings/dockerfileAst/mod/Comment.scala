package typings.dockerfileAst.mod

import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast", "Comment")
@js.native
class Comment protected ()
  extends typings.dockerfileAst.commentMod.Comment {
  def this(document: TextDocument, range: Range) = this()
}

