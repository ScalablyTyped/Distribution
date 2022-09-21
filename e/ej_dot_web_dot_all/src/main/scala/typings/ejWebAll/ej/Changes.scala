package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changes extends StObject {
  
  var added: js.UndefOr[js.Array[Any]] = js.undefined
  
  var changed: js.UndefOr[js.Array[Any]] = js.undefined
  
  var deleted: js.UndefOr[js.Array[Any]] = js.undefined
}
object Changes {
  
  inline def apply(): Changes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Changes]
  }
  
  extension [Self <: Changes](x: Self) {
    
    inline def setAdded(value: js.Array[Any]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    inline def setAddedVarargs(value: Any*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setChanged(value: js.Array[Any]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    inline def setChangedVarargs(value: Any*): Self = StObject.set(x, "changed", js.Array(value*))
    
    inline def setDeleted(value: js.Array[Any]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDeletedVarargs(value: Any*): Self = StObject.set(x, "deleted", js.Array(value*))
  }
}
