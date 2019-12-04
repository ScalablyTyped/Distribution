package typings.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback[T, U] extends js.Object {
  var callback: U
  var options: T
}

object Anon_Callback {
  @scala.inline
  def apply[T, U](callback: U, options: T): Anon_Callback[T, U] = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Callback[T, U]]
  }
}

