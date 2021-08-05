package typings.expressValidator.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckFalsy extends StObject {
  
  var checkFalsy: js.UndefOr[Boolean] = js.undefined
  
  var checkNull: js.UndefOr[Boolean] = js.undefined
}
object CheckFalsy {
  
  inline def apply(): CheckFalsy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckFalsy]
  }
  
  extension [Self <: CheckFalsy](x: Self) {
    
    inline def setCheckFalsy(value: Boolean): Self = StObject.set(x, "checkFalsy", value.asInstanceOf[js.Any])
    
    inline def setCheckFalsyUndefined: Self = StObject.set(x, "checkFalsy", js.undefined)
    
    inline def setCheckNull(value: Boolean): Self = StObject.set(x, "checkNull", value.asInstanceOf[js.Any])
    
    inline def setCheckNullUndefined: Self = StObject.set(x, "checkNull", js.undefined)
  }
}
