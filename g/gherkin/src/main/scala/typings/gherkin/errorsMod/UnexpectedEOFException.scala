package typings.gherkin.errorsMod

import typings.gherkin.tokenMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/Errors", "UnexpectedEOFException")
@js.native
class UnexpectedEOFException () extends GherkinException
/* static members */
@JSImport("gherkin/dist/src/Errors", "UnexpectedEOFException")
@js.native
object UnexpectedEOFException extends js.Object {
  
  def create(token: default, expectedTokenTypes: js.Array[String], stateComment: String): GherkinException = js.native
}
