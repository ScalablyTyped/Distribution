package typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentsTarget extends StObject {
  
  var documents: js.UndefOr[js.Array[String]] = js.undefined
}
object DocumentsTarget {
  
  inline def apply(): DocumentsTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentsTarget]
  }
  
  extension [Self <: DocumentsTarget](x: Self) {
    
    inline def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value*))
  }
}
