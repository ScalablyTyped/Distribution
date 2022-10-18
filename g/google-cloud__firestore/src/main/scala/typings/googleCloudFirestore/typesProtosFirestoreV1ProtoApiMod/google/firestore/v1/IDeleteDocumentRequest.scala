package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteDocumentRequest. */
trait IDeleteDocumentRequest extends StObject {
  
  /** DeleteDocumentRequest currentDocument */
  var currentDocument: js.UndefOr[IPrecondition | Null] = js.undefined
  
  /** DeleteDocumentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteDocumentRequest {
  
  inline def apply(): IDeleteDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteDocumentRequest]
  }
  
  extension [Self <: IDeleteDocumentRequest](x: Self) {
    
    inline def setCurrentDocument(value: IPrecondition): Self = StObject.set(x, "currentDocument", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentNull: Self = StObject.set(x, "currentDocument", null)
    
    inline def setCurrentDocumentUndefined: Self = StObject.set(x, "currentDocument", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
