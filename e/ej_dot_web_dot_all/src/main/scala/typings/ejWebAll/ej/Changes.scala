package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changes extends StObject {
  
  var added: js.UndefOr[js.Array[_]] = js.native
  
  var changed: js.UndefOr[js.Array[_]] = js.native
  
  var deleted: js.UndefOr[js.Array[_]] = js.native
}
object Changes {
  
  @scala.inline
  def apply(): Changes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Changes]
  }
  
  @scala.inline
  implicit class ChangesMutableBuilder[Self <: Changes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: js.Array[_]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    @scala.inline
    def setAddedVarargs(value: js.Any*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    @scala.inline
    def setChanged(value: js.Array[_]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    @scala.inline
    def setChangedVarargs(value: js.Any*): Self = StObject.set(x, "changed", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: js.Array[_]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDeletedVarargs(value: js.Any*): Self = StObject.set(x, "deleted", js.Array(value :_*))
  }
}
