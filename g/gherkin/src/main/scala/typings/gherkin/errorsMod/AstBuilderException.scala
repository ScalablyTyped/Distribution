package typings.gherkin.errorsMod

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/Errors", "AstBuilderException")
@js.native
class AstBuilderException () extends GherkinException
/* static members */
@JSImport("gherkin/dist/src/Errors", "AstBuilderException")
@js.native
object AstBuilderException extends js.Object {
  
  def create(message: String, location: ILocation): GherkinException = js.native
}
