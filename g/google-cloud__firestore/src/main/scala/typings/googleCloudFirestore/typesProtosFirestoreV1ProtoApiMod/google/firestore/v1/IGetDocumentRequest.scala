package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetDocumentRequest. */
trait IGetDocumentRequest extends StObject {
  
  /** GetDocumentRequest mask */
  var mask: js.UndefOr[IDocumentMask | Null] = js.undefined
  
  /** GetDocumentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** GetDocumentRequest readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** GetDocumentRequest transaction */
  var transaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IGetDocumentRequest {
  
  inline def apply(): IGetDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetDocumentRequest]
  }
  
  extension [Self <: IGetDocumentRequest](x: Self) {
    
    inline def setMask(value: IDocumentMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskNull: Self = StObject.set(x, "mask", null)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
