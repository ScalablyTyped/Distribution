package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomQueryParams extends StObject {
  
  var customQueryParams: js.UndefOr[Any] = js.undefined
  
  var expand: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var requireTotalCount: js.UndefOr[Boolean] = js.undefined
}
object CustomQueryParams {
  
  inline def apply(): CustomQueryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomQueryParams]
  }
  
  extension [Self <: CustomQueryParams](x: Self) {
    
    inline def setCustomQueryParams(value: Any): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    
    inline def setCustomQueryParamsUndefined: Self = StObject.set(x, "customQueryParams", js.undefined)
    
    inline def setExpand(value: String | js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value*))
    
    inline def setRequireTotalCount(value: Boolean): Self = StObject.set(x, "requireTotalCount", value.asInstanceOf[js.Any])
    
    inline def setRequireTotalCountUndefined: Self = StObject.set(x, "requireTotalCount", js.undefined)
  }
}
