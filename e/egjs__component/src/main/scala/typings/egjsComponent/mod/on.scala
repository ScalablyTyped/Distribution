package typings.egjsComponent.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/component", "on")
@js.native
object on extends js.Object {
  def apply(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
  def apply(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], _]]): Component = js.native
}

