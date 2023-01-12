package typings.firebaseFirestore.distLitePrivateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDocumentsResponse extends StObject {
  
  var documents: js.UndefOr[js.Array[Document]] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDocumentsResponse {
  
  inline def apply(): ListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDocumentsResponse] (val x: Self) extends AnyVal {
    
    inline def setDocuments(value: js.Array[Document]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: Document*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
