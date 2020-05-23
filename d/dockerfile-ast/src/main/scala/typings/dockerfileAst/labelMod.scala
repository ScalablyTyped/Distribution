package typings.dockerfileAst

import typings.dockerfileAst.dockerfileMod.Dockerfile
import typings.dockerfileAst.propertyInstructionMod.PropertyInstruction
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/label", JSImport.Namespace)
@js.native
object labelMod extends js.Object {
  @js.native
  class Label protected () extends PropertyInstruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
  }
  
}

