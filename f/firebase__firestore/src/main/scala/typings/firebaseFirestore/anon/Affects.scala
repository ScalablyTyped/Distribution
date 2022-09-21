package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Affects extends StObject {
  
  var affects: js.UndefOr[js.Array[typings.firebaseFirestore.queryMod.Query]] = js.undefined
  
  var removed: js.UndefOr[js.Array[typings.firebaseFirestore.queryMod.Query]] = js.undefined
}
object Affects {
  
  inline def apply(): Affects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Affects]
  }
  
  extension [Self <: Affects](x: Self) {
    
    inline def setAffects(value: js.Array[typings.firebaseFirestore.queryMod.Query]): Self = StObject.set(x, "affects", value.asInstanceOf[js.Any])
    
    inline def setAffectsUndefined: Self = StObject.set(x, "affects", js.undefined)
    
    inline def setAffectsVarargs(value: typings.firebaseFirestore.queryMod.Query*): Self = StObject.set(x, "affects", js.Array(value*))
    
    inline def setRemoved(value: js.Array[typings.firebaseFirestore.queryMod.Query]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: typings.firebaseFirestore.queryMod.Query*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
