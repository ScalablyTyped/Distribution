package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchGetDocumentsRequest. */
trait IBatchGetDocumentsRequest extends StObject {
  
  /** BatchGetDocumentsRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** BatchGetDocumentsRequest documents */
  var documents: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** BatchGetDocumentsRequest mask */
  var mask: js.UndefOr[IDocumentMask | Null] = js.undefined
  
  /** BatchGetDocumentsRequest newTransaction */
  var newTransaction: js.UndefOr[ITransactionOptions | Null] = js.undefined
  
  /** BatchGetDocumentsRequest readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** BatchGetDocumentsRequest transaction */
  var transaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IBatchGetDocumentsRequest {
  
  inline def apply(): IBatchGetDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchGetDocumentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBatchGetDocumentsRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsNull: Self = StObject.set(x, "documents", null)
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setMask(value: IDocumentMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskNull: Self = StObject.set(x, "mask", null)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setNewTransaction(value: ITransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    inline def setNewTransactionNull: Self = StObject.set(x, "newTransaction", null)
    
    inline def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
