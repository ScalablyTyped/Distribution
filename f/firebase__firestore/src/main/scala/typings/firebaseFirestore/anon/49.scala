package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var affects: js.UndefOr[js.Array[typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query]] = js.undefined
  
  var removed: js.UndefOr[js.Array[typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query]] = js.undefined
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `49`] (val x: Self) extends AnyVal {
    
    inline def setAffects(value: js.Array[typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query]): Self = StObject.set(x, "affects", value.asInstanceOf[js.Any])
    
    inline def setAffectsUndefined: Self = StObject.set(x, "affects", js.undefined)
    
    inline def setAffectsVarargs(value: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query*): Self = StObject.set(x, "affects", js.Array(value*))
    
    inline def setRemoved(value: js.Array[typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
