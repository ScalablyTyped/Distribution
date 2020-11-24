package typings.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITime extends IComboBox {
  
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
  var setValue_ITime: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Boolean) */
  var snapToIncrement: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[String] = js.native
}
object ITime {
  
  @scala.inline
  def apply(): ITime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITime]
  }
  
  @scala.inline
  implicit class ITimeOps[Self <: ITime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAltFormats(value: String): Self = this.set("altFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltFormats: Self = this.set("altFormats", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    
    @scala.inline
    def setMaxText(value: String): Self = this.set("maxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxText: Self = this.set("maxText", js.undefined)
    
    @scala.inline
    def setMaxValue(value: js.Any): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinText(value: String): Self = this.set("minText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinText: Self = this.set("minText", js.undefined)
    
    @scala.inline
    def setMinValue(value: js.Any): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setPickerMaxHeight(value: Double): Self = this.set("pickerMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerMaxHeight: Self = this.set("pickerMaxHeight", js.undefined)
    
    @scala.inline
    def setSetMaxValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxValue: Self = this.set("setMaxValue", js.undefined)
    
    @scala.inline
    def setSetMinValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinValue: Self = this.set("setMinValue", js.undefined)
    
    @scala.inline
    def setSetValue(value: () => _): Self = this.set("setValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setSnapToIncrement(value: Boolean): Self = this.set("snapToIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToIncrement: Self = this.set("snapToIncrement", js.undefined)
    
    @scala.inline
    def setSubmitFormat(value: String): Self = this.set("submitFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitFormat: Self = this.set("submitFormat", js.undefined)
  }
}
