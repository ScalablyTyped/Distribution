package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Name extends js.Object {
  var name: java.lang.String = js.native
  @JSName("onBlur")
  var onBlur_Original: Anon_EFieldOrEvent = js.native
  @JSName("onChange")
  var onChange_Original: Anon_EField = js.native
  var value: js.Any = js.native
  def onBlur(e: reactLib.reactMod.ReactNs.FocusEvent[_]): scala.Unit = js.native
  def onBlur[T](fieldOrEvent: T): scala.Unit | (js.Function1[/* e */ js.Any, scala.Unit]) = js.native
  def onChange(e: reactLib.reactMod.ReactNs.ChangeEvent[_]): scala.Unit = js.native
  def onChange[T](field: T): (js.Function1[/* e */ js.Any | reactLib.reactMod.ReactNs.ChangeEvent[_], scala.Unit]) | scala.Unit = js.native
}

