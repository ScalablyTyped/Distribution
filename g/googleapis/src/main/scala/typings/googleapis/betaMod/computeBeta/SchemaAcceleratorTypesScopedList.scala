package typings.googleapis.betaMod.computeBeta

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
    * [Output Only] An informational warning that appears when the accelerator
    * types list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaAcceleratorTypesScopedList {
  
  @scala.inline
  def apply(): SchemaAcceleratorTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorTypesScopedList]
  }
  
  @scala.inline
  implicit class SchemaAcceleratorTypesScopedListMutableBuilder[Self <: SchemaAcceleratorTypesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorTypes(value: js.Array[SchemaAcceleratorType]): Self = StObject.set(x, "acceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypesUndefined: Self = StObject.set(x, "acceleratorTypes", js.undefined)
    
    @scala.inline
    def setAcceleratorTypesVarargs(value: SchemaAcceleratorType*): Self = StObject.set(x, "acceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
