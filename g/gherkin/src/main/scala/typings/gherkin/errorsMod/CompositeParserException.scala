package typings.gherkin.errorsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/Errors", "CompositeParserException")
@js.native
class CompositeParserException () extends GherkinException
/* static members */
@JSImport("gherkin/dist/src/Errors", "CompositeParserException")
@js.native
object CompositeParserException extends js.Object {
  
  def create(errors: js.Array[Error]): CompositeParserException = js.native
}
