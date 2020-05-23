package typings.dockerfileAst

import typings.dockerfileAst.dockerfileMod.Dockerfile
import typings.dockerfileAst.flagMod.Flag
import typings.dockerfileAst.instructionMod.Instruction
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/modifiableInstruction", JSImport.Namespace)
@js.native
object modifiableInstructionMod extends js.Object {
  @js.native
  abstract class ModifiableInstruction protected () extends Instruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    var flags: js.Any = js.native
    def getFlags(): js.Array[Flag] = js.native
    /* protected */ def stopSearchingForFlags(value: String): Boolean = js.native
  }
  
}

