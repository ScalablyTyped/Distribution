package typings.gherkin.errorsMod

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/Errors", "NoSuchLanguageException")
@js.native
class NoSuchLanguageException () extends GherkinException
/* static members */
@JSImport("gherkin/dist/src/Errors", "NoSuchLanguageException")
@js.native
object NoSuchLanguageException extends js.Object {
  
  def create(language: String, location: ILocation): GherkinException = js.native
}
