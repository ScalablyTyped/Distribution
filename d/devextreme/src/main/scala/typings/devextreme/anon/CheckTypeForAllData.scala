package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckTypeForAllData extends StObject {
  
  /**
    * Validates the type of each value coming from the data source.
    */
  var checkTypeForAllData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Converts data coming from a data source into a data type supported by the axis.
    */
  var convertToAxisDataType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the sorting order in which series points should be drawn.
    */
  var sortingMethod: js.UndefOr[Boolean | (js.Function2[/* a */ Any, /* b */ Any, Double])] = js.undefined
}
object CheckTypeForAllData {
  
  inline def apply(): CheckTypeForAllData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckTypeForAllData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckTypeForAllData] (val x: Self) extends AnyVal {
    
    inline def setCheckTypeForAllData(value: Boolean): Self = StObject.set(x, "checkTypeForAllData", value.asInstanceOf[js.Any])
    
    inline def setCheckTypeForAllDataUndefined: Self = StObject.set(x, "checkTypeForAllData", js.undefined)
    
    inline def setConvertToAxisDataType(value: Boolean): Self = StObject.set(x, "convertToAxisDataType", value.asInstanceOf[js.Any])
    
    inline def setConvertToAxisDataTypeUndefined: Self = StObject.set(x, "convertToAxisDataType", js.undefined)
    
    inline def setSortingMethod(value: Boolean | (js.Function2[/* a */ Any, /* b */ Any, Double])): Self = StObject.set(x, "sortingMethod", value.asInstanceOf[js.Any])
    
    inline def setSortingMethodFunction2(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sortingMethod", js.Any.fromFunction2(value))
    
    inline def setSortingMethodUndefined: Self = StObject.set(x, "sortingMethod", js.undefined)
  }
}
