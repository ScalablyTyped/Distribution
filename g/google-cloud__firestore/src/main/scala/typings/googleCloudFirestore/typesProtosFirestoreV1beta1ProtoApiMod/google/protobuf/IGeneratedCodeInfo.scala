package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GeneratedCodeInfo. */
trait IGeneratedCodeInfo extends StObject {
  
  /** GeneratedCodeInfo annotation */
  var annotation: js.UndefOr[js.Array[IAnnotation] | Null] = js.undefined
}
object IGeneratedCodeInfo {
  
  inline def apply(): IGeneratedCodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeneratedCodeInfo]
  }
  
  extension [Self <: IGeneratedCodeInfo](x: Self) {
    
    inline def setAnnotation(value: js.Array[IAnnotation]): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationNull: Self = StObject.set(x, "annotation", null)
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    inline def setAnnotationVarargs(value: IAnnotation*): Self = StObject.set(x, "annotation", js.Array(value*))
  }
}
