package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDateField
  extends StObject
     with typings.extjs.Ext.form.field.IPicker {
  
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[String] = js.undefined
  
  /** [Method] private */
  @JSName("beforeBlur")
  var beforeBlur_IDateField: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String[]) */
  var disabledDates: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  var disabledDatesText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number[]) */
  var disabledDays: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  var disabledDaysText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
  
  /** [Method] Initializes the field s value based on the initial config  */
  @JSName("initValue")
  var initValue_IDateField: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[Any] = js.undefined
  
  /** [Method] Attempts to parse a given string value using a given date format. ... */
  var safeParse: js.UndefOr[Any] = js.undefined
  
  /** [Method] Replaces any existing disabled dates with new values and refreshes the Date picker
    * @param disabledDates String[] An array of date strings (see the disabledDates config for details on supported values) used to disable a pattern of dates.
    */
  var setDisabledDates: js.UndefOr[js.Function1[/* disabledDates */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the Date picker
    * @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
    */
  var setDisabledDays: js.UndefOr[js.Function1[/* disabledDays */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Replaces any existing maxValue with the new value and refreshes the Date picker
    * @param value Date The maximum date that can be selected
    */
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Replaces any existing minValue with the new value and refreshes the Date picker
    * @param value Date The minimum date that can be selected
    */
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of the date field
    * @param date String/Date The date or valid date string
    * @returns Ext.form.field.Date this
    */
  @JSName("setValue")
  var setValue_IDateField: js.UndefOr[js.Function1[/* date */ js.UndefOr[Any], typings.extjs.Ext.form.field.IDate]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var showToday: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var startDay: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useStrict: js.UndefOr[Boolean] = js.undefined
}
object IDateField {
  
  inline def apply(): IDateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDateField] (val x: Self) extends AnyVal {
    
    inline def setAltFormats(value: String): Self = StObject.set(x, "altFormats", value.asInstanceOf[js.Any])
    
    inline def setAltFormatsUndefined: Self = StObject.set(x, "altFormats", js.undefined)
    
    inline def setBeforeBlur(value: () => Unit): Self = StObject.set(x, "beforeBlur", js.Any.fromFunction0(value))
    
    inline def setBeforeBlurUndefined: Self = StObject.set(x, "beforeBlur", js.undefined)
    
    inline def setDisabledDates(value: Array): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
    
    inline def setDisabledDatesText(value: String): Self = StObject.set(x, "disabledDatesText", value.asInstanceOf[js.Any])
    
    inline def setDisabledDatesTextUndefined: Self = StObject.set(x, "disabledDatesText", js.undefined)
    
    inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
    
    inline def setDisabledDays(value: Array): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
    
    inline def setDisabledDaysText(value: String): Self = StObject.set(x, "disabledDaysText", value.asInstanceOf[js.Any])
    
    inline def setDisabledDaysTextUndefined: Self = StObject.set(x, "disabledDaysText", js.undefined)
    
    inline def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInitValue(value: () => Unit): Self = StObject.set(x, "initValue", js.Any.fromFunction0(value))
    
    inline def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
    
    inline def setMaxText(value: String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
    
    inline def setMaxTextUndefined: Self = StObject.set(x, "maxText", js.undefined)
    
    inline def setMaxValue(value: Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinText(value: String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
    
    inline def setMinTextUndefined: Self = StObject.set(x, "minText", js.undefined)
    
    inline def setMinValue(value: Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setSafeParse(value: Any): Self = StObject.set(x, "safeParse", value.asInstanceOf[js.Any])
    
    inline def setSafeParseUndefined: Self = StObject.set(x, "safeParse", js.undefined)
    
    inline def setSetDisabledDates(value: /* disabledDates */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setDisabledDates", js.Any.fromFunction1(value))
    
    inline def setSetDisabledDatesUndefined: Self = StObject.set(x, "setDisabledDates", js.undefined)
    
    inline def setSetDisabledDays(value: /* disabledDays */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setDisabledDays", js.Any.fromFunction1(value))
    
    inline def setSetDisabledDaysUndefined: Self = StObject.set(x, "setDisabledDays", js.undefined)
    
    inline def setSetMaxValue(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
    
    inline def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    inline def setSetMinValue(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
    
    inline def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    inline def setSetValue(value: /* date */ js.UndefOr[Any] => typings.extjs.Ext.form.field.IDate): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
    
    inline def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
    
    inline def setStartDay(value: Double): Self = StObject.set(x, "startDay", value.asInstanceOf[js.Any])
    
    inline def setStartDayUndefined: Self = StObject.set(x, "startDay", js.undefined)
    
    inline def setSubmitFormat(value: String): Self = StObject.set(x, "submitFormat", value.asInstanceOf[js.Any])
    
    inline def setSubmitFormatUndefined: Self = StObject.set(x, "submitFormat", js.undefined)
    
    inline def setUseStrict(value: Boolean): Self = StObject.set(x, "useStrict", value.asInstanceOf[js.Any])
    
    inline def setUseStrictUndefined: Self = StObject.set(x, "useStrict", js.undefined)
  }
}
