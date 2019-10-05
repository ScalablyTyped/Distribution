package typings.atEgjsComponent.atEgjsComponentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/component", "once")
@js.native
object once extends js.Object {
  def apply(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
  def apply(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], _]]): Component = js.native
}

