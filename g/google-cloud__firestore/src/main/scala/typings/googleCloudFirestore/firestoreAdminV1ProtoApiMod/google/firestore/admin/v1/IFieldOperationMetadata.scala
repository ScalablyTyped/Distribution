package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FieldOperationMetadata.IIndexConfigDelta
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FieldOperationMetadata. */
trait IFieldOperationMetadata extends StObject {
  
  /** FieldOperationMetadata endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** FieldOperationMetadata field */
  var field: js.UndefOr[String | Null] = js.undefined
  
  /** FieldOperationMetadata indexConfigDeltas */
  var indexConfigDeltas: js.UndefOr[js.Array[IIndexConfigDelta] | Null] = js.undefined
  
  /** FieldOperationMetadata progressBytes */
  var progressBytes: js.UndefOr[IProgress | Null] = js.undefined
  
  /** FieldOperationMetadata progressDocuments */
  var progressDocuments: js.UndefOr[IProgress | Null] = js.undefined
  
  /** FieldOperationMetadata startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** FieldOperationMetadata state */
  var state: js.UndefOr[OperationState | Null] = js.undefined
}
object IFieldOperationMetadata {
  
  inline def apply(): IFieldOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldOperationMetadata]
  }
  
  extension [Self <: IFieldOperationMetadata](x: Self) {
    
    inline def setEndTime(value: ITimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setIndexConfigDeltas(value: js.Array[IIndexConfigDelta]): Self = StObject.set(x, "indexConfigDeltas", value.asInstanceOf[js.Any])
    
    inline def setIndexConfigDeltasNull: Self = StObject.set(x, "indexConfigDeltas", null)
    
    inline def setIndexConfigDeltasUndefined: Self = StObject.set(x, "indexConfigDeltas", js.undefined)
    
    inline def setIndexConfigDeltasVarargs(value: IIndexConfigDelta*): Self = StObject.set(x, "indexConfigDeltas", js.Array(value*))
    
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
