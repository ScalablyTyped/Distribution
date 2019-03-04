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
    val __obj = js.Dynamic.literal(error = error, onerror = onerror, onsuccess = onsuccess, readyState = readyState, result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DOMRequest[T]]
  }
}

