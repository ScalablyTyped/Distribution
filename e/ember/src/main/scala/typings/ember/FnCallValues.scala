package typings.ember

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallValues extends js.Object {
  def apply[T](values: js.Array[T]): js.Promise[T] = js.native
  def apply[T](values: Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
}

