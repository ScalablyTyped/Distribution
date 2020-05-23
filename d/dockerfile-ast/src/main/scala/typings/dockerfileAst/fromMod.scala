package typings.dockerfileAst

import typings.dockerfileAst.dockerfileMod.Dockerfile
import typings.dockerfileAst.flagMod.Flag
import typings.dockerfileAst.modifiableInstructionMod.ModifiableInstruction
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/from", JSImport.Namespace)
@js.native
object fromMod extends js.Object {
  @js.native
  class From protected () extends ModifiableInstruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
    var indexOf: js.Any = js.native
    var lastIndexOf: js.Any = js.native
    def getBuildStage(): String | Null = js.native
    def getBuildStageRange(): Range | Null = js.native
    def getImage(): String | Null = js.native
    def getImageDigest(): String | Null = js.native
    /**
      * Returns the range in the document that the digest of the base
      * image encompasses.
      *
      * @return the base image's digest's range in the document, or null
      *         if no digest has been specified
      */
    def getImageDigestRange(): Range | Null = js.native
    /**
      * Returns the name of the image that will be used as the base image.
      *
      * @return the base image's name, or null if unspecified
      */
    def getImageName(): String | Null = js.native
    /**
      * Returns the range that covers the name of the image used by
      * this instruction.
      *
      * @return the range of the name of this instruction's argument,
      *         or null if no image has been specified
      */
    def getImageNameRange(): Range | Null = js.native
    /**
      * Returns the range that covers the image argument of this
      * instruction. This includes the tag or digest of the image if
      * it has been specified by the instruction.
      *
      * @return the range of the image argument, or null if no image
      *         has been specified
      */
    def getImageRange(): Range | Null = js.native
    def getImageTag(): String | Null = js.native
    /**
      * Returns the range in the document that the tag of the base
      * image encompasses.
      *
      * @return the base image's tag's range in the document, or null
      *         if no tag has been specified
      */
    def getImageTagRange(): Range | Null = js.native
    def getPlatformFlag(): Flag | Null = js.native
    def getRegistry(): String | Null = js.native
    def getRegistryRange(): Range | Null = js.native
  }
  
}

