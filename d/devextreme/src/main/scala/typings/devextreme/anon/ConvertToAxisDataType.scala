package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertToAxisDataType extends StObject {
  
  var checkTypeForAllData: js.UndefOr[Boolean] = js.undefined
  
  var convertToAxisDataType: js.UndefOr[Boolean] = js.undefined
  
  var sortingMethod: js.UndefOr[Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])] = js.undefined
}
object ConvertToAxisDataType {
  
  inline def apply(): ConvertToAxisDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertToAxisDataType]
  }
  
  extension [Self <: ConvertToAxisDataType](x: Self) {
    
    inline def setCheckTypeForAllData(value: Boolean): Self = StObject.set(x, "checkTypeForAllData", value.asInstanceOf[js.Any])
    
    inline def setCheckTypeForAllDataUndefined: Self = StObject.set(x, "checkTypeForAllData", js.undefined)
    
    inline def setConvertToAxisDataType(value: Boolean): Self = StObject.set(x, "convertToAxisDataType", value.asInstanceOf[js.Any])
    
    inline def setConvertToAxisDataTypeUndefined: Self = StObject.set(x, "convertToAxisDataType", js.undefined)
    
    inline def setSortingMethod(value: Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])): Self = StObject.set(x, "sortingMethod", value.asInstanceOf[js.Any])
    
    inline def setSortingMethodFunction2(value: (/* a */ Arg, /* b */ Arg) => Double): Self = StObject.set(x, "sortingMethod", js.Any.fromFunction2(value))
    
    inline def setSortingMethodUndefined: Self = StObject.set(x, "sortingMethod", js.undefined)
  }
}
