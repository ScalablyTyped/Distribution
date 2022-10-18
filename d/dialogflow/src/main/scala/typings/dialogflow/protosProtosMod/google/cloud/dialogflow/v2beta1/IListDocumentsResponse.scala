package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListDocumentsResponse. */
trait IListDocumentsResponse extends StObject {
  
  /** ListDocumentsResponse documents */
  var documents: js.UndefOr[js.Array[IDocument] | Null] = js.undefined
  
  /** ListDocumentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListDocumentsResponse {
  
  inline def apply(): IListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListDocumentsResponse]
  }
  
  extension [Self <: IListDocumentsResponse](x: Self) {
    
    inline def setDocuments(value: js.Array[IDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsNull: Self = StObject.set(x, "documents", null)
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: IDocument*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
