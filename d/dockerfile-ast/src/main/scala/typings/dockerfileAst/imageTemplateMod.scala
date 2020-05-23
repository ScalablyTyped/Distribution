package typings.dockerfileAst

import typings.dockerfileAst.argMod.Arg
import typings.dockerfileAst.cmdMod.Cmd
import typings.dockerfileAst.commentMod.Comment
import typings.dockerfileAst.copyMod.Copy
import typings.dockerfileAst.entrypointMod.Entrypoint
import typings.dockerfileAst.envMod.Env
import typings.dockerfileAst.fromMod.From
import typings.dockerfileAst.healthcheckMod.Healthcheck
import typings.dockerfileAst.instructionMod.Instruction
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/imageTemplate", JSImport.Namespace)
@js.native
object imageTemplateMod extends js.Object {
  @js.native
  class ImageTemplate ()
    extends typings.dockerfileAst.mod.ImageTemplate {
    val comments: js.Any = js.native
    val instructions: js.Any = js.native
    def addComment(comment: Comment): Unit = js.native
    def addInstruction(instruction: Instruction): Unit = js.native
    /* CompleteClass */
    override def contains(position: Position): Boolean = js.native
    /* CompleteClass */
    override def getARGs(): js.Array[Arg] = js.native
    /**
      * Retrieves an array of variable names that are valid at the
      * given line in the Dockerfile (zero-based). If the
      * line is outside the range of the parsed Dockerfile, an empty
      * array will be returned.
      *
      * @param line the interested line, zero-based
      * @return the array of variables that may be used by an
      *         instruction at the specified line
      */
    /* CompleteClass */
    override def getAvailableVariables(line: Double): js.Array[String] = js.native
    /* CompleteClass */
    override def getCMDs(): js.Array[Cmd] = js.native
    /* CompleteClass */
    override def getCOPYs(): js.Array[Copy] = js.native
    /* CompleteClass */
    override def getComments(): js.Array[Comment] = js.native
    /* CompleteClass */
    override def getENTRYPOINTs(): js.Array[Entrypoint] = js.native
    /* CompleteClass */
    override def getENVs(): js.Array[Env] = js.native
    /* CompleteClass */
    override def getFROMs(): js.Array[From] = js.native
    /* CompleteClass */
    override def getHEALTHCHECKs(): js.Array[Healthcheck] = js.native
    /* protected */ def getInstructionAt(line: Double): Instruction | Null = js.native
    /* CompleteClass */
    override def getInstructions(): js.Array[Instruction] = js.native
    /* CompleteClass */
    override def getOnbuildTriggers(): js.Array[Instruction] = js.native
    /* CompleteClass */
    override def getRange(): Range | Null = js.native
    /**
      * Resolves a variable with the given name at the specified line
      * to its value. If null is returned, then the variable has been
      * defined but no value was given. If undefined is returned, then
      * a variable with the given name has not been defined yet as of
      * the given line.
      *
      * @param variable the name of the variable to resolve
      * @param line the line number that the variable is on, zero-based
      * @return the value of the variable as defined by an ARG or ENV
      *         instruction, or null if no value has been specified, or
      *         undefined if a variable with the given name has not
      *         been defined
      */
    def resolveVariable(variable: String, line: Double): js.UndefOr[String | Null] = js.native
  }
  
}

