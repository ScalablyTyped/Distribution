package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DocumentRemove. */
trait IDocumentRemove extends StObject {
  
  /** DocumentRemove document */
  var document: js.UndefOr[String | Null] = js.undefined
  
  /** DocumentRemove readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** DocumentRemove removedTargetIds */
  var removedTargetIds: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object IDocumentRemove {
  
  inline def apply(): IDocumentRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentRemove]
  }
  
  extension [Self <: IDocumentRemove](x: Self) {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    inline def setRemovedTargetIdsNull: Self = StObject.set(x, "removedTargetIds", null)
    
    inline def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    inline def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value*))
  }
}
