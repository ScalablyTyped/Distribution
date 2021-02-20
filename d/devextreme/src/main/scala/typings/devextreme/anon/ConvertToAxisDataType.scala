package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertToAxisDataType extends StObject {
  
  var checkTypeForAllData: js.UndefOr[Boolean] = js.native
  
  var convertToAxisDataType: js.UndefOr[Boolean] = js.native
  
  var sortingMethod: js.UndefOr[Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])] = js.native
}
object ConvertToAxisDataType {
  
  @scala.inline
  def apply(): ConvertToAxisDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertToAxisDataType]
  }
  
  @scala.inline
  implicit class ConvertToAxisDataTypeMutableBuilder[Self <: ConvertToAxisDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckTypeForAllData(value: Boolean): Self = StObject.set(x, "checkTypeForAllData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckTypeForAllDataUndefined: Self = StObject.set(x, "checkTypeForAllData", js.undefined)
    
    @scala.inline
    def setConvertToAxisDataType(value: Boolean): Self = StObject.set(x, "convertToAxisDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertToAxisDataTypeUndefined: Self = StObject.set(x, "convertToAxisDataType", js.undefined)
    
    @scala.inline
    def setSortingMethod(value: Boolean | (js.Function2[/* a */ Arg, /* b */ Arg, Double])): Self = StObject.set(x, "sortingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingMethodFunction2(value: (/* a */ Arg, /* b */ Arg) => Double): Self = StObject.set(x, "sortingMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortingMethodUndefined: Self = StObject.set(x, "sortingMethod", js.undefined)
  }
}
