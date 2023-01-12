package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertToAxisDataType extends StObject {
  
  /**
    * Specifies whether or not to validate values from a data source.
    */
  var checkTypeForAllData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not to convert the values from a data source into the data type of an axis.
    */
  var convertToAxisDataType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how to sort series points.
    */
  var sortingMethod: js.UndefOr[Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])] = js.undefined
}
object ConvertToAxisDataType {
  
  inline def apply(): ConvertToAxisDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertToAxisDataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConvertToAxisDataType] (val x: Self) extends AnyVal {
    
    inline def setCheckTypeForAllData(value: Boolean): Self = StObject.set(x, "checkTypeForAllData", value.asInstanceOf[js.Any])
    
    inline def setCheckTypeForAllDataUndefined: Self = StObject.set(x, "checkTypeForAllData", js.undefined)
    
    inline def setConvertToAxisDataType(value: Boolean): Self = StObject.set(x, "convertToAxisDataType", value.asInstanceOf[js.Any])
    
    inline def setConvertToAxisDataTypeUndefined: Self = StObject.set(x, "convertToAxisDataType", js.undefined)
    
    inline def setSortingMethod(value: Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])): Self = StObject.set(x, "sortingMethod", value.asInstanceOf[js.Any])
    
    inline def setSortingMethodFunction2(value: (/* a */ Arg, /* b */ Arg) => Double): Self = StObject.set(x, "sortingMethod", js.Any.fromFunction2(value))
    
    inline def setSortingMethodUndefined: Self = StObject.set(x, "sortingMethod", js.undefined)
  }
}
