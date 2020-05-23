package typings.googleCloudStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback[T, U] extends js.Object {
  var callback: U
  var options: T
}

object Callback {
  @scala.inline
  def apply[T, U](callback: U, options: T): Callback[T, U] = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback[T, U]]
  }
}

