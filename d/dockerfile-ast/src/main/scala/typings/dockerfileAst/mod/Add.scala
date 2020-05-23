package typings.dockerfileAst.mod

import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast", "Add")
@js.native
class Add protected ()
  extends typings.dockerfileAst.addMod.Add {
  def this(
    document: TextDocument,
    range: Range,
    dockerfile: typings.dockerfileAst.dockerfileMod.Dockerfile,
    escapeChar: String,
    instruction: String,
    instructionRange: Range
  ) = this()
}

