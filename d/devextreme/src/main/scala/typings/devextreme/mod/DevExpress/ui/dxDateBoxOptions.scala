package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxDateBox.DatePickerType
import typings.devextreme.mod.DevExpress.ui.dxDateBox.DateType
import typings.devextreme.mod.DevExpress.ui.dxDateBox.DisabledDate
import typings.devextreme.mod.DevExpress.ui.dxPopup.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDateBoxOptions
  extends StObject
     with dxDropDownEditorOptions[dxDateBox] {
  
  /**
    * Specifies whether or not adaptive UI component rendering is enabled on a small screen.
    */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text displayed on the Apply button.
    */
  var applyButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the calendar&apos;s value picker. Applies only if the pickerType is &apos;calendar&apos;.
    */
  var calendarOptions: js.UndefOr[dxCalendarOptions] = js.undefined
  
  /**
    * The text displayed on the Cancel button.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the message displayed if the specified date is later than the max value or earlier than the min value.
    */
  var dateOutOfRangeMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the date-time value serialization format. Use it only if you do not specify the value at design time.
    */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies dates that users cannot select. Applies only if pickerType is &apos;calendar&apos;.
    */
  var disabledDates: js.UndefOr[js.Array[js.Date] | (js.Function1[/* data */ DisabledDate, Boolean])] = js.undefined
  
  /**
    * Specifies the date display format. Ignored if the pickerType property is &apos;native&apos;
    */
  var displayFormat: js.UndefOr[Format] = js.undefined
  
  /**
    * Configures the drop-down field which holds the content.
    */
  @JSName("dropDownOptions")
  var dropDownOptions_dxDateBoxOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies the interval between neighboring values in the popup list in minutes.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the message displayed if the typed value is not a valid date or time.
    */
  var invalidDateMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The last date that can be selected within the UI component.
    */
  var max: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * The minimum date that can be selected within the UI component.
    */
  var min: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the type of the date/time picker.
    */
  var pickerType: js.UndefOr[DatePickerType] = js.undefined
  
  /**
    * Specifies whether to show the analog clock in the value picker. Applies only if type is &apos;datetime&apos; and pickerType is &apos;calendar&apos;.
    */
  var showAnalogClock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A format used to display date/time information.
    */
  var `type`: js.UndefOr[DateType] = js.undefined
  
  /**
    * Specifies whether to control user input using a mask created based on the displayFormat.
    */
  var useMaskBehavior: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object or a value specifying the date and time currently selected using the date box.
    */
  @JSName("value")
  var value_dxDateBoxOptions: js.UndefOr[js.Date | Double | String] = js.undefined
}
object dxDateBoxOptions {
  
  inline def apply(): dxDateBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDateBoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxDateBoxOptions] (val x: Self) extends AnyVal {
    
    inline def setAdaptivityEnabled(value: Boolean): Self = StObject.set(x, "adaptivityEnabled", value.asInstanceOf[js.Any])
    
    inline def setAdaptivityEnabledUndefined: Self = StObject.set(x, "adaptivityEnabled", js.undefined)
    
    inline def setApplyButtonText(value: String): Self = StObject.set(x, "applyButtonText", value.asInstanceOf[js.Any])
    
    inline def setApplyButtonTextUndefined: Self = StObject.set(x, "applyButtonText", js.undefined)
    
    inline def setCalendarOptions(value: dxCalendarOptions): Self = StObject.set(x, "calendarOptions", value.asInstanceOf[js.Any])
    
    inline def setCalendarOptionsUndefined: Self = StObject.set(x, "calendarOptions", js.undefined)
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setDateOutOfRangeMessage(value: String): Self = StObject.set(x, "dateOutOfRangeMessage", value.asInstanceOf[js.Any])
    
    inline def setDateOutOfRangeMessageUndefined: Self = StObject.set(x, "dateOutOfRangeMessage", js.undefined)
    
    inline def setDateSerializationFormat(value: String): Self = StObject.set(x, "dateSerializationFormat", value.asInstanceOf[js.Any])
    
    inline def setDateSerializationFormatUndefined: Self = StObject.set(x, "dateSerializationFormat", js.undefined)
    
    inline def setDisabledDates(value: js.Array[js.Date] | (js.Function1[/* data */ DisabledDate, Boolean])): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
    
    inline def setDisabledDatesFunction1(value: /* data */ DisabledDate => Boolean): Self = StObject.set(x, "disabledDates", js.Any.fromFunction1(value))
    
    inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
    
    inline def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value*))
    
    inline def setDisplayFormat(value: Format): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "displayFormat", js.Any.fromFunction1(value))
    
    inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
    
    inline def setDropDownOptions(value: Properties): Self = StObject.set(x, "dropDownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropDownOptionsUndefined: Self = StObject.set(x, "dropDownOptions", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setInvalidDateMessage(value: String): Self = StObject.set(x, "invalidDateMessage", value.asInstanceOf[js.Any])
    
    inline def setInvalidDateMessageUndefined: Self = StObject.set(x, "invalidDateMessage", js.undefined)
    
    inline def setMax(value: js.Date | Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: js.Date | Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPickerType(value: DatePickerType): Self = StObject.set(x, "pickerType", value.asInstanceOf[js.Any])
    
    inline def setPickerTypeUndefined: Self = StObject.set(x, "pickerType", js.undefined)
    
    inline def setShowAnalogClock(value: Boolean): Self = StObject.set(x, "showAnalogClock", value.asInstanceOf[js.Any])
    
    inline def setShowAnalogClockUndefined: Self = StObject.set(x, "showAnalogClock", js.undefined)
    
    inline def setType(value: DateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseMaskBehavior(value: Boolean): Self = StObject.set(x, "useMaskBehavior", value.asInstanceOf[js.Any])
    
    inline def setUseMaskBehaviorUndefined: Self = StObject.set(x, "useMaskBehavior", js.undefined)
    
    inline def setValue(value: js.Date | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
