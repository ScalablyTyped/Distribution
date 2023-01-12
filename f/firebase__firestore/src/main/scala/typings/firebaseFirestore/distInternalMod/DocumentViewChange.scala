package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentViewChange extends StObject {
  
  var doc: Document2
  
  var `type`: ChangeType
}
object DocumentViewChange {
  
  inline def apply(doc: Document2, `type`: ChangeType): DocumentViewChange = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentViewChange] (val x: Self) extends AnyVal {
    
    inline def setDoc(value: Document2): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
