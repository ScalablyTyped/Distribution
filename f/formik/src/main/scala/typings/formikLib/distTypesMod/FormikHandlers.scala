package typings
package formikLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikHandlers extends js.Object {
  def handleBlur(e: reactLib.reactMod.ReactNs.FocusEvent[_]): scala.Unit = js.native
  def handleBlur[T](fieldOrEvent: T): scala.Unit | (js.Function1[/* e */ js.Any, scala.Unit]) = js.native
  def handleChange(e: reactLib.reactMod.ReactNs.ChangeEvent[_]): scala.Unit = js.native
  def handleChange[T](field: T): (js.Function1[/* e */ java.lang.String | reactLib.reactMod.ReactNs.ChangeEvent[_], scala.Unit]) | scala.Unit = js.native
  def handleReset(): scala.Unit = js.native
  def handleSubmit(): scala.Unit = js.native
  def handleSubmit(e: reactLib.reactMod.ReactNs.FormEvent[stdLib.HTMLFormElement]): scala.Unit = js.native
}

