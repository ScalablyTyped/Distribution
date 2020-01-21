package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback[T, U] extends js.Object {
  var callback: U
  var options: T
}

object AnonCallback {
  @scala.inline
  def apply[T, U](callback: U, options: T): AnonCallback[T, U] = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCallback[T, U]]
  }
}

