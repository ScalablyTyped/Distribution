package typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenResponse extends StObject {
  
  var documentChange: js.UndefOr[DocumentChange] = js.undefined
  
  var documentDelete: js.UndefOr[DocumentDelete] = js.undefined
  
  var documentRemove: js.UndefOr[DocumentRemove] = js.undefined
  
  var filter: js.UndefOr[ExistenceFilter] = js.undefined
  
  var targetChange: js.UndefOr[TargetChange] = js.undefined
}
object ListenResponse {
  
  inline def apply(): ListenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenResponse]
  }
  
  extension [Self <: ListenResponse](x: Self) {
    
    inline def setDocumentChange(value: DocumentChange): Self = StObject.set(x, "documentChange", value.asInstanceOf[js.Any])
    
    inline def setDocumentChangeUndefined: Self = StObject.set(x, "documentChange", js.undefined)
    
    inline def setDocumentDelete(value: DocumentDelete): Self = StObject.set(x, "documentDelete", value.asInstanceOf[js.Any])
    
    inline def setDocumentDeleteUndefined: Self = StObject.set(x, "documentDelete", js.undefined)
    
    inline def setDocumentRemove(value: DocumentRemove): Self = StObject.set(x, "documentRemove", value.asInstanceOf[js.Any])
    
    inline def setDocumentRemoveUndefined: Self = StObject.set(x, "documentRemove", js.undefined)
    
    inline def setFilter(value: ExistenceFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setTargetChange(value: TargetChange): Self = StObject.set(x, "targetChange", value.asInstanceOf[js.Any])
    
    inline def setTargetChangeUndefined: Self = StObject.set(x, "targetChange", js.undefined)
  }
}
