package typings.gherkin

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.IGherkinDocument
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.IPickle
import typings.cucumberMessages.distSrcIdGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPicklesCompileMod {
  
  @JSImport("gherkin/dist/src/pickles/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(gherkinDocument: IGherkinDocument, uri: String, newId: NewId): js.Array[IPickle] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(gherkinDocument.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], newId.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPickle]]
}
