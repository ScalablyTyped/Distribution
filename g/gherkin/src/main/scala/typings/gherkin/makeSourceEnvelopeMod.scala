package typings.gherkin

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeSourceEnvelopeMod {
  
  @JSImport("gherkin/dist/src/stream/makeSourceEnvelope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(data: String, uri: String): IEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[IEnvelope]
}
