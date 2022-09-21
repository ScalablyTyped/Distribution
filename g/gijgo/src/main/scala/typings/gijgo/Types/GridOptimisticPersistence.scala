package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridOptimisticPersistence extends StObject {
  
  var localStorage: js.Array[String]
  
  var sessionStorage: js.Array[String]
}
object GridOptimisticPersistence {
  
  inline def apply(localStorage: js.Array[String], sessionStorage: js.Array[String]): GridOptimisticPersistence = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any], sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptimisticPersistence]
  }
  
  extension [Self <: GridOptimisticPersistence](x: Self) {
    
    inline def setLocalStorage(value: js.Array[String]): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageVarargs(value: String*): Self = StObject.set(x, "localStorage", js.Array(value*))
    
    inline def setSessionStorage(value: js.Array[String]): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
    
    inline def setSessionStorageVarargs(value: String*): Self = StObject.set(x, "sessionStorage", js.Array(value*))
  }
}
