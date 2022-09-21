package typings.firebaseFirestore.privateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistenceFilter extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var targetId: js.UndefOr[Double] = js.undefined
}
object ExistenceFilter {
  
  inline def apply(): ExistenceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExistenceFilter]
  }
  
  extension [Self <: ExistenceFilter](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
