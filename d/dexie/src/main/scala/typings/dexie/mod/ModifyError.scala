package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyError
  extends StObject
     with DexieError {
  
  var failedKeys: IndexableTypeArrayReadonly
  
  var failures: js.Array[Any]
  
  var successCount: Double
}
object ModifyError {
  
  inline def apply(
    failedKeys: IndexableTypeArrayReadonly,
    failures: js.Array[Any],
    inner: Any,
    message: String,
    name: String,
    stack: String,
    successCount: Double
  ): ModifyError = {
    val __obj = js.Dynamic.literal(failedKeys = failedKeys.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyError] (val x: Self) extends AnyVal {
    
    inline def setFailedKeys(value: IndexableTypeArrayReadonly): Self = StObject.set(x, "failedKeys", value.asInstanceOf[js.Any])
    
    inline def setFailedKeysVarargs(value: IndexableTypePart*): Self = StObject.set(x, "failedKeys", js.Array(value*))
    
    inline def setFailures(value: js.Array[Any]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresVarargs(value: Any*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
