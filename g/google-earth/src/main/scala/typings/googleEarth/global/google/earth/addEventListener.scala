package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.addEventListener")
@js.native
object addEventListener extends js.Object {
  
  def apply(
    targetObject: js.Any,
    eventID: String,
    listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, Unit]
  ): Unit = js.native
  def apply(
    targetObject: js.Any,
    eventID: String,
    listenerCallback: js.Function1[/* event */ typings.googleEarth.google.earth.KmlEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}
