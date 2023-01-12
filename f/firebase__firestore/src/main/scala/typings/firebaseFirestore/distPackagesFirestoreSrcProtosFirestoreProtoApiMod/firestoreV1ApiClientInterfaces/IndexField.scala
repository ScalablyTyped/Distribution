package typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexField extends StObject {
  
  var fieldPath: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[IndexFieldMode] = js.undefined
}
object IndexField {
  
  inline def apply(): IndexField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexField] (val x: Self) extends AnyVal {
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    inline def setMode(value: IndexFieldMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
