package typings.egjsComponent.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  var options: StringDictionary[js.Any] = js.native
  def hasOn(eventName: String): Boolean = js.native
  def off(): Component = js.native
  def off(
    eventName: js.UndefOr[scala.Nothing],
    handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]
  ): Component = js.native
  def off(eventName: String): Component = js.native
  def off(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
  def on(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
  def on(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], _]]): Component = js.native
  def once(eventName: String, handlerToAttach: js.Function1[/* event */ StringDictionary[js.Any], _]): Component = js.native
  def once(events: StringDictionary[js.Function1[/* event */ StringDictionary[js.Any], _]]): Component = js.native
  def trigger(eventName: String): Boolean = js.native
  def trigger(eventName: String, customEvent: StringDictionary[js.Any]): Boolean = js.native
}

