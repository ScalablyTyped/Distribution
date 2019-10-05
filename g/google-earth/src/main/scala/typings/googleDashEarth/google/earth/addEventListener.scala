package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.addEventListener")
@js.native
object addEventListener extends js.Object {
  def apply(targetObject: js.Any, eventID: String, listenerCallback: js.Function1[/* event */ KmlEvent, Unit]): Unit = js.native
  def apply(
    targetObject: js.Any,
    eventID: String,
    listenerCallback: js.Function1[/* event */ KmlEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}

