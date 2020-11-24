package typings.egjsComponent.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@egjs/component", "off")
@js.native
object off extends js.Object {
  
  def apply(): Component = js.native
  def apply(
    eventName: js.UndefOr[scala.Nothing],
    handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]
  ): Component = js.native
  def apply(eventName: String): Component = js.native
  def apply(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
}
