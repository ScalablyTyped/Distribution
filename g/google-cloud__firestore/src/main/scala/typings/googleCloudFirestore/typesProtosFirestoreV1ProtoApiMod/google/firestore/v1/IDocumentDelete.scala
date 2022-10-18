package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DocumentDelete. */
trait IDocumentDelete extends StObject {
  
  /** DocumentDelete document */
  var document: js.UndefOr[String | Null] = js.undefined
  
  /** DocumentDelete readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** DocumentDelete removedTargetIds */
  var removedTargetIds: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object IDocumentDelete {
  
  inline def apply(): IDocumentDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentDelete]
  }
  
  extension [Self <: IDocumentDelete](x: Self) {
    
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
