package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an IndexOperationMetadata. */
trait IIndexOperationMetadata extends StObject {
  
  /** IndexOperationMetadata endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** IndexOperationMetadata index */
  var index: js.UndefOr[String | Null] = js.undefined
  
  /** IndexOperationMetadata progressBytes */
  var progressBytes: js.UndefOr[IProgress | Null] = js.undefined
  
  /** IndexOperationMetadata progressDocuments */
  var progressDocuments: js.UndefOr[IProgress | Null] = js.undefined
  
  /** IndexOperationMetadata startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** IndexOperationMetadata state */
  var state: js.UndefOr[OperationState | Null] = js.undefined
}
object IIndexOperationMetadata {
  
  inline def apply(): IIndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndexOperationMetadata]
  }
  
  extension [Self <: IIndexOperationMetadata](x: Self) {
    
    inline def setEndTime(value: ITimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setProgressBytes(value: IProgress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    inline def setProgressBytesNull: Self = StObject.set(x, "progressBytes", null)
    
    inline def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    inline def setProgressDocuments(value: IProgress): Self = StObject.set(x, "progressDocuments", value.asInstanceOf[js.Any])
    
    inline def setProgressDocumentsNull: Self = StObject.set(x, "progressDocuments", null)
    
    inline def setProgressDocumentsUndefined: Self = StObject.set(x, "progressDocuments", js.undefined)
    
    inline def setStartTime(value: ITimestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: OperationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
