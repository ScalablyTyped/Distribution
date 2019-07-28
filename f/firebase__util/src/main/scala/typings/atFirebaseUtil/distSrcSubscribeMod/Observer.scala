package typings.atFirebaseUtil.distSrcSubscribeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  @JSName("complete")
  var complete_Original: CompleteFn = js.native
  @JSName("error")
  var error_Original: ErrorFn = js.native
  @JSName("next")
  var next_Original: NextFn[T] = js.native
  def complete(): Unit = js.native
  def error(error: Error): Unit = js.native
  def next(value: T): Unit = js.native
}

