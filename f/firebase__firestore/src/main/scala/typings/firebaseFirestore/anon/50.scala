package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  var affects: js.UndefOr[js.Array[typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query]] = js.undefined
  
  var removed: js.UndefOr[js.Array[typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query]] = js.undefined
}
object `50` {
  
  inline def apply(): `50` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`50`]
  }
  
  extension [Self <: `50`](x: Self) {
    
    inline def setAffects(value: js.Array[typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query]): Self = StObject.set(x, "affects", value.asInstanceOf[js.Any])
    
    inline def setAffectsUndefined: Self = StObject.set(x, "affects", js.undefined)
    
    inline def setAffectsVarargs(value: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query*): Self = StObject.set(x, "affects", js.Array(value*))
    
    inline def setRemoved(value: js.Array[typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
