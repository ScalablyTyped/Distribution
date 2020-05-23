package typings.dockerfileAst

import typings.dockerfileAst.dockerfileMod.Dockerfile
import typings.dockerfileAst.flagMod.Flag
import typings.dockerfileAst.jsonInstructionMod.JSONInstruction
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/copy", JSImport.Namespace)
@js.native
object copyMod extends js.Object {
  @js.native
  class Copy protected () extends JSONInstruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    def getFromFlag(): Flag | Null = js.native
  }
  
}

