package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFileOptions extends StObject {
  
  var remove: js.UndefOr[Boolean] = js.undefined
  
  var revert: js.UndefOr[Boolean] = js.undefined
}
object RemoveFileOptions {
  
  inline def apply(): RemoveFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveFileOptions] (val x: Self) extends AnyVal {
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    inline def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
  }
}
