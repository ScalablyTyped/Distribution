package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridOptimisticPersistence extends StObject {
  
  var localStorage: js.Array[String]
  
  var sessionStorage: js.Array[String]
}
object GridOptimisticPersistence {
  
  @scala.inline
  def apply(localStorage: js.Array[String], sessionStorage: js.Array[String]): GridOptimisticPersistence = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any], sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptimisticPersistence]
  }
  
  @scala.inline
  implicit class GridOptimisticPersistenceMutableBuilder[Self <: GridOptimisticPersistence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalStorage(value: js.Array[String]): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalStorageVarargs(value: String*): Self = StObject.set(x, "localStorage", js.Array(value :_*))
    
    @scala.inline
    def setSessionStorage(value: js.Array[String]): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionStorageVarargs(value: String*): Self = StObject.set(x, "sessionStorage", js.Array(value :_*))
  }
}
