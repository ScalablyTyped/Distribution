package typings.firebaseFirestore.distLiteInternalMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distLiteInternalMod.Timestamp2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDelete extends StObject {
  
  var document: js.UndefOr[String] = js.undefined
  
  var readTime: js.UndefOr[Timestamp2] = js.undefined
  
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object DocumentDelete {
  
  inline def apply(): DocumentDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentDelete] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setReadTime(value: Timestamp2): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    inline def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    inline def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value*))
  }
}
