package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var affects: js.UndefOr[
    js.Array[typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query]
  ] = js.undefined
  
  var removed: js.UndefOr[
    js.Array[typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query]
  ] = js.undefined
}
object `34` {
  
  inline def apply(): `34` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setAffects(value: js.Array[typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query]): Self = StObject.set(x, "affects", value.asInstanceOf[js.Any])
    
    inline def setAffectsUndefined: Self = StObject.set(x, "affects", js.undefined)
    
    inline def setAffectsVarargs(value: typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query*): Self = StObject.set(x, "affects", js.Array(value*))
    
    inline def setRemoved(value: js.Array[typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
