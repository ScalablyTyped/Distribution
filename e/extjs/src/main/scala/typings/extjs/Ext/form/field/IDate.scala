package typings.extjs.Ext.form.field

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDate extends IPicker {
  
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[String] = js.native
  
  /** [Method] private */
  @JSName("beforeBlur")
  var beforeBlur_IDate: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String[]) */
  var disabledDates: js.UndefOr[Array] = js.native
  
  /** [Config Option] (String) */
  var disabledDatesText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number[]) */
  var disabledDays: js.UndefOr[Array] = js.native
  
  /** [Config Option] (String) */
  var disabledDaysText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
  
  /** [Method] Initializes the field s value based on the initial config  */
  @JSName("initValue")
  var initValue_IDate: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.native
  
  /** [Method] Attempts to parse a given string value using a given date format. ... */
  var safeParse: js.UndefOr[js.Any] = js.native
  
  /** [Method] Replaces any existing disabled dates with new values and refreshes the Date picker
    * @param disabledDates String[] An array of date strings (see the disabledDates config for details on supported values) used to disable a pattern of dates.
    */
  var setDisabledDates: js.UndefOr[js.Function1[/* disabledDates */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the Date picker
    * @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
    */
  var setDisabledDays: js.UndefOr[js.Function1[/* disabledDays */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Replaces any existing maxValue with the new value and refreshes the Date picker
    * @param value Date The maximum date that can be selected
    */
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Replaces any existing minValue with the new value and refreshes the Date picker
    * @param value Date The minimum date that can be selected
    */
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of the date field
    * @param date String/Date The date or valid date string
    * @returns Ext.form.field.Date this
    */
  @JSName("setValue")
  var setValue_IDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Config Option] (Boolean) */
  var showToday: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var startDay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var useStrict: js.UndefOr[Boolean] = js.native
}
object IDate {
  
  @scala.inline
  def apply(): IDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDate]
  }
  
  @scala.inline
  implicit class IDateOps[Self <: IDate] (val x: Self) extends AnyVal {
    
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
    def setBeforeBlur(value: () => Unit): Self = this.set("beforeBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeBlur: Self = this.set("beforeBlur", js.undefined)
    
    @scala.inline
    def setDisabledDates(value: Array): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setDisabledDatesText(value: String): Self = this.set("disabledDatesText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDatesText: Self = this.set("disabledDatesText", js.undefined)
    
    @scala.inline
    def setDisabledDays(value: Array): Self = this.set("disabledDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDays: Self = this.set("disabledDays", js.undefined)
    
    @scala.inline
    def setDisabledDaysText(value: String): Self = this.set("disabledDaysText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDaysText: Self = this.set("disabledDaysText", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInitValue(value: () => Unit): Self = this.set("initValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitValue: Self = this.set("initValue", js.undefined)
    
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
    def setSafeParse(value: js.Any): Self = this.set("safeParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeParse: Self = this.set("safeParse", js.undefined)
    
    @scala.inline
    def setSetDisabledDates(value: /* disabledDates */ js.UndefOr[Array] => Unit): Self = this.set("setDisabledDates", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisabledDates: Self = this.set("setDisabledDates", js.undefined)
    
    @scala.inline
    def setSetDisabledDays(value: /* disabledDays */ js.UndefOr[Array] => Unit): Self = this.set("setDisabledDays", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisabledDays: Self = this.set("setDisabledDays", js.undefined)
    
    @scala.inline
    def setSetMaxValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxValue: Self = this.set("setMaxValue", js.undefined)
    
    @scala.inline
    def setSetMinValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinValue: Self = this.set("setMinValue", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* date */ js.UndefOr[js.Any] => IDate): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setShowToday(value: Boolean): Self = this.set("showToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToday: Self = this.set("showToday", js.undefined)
    
    @scala.inline
    def setStartDay(value: Double): Self = this.set("startDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDay: Self = this.set("startDay", js.undefined)
    
    @scala.inline
    def setSubmitFormat(value: String): Self = this.set("submitFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitFormat: Self = this.set("submitFormat", js.undefined)
    
    @scala.inline
    def setUseStrict(value: Boolean): Self = this.set("useStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStrict: Self = this.set("useStrict", js.undefined)
  }
}
