package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoSetModify extends StObject {
  
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  
  var noSetModify: js.UndefOr[Boolean] = js.native
  
  var noSetReadOnly: js.UndefOr[Boolean] = js.native
  
  var noSetReadPlusActivity: js.UndefOr[Boolean] = js.native
}
object NoSetModify {
  
  @scala.inline
  def apply(): NoSetModify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoSetModify]
  }
  
  @scala.inline
  implicit class NoSetModifyMutableBuilder[Self <: NoSetModify] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoSetFullAccess(value: Boolean): Self = StObject.set(x, "noSetFullAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSetFullAccessUndefined: Self = StObject.set(x, "noSetFullAccess", js.undefined)
    
    @scala.inline
    def setNoSetModify(value: Boolean): Self = StObject.set(x, "noSetModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSetModifyUndefined: Self = StObject.set(x, "noSetModify", js.undefined)
    
    @scala.inline
    def setNoSetReadOnly(value: Boolean): Self = StObject.set(x, "noSetReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSetReadOnlyUndefined: Self = StObject.set(x, "noSetReadOnly", js.undefined)
    
    @scala.inline
    def setNoSetReadPlusActivity(value: Boolean): Self = StObject.set(x, "noSetReadPlusActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSetReadPlusActivityUndefined: Self = StObject.set(x, "noSetReadPlusActivity", js.undefined)
  }
}
