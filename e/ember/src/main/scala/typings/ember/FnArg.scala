package typings.ember

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnArg extends js.Object {
  def apply[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
}

