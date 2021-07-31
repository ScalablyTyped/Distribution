package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFileOptions extends StObject {
  
  var remove: js.UndefOr[Boolean] = js.undefined
  
  var revert: js.UndefOr[Boolean] = js.undefined
}
object RemoveFileOptions {
  
  @scala.inline
  def apply(): RemoveFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFileOptions]
  }
  
  @scala.inline
  implicit class RemoveFileOptionsMutableBuilder[Self <: RemoveFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
  }
}
