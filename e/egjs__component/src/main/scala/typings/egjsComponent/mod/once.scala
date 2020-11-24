package typings.egjsComponent.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@egjs/component", "once")
@js.native
object once extends js.Object {
  
  def apply(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
  def apply(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], _]]): Component = js.native
}
