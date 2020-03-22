package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForOptions extends js.Object {
  /**
    * @default false
    */
  var handleError: Boolean
  /**
    * @default 0
    */
  var timeout: Double
  /**
    * @default null
    */
  def filter(values: js.Any*): Boolean
}

object WaitForOptions {
  @scala.inline
  def apply(filter: /* repeated */ js.Any => Boolean, handleError: Boolean, timeout: Double): WaitForOptions = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), handleError = handleError.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaitForOptions]
  }
}

