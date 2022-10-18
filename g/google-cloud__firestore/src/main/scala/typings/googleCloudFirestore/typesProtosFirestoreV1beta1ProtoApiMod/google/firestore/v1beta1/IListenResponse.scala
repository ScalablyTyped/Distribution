package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListenResponse. */
trait IListenResponse extends StObject {
  
  /** ListenResponse documentChange */
  var documentChange: js.UndefOr[IDocumentChange | Null] = js.undefined
  
  /** ListenResponse documentDelete */
  var documentDelete: js.UndefOr[IDocumentDelete | Null] = js.undefined
  
  /** ListenResponse documentRemove */
  var documentRemove: js.UndefOr[IDocumentRemove | Null] = js.undefined
  
  /** ListenResponse filter */
  var filter: js.UndefOr[IExistenceFilter | Null] = js.undefined
  
  /** ListenResponse targetChange */
  var targetChange: js.UndefOr[ITargetChange | Null] = js.undefined
}
object IListenResponse {
  
  inline def apply(): IListenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListenResponse]
  }
  
  extension [Self <: IListenResponse](x: Self) {
    
    inline def setDocumentChange(value: IDocumentChange): Self = StObject.set(x, "documentChange", value.asInstanceOf[js.Any])
    
    inline def setDocumentChangeNull: Self = StObject.set(x, "documentChange", null)
    
    inline def setDocumentChangeUndefined: Self = StObject.set(x, "documentChange", js.undefined)
    
    inline def setDocumentDelete(value: IDocumentDelete): Self = StObject.set(x, "documentDelete", value.asInstanceOf[js.Any])
    
    inline def setDocumentDeleteNull: Self = StObject.set(x, "documentDelete", null)
    
    inline def setDocumentDeleteUndefined: Self = StObject.set(x, "documentDelete", js.undefined)
    
    inline def setDocumentRemove(value: IDocumentRemove): Self = StObject.set(x, "documentRemove", value.asInstanceOf[js.Any])
    
    inline def setDocumentRemoveNull: Self = StObject.set(x, "documentRemove", null)
    
    inline def setDocumentRemoveUndefined: Self = StObject.set(x, "documentRemove", js.undefined)
    
    inline def setFilter(value: IExistenceFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setTargetChange(value: ITargetChange): Self = StObject.set(x, "targetChange", value.asInstanceOf[js.Any])
    
    inline def setTargetChangeNull: Self = StObject.set(x, "targetChange", null)
    
    inline def setTargetChangeUndefined: Self = StObject.set(x, "targetChange", js.undefined)
  }
}
