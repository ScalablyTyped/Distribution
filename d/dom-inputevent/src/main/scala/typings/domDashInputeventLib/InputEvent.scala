package typings
package domDashInputeventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-empty-interface
@js.native
trait InputEvent
  extends stdLib.UIEvent {
  val data: java.lang.String | scala.Null = js.native
  val isComposing: scala.Boolean = js.native
}

@JSGlobal("InputEvent")
@js.native
class InputEventCls protected () extends InputEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: InputEventInit) = this()
}

@JSGlobal("InputEvent")
@js.native
object InputEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, InputEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ InputEventInit, InputEvent]

