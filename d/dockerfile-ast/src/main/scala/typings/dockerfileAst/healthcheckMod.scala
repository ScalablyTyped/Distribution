package typings.dockerfileAst

import typings.dockerfileAst.argumentMod.Argument
import typings.dockerfileAst.dockerfileMod.Dockerfile
import typings.dockerfileAst.modifiableInstructionMod.ModifiableInstruction
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/healthcheck", JSImport.Namespace)
@js.native
object healthcheckMod extends js.Object {
  @js.native
  class Healthcheck protected () extends ModifiableInstruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    def getSubcommand(): Argument | Null = js.native
  }
  
}

