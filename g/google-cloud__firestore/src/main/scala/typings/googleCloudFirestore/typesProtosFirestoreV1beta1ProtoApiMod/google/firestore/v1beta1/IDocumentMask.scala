package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DocumentMask. */
trait IDocumentMask extends StObject {
  
  /** DocumentMask fieldPaths */
  var fieldPaths: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IDocumentMask {
  
  inline def apply(): IDocumentMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentMask]
  }
  
  extension [Self <: IDocumentMask](x: Self) {
    
    inline def setFieldPaths(value: js.Array[String]): Self = StObject.set(x, "fieldPaths", value.asInstanceOf[js.Any])
    
    inline def setFieldPathsNull: Self = StObject.set(x, "fieldPaths", null)
    
    inline def setFieldPathsUndefined: Self = StObject.set(x, "fieldPaths", js.undefined)
    
    inline def setFieldPathsVarargs(value: String*): Self = StObject.set(x, "fieldPaths", js.Array(value*))
  }
}
