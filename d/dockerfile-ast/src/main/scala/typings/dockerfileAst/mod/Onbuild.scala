package typings.dockerfileAst.mod

import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast", "Onbuild")
@js.native
class Onbuild protected ()
  extends typings.dockerfileAst.onbuildMod.Onbuild {
  def this(
    document: TextDocument,
    range: Range,
    dockerfile: typings.dockerfileAst.dockerfileMod.Dockerfile,
    escapeChar: String,
    instruction: String,
    instructionRange: Range
  ) = this()
}

