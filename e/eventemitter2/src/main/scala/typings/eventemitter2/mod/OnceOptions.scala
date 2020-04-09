package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnceOptions extends js.Object {
  /**
    * @default Promise
    */
  var Promise: js.Function
  /**
    * @default false
    */
  var overload: Boolean
  /**
    * @default 0
    */
  var timeout: Double
}

object OnceOptions {
  @scala.inline
  def apply(Promise: js.Function, overload: Boolean, timeout: Double): OnceOptions = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], overload = overload.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnceOptions]
  }
}

