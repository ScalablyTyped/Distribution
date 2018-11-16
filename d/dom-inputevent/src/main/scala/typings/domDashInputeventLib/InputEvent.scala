package typings
package domDashInputeventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-empty-interface
@JSGlobal("InputEvent")
@js.native
class InputEvent protected ()
  extends stdLib.UIEvent {
  def this(typeArg: domDashInputeventLib.domDashInputeventLibStrings.beforeinput) = this()
  def this(typeArg: domDashInputeventLib.domDashInputeventLibStrings.input) = this()
  def this(typeArg: domDashInputeventLib.domDashInputeventLibStrings.beforeinput, inputEventInit: InputEventInit) = this()
  def this(typeArg: domDashInputeventLib.domDashInputeventLibStrings.input, inputEventInit: InputEventInit) = this()
  val data: java.lang.String = js.native
  val isComposing: scala.Boolean = js.native
}

