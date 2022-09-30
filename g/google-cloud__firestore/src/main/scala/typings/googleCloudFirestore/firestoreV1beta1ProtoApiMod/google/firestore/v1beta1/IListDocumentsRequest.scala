package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListDocumentsRequest. */
trait IListDocumentsRequest extends StObject {
  
  /** ListDocumentsRequest collectionId */
  var collectionId: js.UndefOr[String | Null] = js.undefined
  
  /** ListDocumentsRequest mask */
  var mask: js.UndefOr[IDocumentMask | Null] = js.undefined
  
  /** ListDocumentsRequest orderBy */
  var orderBy: js.UndefOr[String | Null] = js.undefined
  
  /** ListDocumentsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListDocumentsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListDocumentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** ListDocumentsRequest readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** ListDocumentsRequest showMissing */
  var showMissing: js.UndefOr[Boolean | Null] = js.undefined
  
  /** ListDocumentsRequest transaction */
  var transaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IListDocumentsRequest {
  
  inline def apply(): IListDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListDocumentsRequest]
  }
  
  extension [Self <: IListDocumentsRequest](x: Self) {
    
    inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdNull: Self = StObject.set(x, "collectionId", null)
    
    inline def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
    
    inline def setMask(value: IDocumentMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskNull: Self = StObject.set(x, "mask", null)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setShowMissing(value: Boolean): Self = StObject.set(x, "showMissing", value.asInstanceOf[js.Any])
    
    inline def setShowMissingNull: Self = StObject.set(x, "showMissing", null)
    
    inline def setShowMissingUndefined: Self = StObject.set(x, "showMissing", js.undefined)
    
    inline def setTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
