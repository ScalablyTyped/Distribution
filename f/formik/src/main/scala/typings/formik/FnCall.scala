package typings.formik

import typings.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(e: ChangeEvent[_]): Unit = js.native
  def apply[T](field: T): (js.Function1[/* e */ String | ChangeEvent[_], Unit]) | Unit = js.native
}

