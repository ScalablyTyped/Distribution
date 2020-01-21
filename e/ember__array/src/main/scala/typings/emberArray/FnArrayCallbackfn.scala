package typings.emberArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnArrayCallbackfn[T] extends js.Object {
  def apply[U](callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U]): js.Array[U] = js.native
  def apply[U](
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
}

