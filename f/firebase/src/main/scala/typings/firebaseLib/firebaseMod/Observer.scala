package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
@js.native
trait Observer[T, E] extends js.Object {
  @JSName("complete")
  var complete_Original: CompleteFn = js.native
  @JSName("error")
  var error_Original: ErrorFn[E] = js.native
  @JSName("next")
  var next_Original: NextFn[T] = js.native
  def complete(): scala.Unit = js.native
  def error(error: E): scala.Unit = js.native
  def next(value: T): scala.Unit = js.native
}

