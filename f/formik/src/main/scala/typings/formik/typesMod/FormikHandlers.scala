package typings.formik.typesMod

import typings.react.mod.ChangeEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikHandlers extends js.Object {
  def handleBlur(e: FocusEvent[_]): Unit = js.native
  def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
  def handleChange(e: ChangeEvent[_]): Unit = js.native
  def handleChange[T](field: T): (js.Function1[/* e */ js.Any | ChangeEvent[_], Unit]) | Unit = js.native
  def handleReset(): Unit = js.native
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: FormEvent[HTMLFormElement]): Unit = js.native
}

