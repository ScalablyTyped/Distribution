package typings.gherkin.errorsMod

import typings.gherkin.tokenMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/Errors", "UnexpectedTokenException")
@js.native
class UnexpectedTokenException () extends GherkinException
/* static members */
@JSImport("gherkin/dist/src/Errors", "UnexpectedTokenException")
@js.native
object UnexpectedTokenException extends js.Object {
  
  def create(token: default, expectedTokenTypes: js.Array[String], stateComment: String): GherkinException = js.native
}
