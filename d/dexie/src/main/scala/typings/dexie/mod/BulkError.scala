package typings.dexie.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkError
  extends StObject
     with DexieError {
  
  var failures: js.Array[js.Error]
  
  var failuresByPos: NumberDictionary[js.Error]
}
object BulkError {
  
  inline def apply(
    failures: js.Array[js.Error],
    failuresByPos: NumberDictionary[js.Error],
    inner: Any,
    message: String,
    name: String,
    stack: String
  ): BulkError = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], failuresByPos = failuresByPos.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkError]
  }
  
  extension [Self <: BulkError](x: Self) {
    
    inline def setFailures(value: js.Array[js.Error]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresByPos(value: NumberDictionary[js.Error]): Self = StObject.set(x, "failuresByPos", value.asInstanceOf[js.Any])
    
    inline def setFailuresVarargs(value: js.Error*): Self = StObject.set(x, "failures", js.Array(value*))
  }
}
