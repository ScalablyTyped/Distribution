package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchGetDocumentsResponse. */
trait IBatchGetDocumentsResponse extends StObject {
  
  /** BatchGetDocumentsResponse found */
  var found: js.UndefOr[IDocument | Null] = js.undefined
  
  /** BatchGetDocumentsResponse missing */
  var missing: js.UndefOr[String | Null] = js.undefined
  
  /** BatchGetDocumentsResponse readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** BatchGetDocumentsResponse transaction */
  var transaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IBatchGetDocumentsResponse {
  
  inline def apply(): IBatchGetDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchGetDocumentsResponse]
  }
  
  extension [Self <: IBatchGetDocumentsResponse](x: Self) {
    
    inline def setFound(value: IDocument): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setFoundNull: Self = StObject.set(x, "found", null)
    
    inline def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingNull: Self = StObject.set(x, "missing", null)
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
