package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedRemoved extends StObject {
  
  var added: js.UndefOr[js.Array[String]] = js.undefined
  
  var removed: js.UndefOr[js.Array[String]] = js.undefined
}
object AddedRemoved {
  
  inline def apply(): AddedRemoved = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddedRemoved]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddedRemoved] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: js.Array[String]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    inline def setAddedVarargs(value: String*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setRemoved(value: js.Array[String]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setRemovedVarargs(value: String*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
