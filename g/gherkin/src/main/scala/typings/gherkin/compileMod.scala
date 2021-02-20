package typings.gherkin

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IGherkinDocument
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IPickle
import typings.cucumberMessages.idGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileMod {
  
  @JSImport("gherkin/dist/src/pickles/compile", JSImport.Default)
  @js.native
  def default(gherkinDocument: IGherkinDocument, uri: String, newId: NewId): js.Array[IPickle] = js.native
}
