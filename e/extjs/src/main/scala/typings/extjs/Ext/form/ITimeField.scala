package typings.extjs.Ext.form

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeField
  extends typings.extjs.Ext.form.field.IComboBox {
  
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var pickerMaxHeight: js.UndefOr[Double] = js.native
  
  /** [Method] Replaces any existing maxValue with the new time and refreshes the picker s range
    * @param value Date/String The maximum time that can be selected
    */
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Replaces any existing minValue with the new time and refreshes the picker s range
    * @param value Date/String The minimum time that can be selected
    */
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the specified value s into the field
    * @returns any this
    */
  @JSName("setValue")
  var setValue_ITimeField: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Boolean) */
  var snapToIncrement: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[String] = js.native
}
object ITimeField {
  
  @scala.inline
  def apply(): ITimeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeField]
  }
  
  @scala.inline
  implicit class ITimeFieldMutableBuilder[Self <: ITimeField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltFormats(value: String): Self = StObject.set(x, "altFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltFormatsUndefined: Self = StObject.set(x, "altFormats", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    @scala.inline
    def setMaxText(value: String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTextUndefined: Self = StObject.set(x, "maxText", js.undefined)
    
    @scala.inline
    def setMaxValue(value: js.Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinText(value: String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTextUndefined: Self = StObject.set(x, "minText", js.undefined)
    
    @scala.inline
    def setMinValue(value: js.Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setPickerMaxHeight(value: Double): Self = StObject.set(x, "pickerMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerMaxHeightUndefined: Self = StObject.set(x, "pickerMaxHeight", js.undefined)
    
    @scala.inline
    def setSetMaxValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    @scala.inline
    def setSetMinValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    @scala.inline
    def setSetValue(value: () => _): Self = StObject.set(x, "setValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setSnapToIncrement(value: Boolean): Self = StObject.set(x, "snapToIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToIncrementUndefined: Self = StObject.set(x, "snapToIncrement", js.undefined)
    
    @scala.inline
    def setSubmitFormat(value: String): Self = StObject.set(x, "submitFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitFormatUndefined: Self = StObject.set(x, "submitFormat", js.undefined)
  }
}
