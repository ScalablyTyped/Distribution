package typings
package firefoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRequest[T] extends js.Object {
  var error: stdLib.DOMError
  var onerror: js.Function
  var onsuccess: js.Function
  var readyState: java.lang.String
   // "done" or "pending"
  var result: T
}

object DOMRequest {
  @scala.inline
  def apply[T](
    error: stdLib.DOMError,
    onerror: js.Function,
    onsuccess: js.Function,
    readyState: java.lang.String,
    result: T
  ): DOMRequest[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("onerror")(onerror)
    __obj.updateDynamic("onsuccess")(onsuccess)
    __obj.updateDynamic("readyState")(readyState)
    __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRequest[T]]
  }
}

