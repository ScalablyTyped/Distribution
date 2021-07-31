package typings.gherkin

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import typings.gherkin.anon.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createLocationMod {
  
  @JSImport("gherkin/dist/src/cli/createLocation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: Line): ILocation = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ILocation]
}
