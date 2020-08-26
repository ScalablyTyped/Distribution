package typings.firefox

import typings.std.DOMError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMRequest[T] extends js.Object {
  var error: DOMError = js.native
  var onerror: js.Function = js.native
  var onsuccess: js.Function = js.native
  var readyState: String = js.native
   // "done" or "pending"
  var result: T = js.native
}

object DOMRequest {
  @scala.inline
  def apply[T](error: DOMError, onerror: js.Function, onsuccess: js.Function, readyState: String, result: T): DOMRequest[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onsuccess = onsuccess.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRequest[T]]
  }
  @scala.inline
  implicit class DOMRequestOps[Self <: DOMRequest[_], T] (val x: Self with DOMRequest[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: DOMError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnerror(value: js.Function): Self = this.set("onerror", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsuccess(value: js.Function): Self = this.set("onsuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadyState(value: String): Self = this.set("readyState", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: T): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

