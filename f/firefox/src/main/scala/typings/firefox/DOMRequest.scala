package typings.firefox

import typings.std.DOMError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRequest[T] extends js.Object {
  var error: DOMError
  var onerror: js.Function
  var onsuccess: js.Function
  var readyState: String
   // "done" or "pending"
  var result: T
}

object DOMRequest {
  @scala.inline
  def apply[T](error: DOMError, onerror: js.Function, onsuccess: js.Function, readyState: String, result: T): DOMRequest[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onsuccess = onsuccess.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRequest[T]]
  }
}

