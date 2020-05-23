package typings.dockerfileAst

import typings.dockerfileAst.argMod.Arg
import typings.dockerfileAst.cmdMod.Cmd
import typings.dockerfileAst.commentMod.Comment
import typings.dockerfileAst.copyMod.Copy
import typings.dockerfileAst.entrypointMod.Entrypoint
import typings.dockerfileAst.envMod.Env
import typings.dockerfileAst.fromMod.From
import typings.dockerfileAst.healthcheckMod.Healthcheck
import typings.dockerfileAst.imageTemplateMod.ImageTemplate
import typings.dockerfileAst.instructionMod.Instruction
import typings.dockerfileAst.parserDirectiveMod.ParserDirective
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/dockerfile", JSImport.Namespace)
@js.native
object dockerfileMod extends js.Object {
  @js.native
  class Dockerfile protected ()
    extends ImageTemplate
       with typings.dockerfileAst.mod.Dockerfile {
    def this(document: TextDocument) = this()
    val buildStages: js.Any = js.native
    var currentBuildStage: js.Any = js.native
    var directive: js.Any = js.native
    val document: js.Any = js.native
    /**
      * Whether a FROM instruction has been added to this Dockerfile or not.
      */
    var foundFrom: js.Any = js.native
    val initialInstructions: js.Any = js.native
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
    /**
      * Returns the set of instructions that include the given position.
      *
      * @param position the position to search in
      * @return the set of instructions that the given position is in,
      *         or null if the position is invalid and is not contained
      *         within the Dockerfile
      */
    /* CompleteClass */
    override def getContainingImage(position: Position): typings.dockerfileAst.mod.ImageTemplate | Null = js.native
    /**
      * @deprecated As of 0.0.18, replaced by getDirectives()
      */
    /* CompleteClass */
    override def getDirective(): ParserDirective | Null = js.native
    /**
      * Retrieves the list of parser directives that have been defined
      * in this Dockerfile. It will be in the order it was defined in
      * the file with the first line of the file being the first
      * directive in the returned array.
      *
      * @return the ordered list of parser directives defined in this
      *         Dockerfile
      * @since 0.0.18
      */
    /* CompleteClass */
    override def getDirectives(): js.Array[ParserDirective] = js.native
    /* CompleteClass */
    override def getENTRYPOINTs(): js.Array[Entrypoint] = js.native
    /* CompleteClass */
    override def getENVs(): js.Array[Env] = js.native
    /* CompleteClass */
    override def getEscapeCharacter(): String = js.native
    /* CompleteClass */
    override def getFROMs(): js.Array[From] = js.native
    /* CompleteClass */
    override def getHEALTHCHECKs(): js.Array[Healthcheck] = js.native
    /* CompleteClass */
    override def getInitialARGs(): js.Array[Arg] = js.native
    /* CompleteClass */
    override def getInstructions(): js.Array[Instruction] = js.native
    /* CompleteClass */
    override def getOnbuildTriggers(): js.Array[Instruction] = js.native
    /* CompleteClass */
    override def getRange(): Range | Null = js.native
    /**
      * Internally reorganize the comments in the Dockerfile and allocate
      * them to the relevant build stages that they belong to.
      */
    def organizeComments(): Unit = js.native
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
    /* InferMemberOverrides */
    override def resolveVariable(variable: String, line: Double): js.UndefOr[String | Null] = js.native
    def setDirective(directive: ParserDirective): Unit = js.native
  }
  
}

