package typings
package atEgjsComponentLib.atEgjsComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  var options: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def hasOn(eventName: java.lang.String): scala.Boolean = js.native
  def off(): Component = js.native
  def off(eventName: java.lang.String): Component = js.native
  def off(
    eventName: java.lang.String,
    handlerToAttach: js.Function1[/* event */ org.scalablytyped.runtime.StringDictionary[js.Any], _]
  ): Component = js.native
  def on(
    eventName: java.lang.String,
    handlerToAttach: js.Function1[/* event */ org.scalablytyped.runtime.StringDictionary[js.Any], _]
  ): Component = js.native
  def on(
    events: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ org.scalablytyped.runtime.StringDictionary[js.Any], _]]
  ): Component = js.native
  def once(
    eventName: java.lang.String,
    handlerToAttach: js.Function1[/* event */ org.scalablytyped.runtime.StringDictionary[js.Any], _]
  ): Component = js.native
  def once(
    events: org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ org.scalablytyped.runtime.StringDictionary[js.Any], _]]
  ): Component = js.native
  def trigger(eventName: java.lang.String): scala.Boolean = js.native
  def trigger(eventName: java.lang.String, customEvent: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Boolean = js.native
}

