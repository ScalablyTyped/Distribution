package typings.extjs.Ext.form.field

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRadio extends ICheckbox {
  
  /** [Method] If this radio is part of a group it will return the selected value
    * @returns String
    */
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
    * @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
    */
  @JSName("getModelData")
  var getModelData_IRadio: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Property] (Boolean) */
  var isRadio: js.UndefOr[Boolean] = js.native
  
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IRadio: js.UndefOr[js.Function0[Unit]] = js.native
}
object IRadio {
  
  @scala.inline
  def apply(): IRadio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadio]
  }
  
  @scala.inline
  implicit class IRadioMutableBuilder[Self <: IRadio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGroupValue(value: () => String): Self = StObject.set(x, "getGroupValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupValueUndefined: Self = StObject.set(x, "getGroupValue", js.undefined)
    
    @scala.inline
    def setGetModelData(value: () => _): Self = StObject.set(x, "getModelData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModelDataUndefined: Self = StObject.set(x, "getModelData", js.undefined)
    
    @scala.inline
    def setIsRadio(value: Boolean): Self = StObject.set(x, "isRadio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRadioUndefined: Self = StObject.set(x, "isRadio", js.undefined)
    
    @scala.inline
    def setOnRemoved(value: () => Unit): Self = StObject.set(x, "onRemoved", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRemovedUndefined: Self = StObject.set(x, "onRemoved", js.undefined)
  }
}
