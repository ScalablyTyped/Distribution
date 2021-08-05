package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateDocumentRequest. */
trait ICreateDocumentRequest extends StObject {
  
  /** CreateDocumentRequest document */
  var document: js.UndefOr[IDocument | Null] = js.undefined
  
  /** CreateDocumentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateDocumentRequest {
  
  inline def apply(): ICreateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateDocumentRequest]
  }
  
  extension [Self <: ICreateDocumentRequest](x: Self) {
    
    inline def setDocument(value: IDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentNull: Self = StObject.set(x, "document", null)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
