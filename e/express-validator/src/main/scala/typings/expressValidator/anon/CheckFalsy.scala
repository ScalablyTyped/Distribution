package typings.expressValidator.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckFalsy extends StObject {
  
  var checkFalsy: js.UndefOr[Boolean] = js.native
  
  var checkNull: js.UndefOr[Boolean] = js.native
}
object CheckFalsy {
  
  @scala.inline
  def apply(): CheckFalsy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckFalsy]
  }
  
  @scala.inline
  implicit class CheckFalsyMutableBuilder[Self <: CheckFalsy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckFalsy(value: Boolean): Self = StObject.set(x, "checkFalsy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckFalsyUndefined: Self = StObject.set(x, "checkFalsy", js.undefined)
    
    @scala.inline
    def setCheckNull(value: Boolean): Self = StObject.set(x, "checkNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckNullUndefined: Self = StObject.set(x, "checkNull", js.undefined)
  }
}
