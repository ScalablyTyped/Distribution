package typings.extjs.Ext.form

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRadio
  extends StObject
     with typings.extjs.Ext.form.field.ICheckbox {
  
  /** [Method] If this radio is part of a group it will return the selected value
    * @returns String
    */
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  @JSName("getModelData")
  var getModelData_IRadio: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Property] (Boolean) */
  var isRadio: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IRadio: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IRadio {
  
  inline def apply(): IRadio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadio]
  }
  
  extension [Self <: IRadio](x: Self) {
    
    inline def setGetGroupValue(value: () => String): Self = StObject.set(x, "getGroupValue", js.Any.fromFunction0(value))
    
    inline def setGetGroupValueUndefined: Self = StObject.set(x, "getGroupValue", js.undefined)
    
    inline def setGetModelData(value: () => Any): Self = StObject.set(x, "getModelData", js.Any.fromFunction0(value))
    
    inline def setGetModelDataUndefined: Self = StObject.set(x, "getModelData", js.undefined)
    
    inline def setIsRadio(value: Boolean): Self = StObject.set(x, "isRadio", value.asInstanceOf[js.Any])
    
    inline def setIsRadioUndefined: Self = StObject.set(x, "isRadio", js.undefined)
    
    inline def setOnRemoved(value: () => Unit): Self = StObject.set(x, "onRemoved", js.Any.fromFunction0(value))
    
    inline def setOnRemovedUndefined: Self = StObject.set(x, "onRemoved", js.undefined)
  }
}
