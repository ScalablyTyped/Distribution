package typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.IndexFieldMode
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
  
  extension [Self <: IndexField](x: Self) {
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    inline def setMode(value: IndexFieldMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
