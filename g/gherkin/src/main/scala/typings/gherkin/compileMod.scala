package typings.gherkin

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IGherkinDocument
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IPickle
import typings.cucumberMessages.idGeneratorMod.NewId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/pickles/compile", JSImport.Namespace)
@js.native
object compileMod extends js.Object {
  
  def default(gherkinDocument: IGherkinDocument, uri: String, newId: NewId): js.Array[IPickle] = js.native
}
