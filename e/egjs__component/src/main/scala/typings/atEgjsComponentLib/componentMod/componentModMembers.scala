package typings
package atEgjsComponentLib.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/component", JSImport.Namespace)
@js.native
object componentModMembers extends js.Object {
  def hasOn(eventName: java.lang.String): scala.Boolean = js.native
  def off(): Component = js.native
  def off(eventName: java.lang.String): Component = js.native
  def off(
    eventName: java.lang.String,
    handlerToAttach: js.Function1[/* event */ ScalablyTyped.runtime.StringDictionary[js.Any], _]
  ): Component = js.native
  def on(
    eventName: java.lang.String,
    handlerToAttach: js.Function1[/* event */ ScalablyTyped.runtime.StringDictionary[js.Any], _]
  ): Component = js.native
  def on(
    events: ScalablyTyped.runtime.StringDictionary[js.Function1[/* event */ ScalablyTyped.runtime.StringDictionary[js.Any], _]]
  ): Component = js.native
  def once(
    eventName: java.lang.String,
    handlerToAttach: js.Function1[/* event */ ScalablyTyped.runtime.StringDictionary[js.Any], _]
  ): Component = js.native
  def once(
    events: ScalablyTyped.runtime.StringDictionary[js.Function1[/* event */ ScalablyTyped.runtime.StringDictionary[js.Any], _]]
  ): Component = js.native
  def trigger(eventName: java.lang.String): scala.Boolean = js.native
  def trigger(eventName: java.lang.String, customEvent: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Boolean = js.native
}

