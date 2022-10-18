package typings.firebaseFirestore.distInternalMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distInternalMod.Timestamp2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteResult extends StObject {
  
  var transformResults: js.UndefOr[js.Array[Value]] = js.undefined
  
  var updateTime: js.UndefOr[Timestamp2] = js.undefined
}
object WriteResult {
  
  inline def apply(): WriteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteResult]
  }
  
  extension [Self <: WriteResult](x: Self) {
    
    inline def setTransformResults(value: js.Array[Value]): Self = StObject.set(x, "transformResults", value.asInstanceOf[js.Any])
    
    inline def setTransformResultsUndefined: Self = StObject.set(x, "transformResults", js.undefined)
    
    inline def setTransformResultsVarargs(value: Value*): Self = StObject.set(x, "transformResults", js.Array(value*))
    
    inline def setUpdateTime(value: Timestamp2): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
