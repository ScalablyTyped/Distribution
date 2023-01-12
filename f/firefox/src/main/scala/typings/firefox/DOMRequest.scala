package typings.firefox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMRequest[T] extends StObject {
  
  var error: js.Error
  
  var onerror: js.Function
  
  var onsuccess: js.Function
  
  var readyState: String
  
  // "done" or "pending"
  var result: T
}
object DOMRequest {
  
  inline def apply[T](error: js.Error, onerror: js.Function, onsuccess: js.Function, readyState: String, result: T): DOMRequest[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onsuccess = onsuccess.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRequest[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMRequest[?], T] (val x: Self & DOMRequest[T]) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setOnerror(value: js.Function): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnsuccess(value: js.Function): Self = StObject.set(x, "onsuccess", value.asInstanceOf[js.Any])
    
    inline def setReadyState(value: String): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
