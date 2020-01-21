package typings.emberArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnArrayCallbackfnIndexThisArg[T] extends js.Object {
  def apply(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): Boolean = js.native
  def apply(
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
    thisArg: js.Any
  ): Boolean = js.native
}

