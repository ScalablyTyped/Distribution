package typings.formik

import typings.react.mod.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallE extends js.Object {
  def apply(e: FocusEvent[_]): Unit = js.native
  def apply[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
}

