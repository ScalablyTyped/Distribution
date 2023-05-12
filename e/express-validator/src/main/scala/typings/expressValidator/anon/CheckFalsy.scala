package typings.expressValidator.anon

import typings.expressValidator.srcContextMod.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckFalsy extends StObject {
  
  /**
    * @deprecated use `values` instead
    */
  var checkFalsy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated use `values` instead
    */
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var values: js.UndefOr[Optional] = js.undefined
}
object CheckFalsy {
  
  inline def apply(): CheckFalsy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckFalsy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckFalsy] (val x: Self) extends AnyVal {
    
    inline def setCheckFalsy(value: Boolean): Self = StObject.set(x, "checkFalsy", value.asInstanceOf[js.Any])
    
    inline def setCheckFalsyUndefined: Self = StObject.set(x, "checkFalsy", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setValues(value: Optional): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
