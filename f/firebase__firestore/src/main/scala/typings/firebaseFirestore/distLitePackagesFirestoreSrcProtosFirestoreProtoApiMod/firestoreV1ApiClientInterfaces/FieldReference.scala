package typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldReference extends StObject {
  
  var fieldPath: js.UndefOr[String] = js.undefined
}
object FieldReference {
  
  inline def apply(): FieldReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldReference]
  }
  
  extension [Self <: FieldReference](x: Self) {
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
  }
}
