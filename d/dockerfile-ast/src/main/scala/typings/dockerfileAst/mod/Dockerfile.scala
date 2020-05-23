package typings.dockerfileAst.mod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dockerfile extends ImageTemplate {
  /**
    * Returns the set of instructions that include the given position.
    *
    * @param position the position to search in
    * @return the set of instructions that the given position is in,
    *         or null if the position is invalid and is not contained
    *         within the Dockerfile
    */
  def getContainingImage(position: Position): ImageTemplate | Null
  /**
    * @deprecated As of 0.0.18, replaced by getDirectives()
    */
  def getDirective(): typings.dockerfileAst.parserDirectiveMod.ParserDirective | Null
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
  def getDirectives(): js.Array[typings.dockerfileAst.parserDirectiveMod.ParserDirective]
  def getEscapeCharacter(): String
  def getInitialARGs(): js.Array[typings.dockerfileAst.argMod.Arg]
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
    *         been defined or if the document does not contain the
    *         given line number
    */
  def resolveVariable(variable: String, line: Double): js.UndefOr[String | Null]
}

object Dockerfile {
  @scala.inline
  def apply(
    contains: Position => Boolean,
    getARGs: () => js.Array[typings.dockerfileAst.argMod.Arg],
    getAvailableVariables: Double => js.Array[String],
    getCMDs: () => js.Array[typings.dockerfileAst.cmdMod.Cmd],
    getCOPYs: () => js.Array[typings.dockerfileAst.copyMod.Copy],
    getComments: () => js.Array[typings.dockerfileAst.commentMod.Comment],
    getContainingImage: Position => ImageTemplate | Null,
    getDirective: () => typings.dockerfileAst.parserDirectiveMod.ParserDirective | Null,
    getDirectives: () => js.Array[typings.dockerfileAst.parserDirectiveMod.ParserDirective],
    getENTRYPOINTs: () => js.Array[typings.dockerfileAst.entrypointMod.Entrypoint],
    getENVs: () => js.Array[typings.dockerfileAst.envMod.Env],
    getEscapeCharacter: () => String,
    getFROMs: () => js.Array[typings.dockerfileAst.fromMod.From],
    getHEALTHCHECKs: () => js.Array[typings.dockerfileAst.healthcheckMod.Healthcheck],
    getInitialARGs: () => js.Array[typings.dockerfileAst.argMod.Arg],
    getInstructions: () => js.Array[typings.dockerfileAst.instructionMod.Instruction],
    getOnbuildTriggers: () => js.Array[typings.dockerfileAst.instructionMod.Instruction],
    getRange: () => Range | Null,
    resolveVariable: (String, Double) => js.UndefOr[String | Null]
  ): Dockerfile = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getARGs = js.Any.fromFunction0(getARGs), getAvailableVariables = js.Any.fromFunction1(getAvailableVariables), getCMDs = js.Any.fromFunction0(getCMDs), getCOPYs = js.Any.fromFunction0(getCOPYs), getComments = js.Any.fromFunction0(getComments), getContainingImage = js.Any.fromFunction1(getContainingImage), getDirective = js.Any.fromFunction0(getDirective), getDirectives = js.Any.fromFunction0(getDirectives), getENTRYPOINTs = js.Any.fromFunction0(getENTRYPOINTs), getENVs = js.Any.fromFunction0(getENVs), getEscapeCharacter = js.Any.fromFunction0(getEscapeCharacter), getFROMs = js.Any.fromFunction0(getFROMs), getHEALTHCHECKs = js.Any.fromFunction0(getHEALTHCHECKs), getInitialARGs = js.Any.fromFunction0(getInitialARGs), getInstructions = js.Any.fromFunction0(getInstructions), getOnbuildTriggers = js.Any.fromFunction0(getOnbuildTriggers), getRange = js.Any.fromFunction0(getRange), resolveVariable = js.Any.fromFunction2(resolveVariable))
    __obj.asInstanceOf[Dockerfile]
  }
}

