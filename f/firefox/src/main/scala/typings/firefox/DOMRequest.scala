package typings.firefox

import typings.std.DOMError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMRequest[T] extends StObject {
  
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
  implicit class DOMRequestMutableBuilder[Self <: DOMRequest[_], T] (val x: Self with DOMRequest[T]) extends AnyVal {
    
    @scala.inline
    def setError(value: DOMError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: js.Function): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsuccess(value: js.Function): Self = StObject.set(x, "onsuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyState(value: String): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
