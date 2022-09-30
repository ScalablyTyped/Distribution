package typings.dexie.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreMutateResponse extends StObject {
  
  var failures: NumberDictionary[js.Error]
  
  var lastResult: Any
  
  var numFailures: Double
  
  var results: js.UndefOr[js.Array[Any]] = js.undefined
}
object DBCoreMutateResponse {
  
  inline def apply(failures: NumberDictionary[js.Error], lastResult: Any, numFailures: Double): DBCoreMutateResponse = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], lastResult = lastResult.asInstanceOf[js.Any], numFailures = numFailures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateResponse]
  }
  
  extension [Self <: DBCoreMutateResponse](x: Self) {
    
    inline def setFailures(value: NumberDictionary[js.Error]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setLastResult(value: Any): Self = StObject.set(x, "lastResult", value.asInstanceOf[js.Any])
    
    inline def setNumFailures(value: Double): Self = StObject.set(x, "numFailures", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
