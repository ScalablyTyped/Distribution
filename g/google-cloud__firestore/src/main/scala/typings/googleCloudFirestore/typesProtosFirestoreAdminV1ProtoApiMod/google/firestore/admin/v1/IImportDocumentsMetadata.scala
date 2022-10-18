package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ImportDocumentsMetadata. */
trait IImportDocumentsMetadata extends StObject {
  
  /** ImportDocumentsMetadata collectionIds */
  var collectionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ImportDocumentsMetadata endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** ImportDocumentsMetadata inputUriPrefix */
  var inputUriPrefix: js.UndefOr[String | Null] = js.undefined
  
  /** ImportDocumentsMetadata operationState */
  var operationState: js.UndefOr[OperationState | Null] = js.undefined
  
  /** ImportDocumentsMetadata progressBytes */
  var progressBytes: js.UndefOr[IProgress | Null] = js.undefined
  
  /** ImportDocumentsMetadata progressDocuments */
  var progressDocuments: js.UndefOr[IProgress | Null] = js.undefined
  
  /** ImportDocumentsMetadata startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IImportDocumentsMetadata {
  
  inline def apply(): IImportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImportDocumentsMetadata]
  }
  
  extension [Self <: IImportDocumentsMetadata](x: Self) {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsNull: Self = StObject.set(x, "collectionIds", null)
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value*))
    
    inline def setEndTime(value: ITimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInputUriPrefix(value: String): Self = StObject.set(x, "inputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setInputUriPrefixNull: Self = StObject.set(x, "inputUriPrefix", null)
    
    inline def setInputUriPrefixUndefined: Self = StObject.set(x, "inputUriPrefix", js.undefined)
    
    inline def setOperationState(value: OperationState): Self = StObject.set(x, "operationState", value.asInstanceOf[js.Any])
    
    inline def setOperationStateNull: Self = StObject.set(x, "operationState", null)
    
    inline def setOperationStateUndefined: Self = StObject.set(x, "operationState", js.undefined)
    
    inline def setProgressBytes(value: IProgress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    inline def setProgressBytesNull: Self = StObject.set(x, "progressBytes", null)
    
    inline def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    inline def setProgressDocuments(value: IProgress): Self = StObject.set(x, "progressDocuments", value.asInstanceOf[js.Any])
    
    inline def setProgressDocumentsNull: Self = StObject.set(x, "progressDocuments", null)
    
    inline def setProgressDocumentsUndefined: Self = StObject.set(x, "progressDocuments", js.undefined)
    
    inline def setStartTime(value: ITimestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
