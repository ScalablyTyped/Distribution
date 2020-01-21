package typings.flatpickr

import typings.flatpickr.flatpickrNumbers.`0`
import typings.flatpickr.flatpickrNumbers.`1`
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def arrayify[T](obj: T): js.Array[T] = js.native
  def arrayify[T](obj: js.Array[T]): js.Array[T] = js.native
  def debounce[F /* <: js.Function */](func: F, wait: Double): js.ThisFunction0[/* this */ js.Function, Unit] = js.native
  def debounce[F /* <: js.Function */](func: F, wait: Double, immediate: Boolean): js.ThisFunction0[/* this */ js.Function, Unit] = js.native
  def int(bool: Boolean): `1` | `0` = js.native
  def pad(number: String): String = js.native
  def pad(number: Double): String = js.native
  type IncrementEvent = MouseEvent with AnonDelta
}

