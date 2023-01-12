package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffectsRemoved extends StObject {
  
  var affects: js.UndefOr[js.Array[typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query]] = js.undefined
  
  var removed: js.UndefOr[js.Array[typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query]] = js.undefined
}
object AffectsRemoved {
  
  inline def apply(): AffectsRemoved = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffectsRemoved]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AffectsRemoved] (val x: Self) extends AnyVal {
    
    inline def setAffects(value: js.Array[typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query]): Self = StObject.set(x, "affects", value.asInstanceOf[js.Any])
    
    inline def setAffectsUndefined: Self = StObject.set(x, "affects", js.undefined)
    
    inline def setAffectsVarargs(value: typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query*): Self = StObject.set(x, "affects", js.Array(value*))
    
    inline def setRemoved(value: js.Array[typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
