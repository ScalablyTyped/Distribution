package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  var added: js.UndefOr[js.Array[Document]] = js.undefined
  
  var removed: js.UndefOr[js.Array[Document]] = js.undefined
}
object `50` {
  
  inline def apply(): `50` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`50`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `50`] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: js.Array[Document]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    inline def setAddedVarargs(value: Document*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setRemoved(value: js.Array[Document]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: Document*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
