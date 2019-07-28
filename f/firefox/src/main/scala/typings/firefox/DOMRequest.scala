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
    val __obj = js.Dynamic.literal(error = error, onerror = onerror, onsuccess = onsuccess, readyState = readyState, result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DOMRequest[T]]
  }
}

