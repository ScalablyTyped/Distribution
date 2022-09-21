package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAcceleratorTypesScopedList extends StObject {
  
  /**
    * [Output Only] A list of accelerator types contained in this scope.
    */
  var acceleratorTypes: js.UndefOr[js.Array[SchemaAcceleratorType]] = js.undefined
  
  /**
    * [Output Only] An informational warning that appears when the accelerator types list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaAcceleratorTypesScopedList {
  
  inline def apply(): SchemaAcceleratorTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorTypesScopedList]
  }
  
  extension [Self <: SchemaAcceleratorTypesScopedList](x: Self) {
    
    inline def setAcceleratorTypes(value: js.Array[SchemaAcceleratorType]): Self = StObject.set(x, "acceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "acceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: SchemaAcceleratorType*): Self = StObject.set(x, "acceleratorTypes", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
