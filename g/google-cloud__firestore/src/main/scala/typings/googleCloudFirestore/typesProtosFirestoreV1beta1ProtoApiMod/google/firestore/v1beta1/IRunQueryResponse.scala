package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RunQueryResponse. */
trait IRunQueryResponse extends StObject {
  
  /** RunQueryResponse document */
  var document: js.UndefOr[IDocument | Null] = js.undefined
  
  /** RunQueryResponse readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** RunQueryResponse skippedResults */
  var skippedResults: js.UndefOr[Double | Null] = js.undefined
  
  /** RunQueryResponse transaction */
  var transaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IRunQueryResponse {
  
  inline def apply(): IRunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRunQueryResponse]
  }
  
  extension [Self <: IRunQueryResponse](x: Self) {
    
    inline def setDocument(value: IDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setSkippedResults(value: Double): Self = StObject.set(x, "skippedResults", value.asInstanceOf[js.Any])
    
    inline def setSkippedResultsNull: Self = StObject.set(x, "skippedResults", null)
    
    inline def setSkippedResultsUndefined: Self = StObject.set(x, "skippedResults", js.undefined)
    
    inline def setTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
