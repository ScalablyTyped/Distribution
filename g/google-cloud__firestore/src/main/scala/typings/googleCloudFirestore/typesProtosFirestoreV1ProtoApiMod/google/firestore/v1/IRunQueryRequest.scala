package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RunQueryRequest. */
trait IRunQueryRequest extends StObject {
  
  /** RunQueryRequest newTransaction */
  var newTransaction: js.UndefOr[ITransactionOptions | Null] = js.undefined
  
  /** RunQueryRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** RunQueryRequest readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** RunQueryRequest structuredQuery */
  var structuredQuery: js.UndefOr[IStructuredQuery | Null] = js.undefined
  
  /** RunQueryRequest transaction */
  var transaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IRunQueryRequest {
  
  inline def apply(): IRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRunQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRunQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setNewTransaction(value: ITransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    inline def setNewTransactionNull: Self = StObject.set(x, "newTransaction", null)
    
    inline def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setStructuredQuery(value: IStructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    inline def setStructuredQueryNull: Self = StObject.set(x, "structuredQuery", null)
    
    inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
    
    inline def setTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
