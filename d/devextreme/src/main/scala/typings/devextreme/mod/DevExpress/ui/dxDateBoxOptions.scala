package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDate
import typings.devextreme.devextremeStrings.calendar
import typings.devextreme.devextremeStrings.date
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.list
import typings.devextreme.devextremeStrings.native
import typings.devextreme.devextremeStrings.rollers
import typings.devextreme.devextremeStrings.time
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDateBoxOptions extends dxDropDownEditorOptions[dxDateBox] {
  
  /**
    * [descr:dxDateBox.Options.adaptivityEnabled]
    */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxDateBox.Options.applyButtonText]
    */
  var applyButtonText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDateBox.Options.calendarOptions]
    */
  var calendarOptions: js.UndefOr[dxCalendarOptions] = js.native
  
  /**
    * [descr:dxDateBox.Options.cancelButtonText]
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDateBox.Options.dateOutOfRangeMessage]
    */
  var dateOutOfRangeMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDateBox.Options.dateSerializationFormat]
    */
  var dateSerializationFormat: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDateBox.Options.disabledDates]
    */
  var disabledDates: js.UndefOr[js.Array[Date] | (js.Function1[/* data */ ComponentDate, Boolean])] = js.native
  
  /**
    * [descr:dxDateBox.Options.displayFormat]
    */
  var displayFormat: js.UndefOr[format] = js.native
  
  /**
    * [descr:dxDateBox.Options.interval]
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxDateBox.Options.invalidDateMessage]
    */
  var invalidDateMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDateBox.Options.max]
    */
  var max: js.UndefOr[Date | Double | String] = js.native
  
  /**
    * [descr:dxDateBox.Options.min]
    */
  var min: js.UndefOr[Date | Double | String] = js.native
  
  /**
    * [descr:dxDateBox.Options.pickerType]
    */
  var pickerType: js.UndefOr[calendar | list | native | rollers] = js.native
  
  /**
    * [descr:dxDateBox.Options.showAnalogClock]
    */
  var showAnalogClock: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxDateBox.Options.type]
    */
  var `type`: js.UndefOr[date | datetime | time] = js.native
  
  /**
    * [descr:dxDateBox.Options.useMaskBehavior]
    */
  var useMaskBehavior: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxDateBox.Options.value]
    */
  @JSName("value")
  var value_dxDateBoxOptions: js.UndefOr[Date | Double | String] = js.native
}
object dxDateBoxOptions {
  
  @scala.inline
  def apply(): dxDateBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDateBoxOptions]
  }
  
  @scala.inline
  implicit class dxDateBoxOptionsOps[Self <: dxDateBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setAdaptivityEnabled(value: Boolean): Self = this.set("adaptivityEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptivityEnabled: Self = this.set("adaptivityEnabled", js.undefined)
    
    @scala.inline
    def setApplyButtonText(value: String): Self = this.set("applyButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyButtonText: Self = this.set("applyButtonText", js.undefined)
    
    @scala.inline
    def setCalendarOptions(value: dxCalendarOptions): Self = this.set("calendarOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarOptions: Self = this.set("calendarOptions", js.undefined)
    
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    
    @scala.inline
    def setDateOutOfRangeMessage(value: String): Self = this.set("dateOutOfRangeMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateOutOfRangeMessage: Self = this.set("dateOutOfRangeMessage", js.undefined)
    
    @scala.inline
    def setDateSerializationFormat(value: String): Self = this.set("dateSerializationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateSerializationFormat: Self = this.set("dateSerializationFormat", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: Date*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDatesFunction1(value: /* data */ ComponentDate => Boolean): Self = this.set("disabledDates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabledDates(value: js.Array[Date] | (js.Function1[/* data */ ComponentDate, Boolean])): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setDisplayFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("displayFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayFormat(value: format): Self = this.set("displayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayFormat: Self = this.set("displayFormat", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setInvalidDateMessage(value: String): Self = this.set("invalidDateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidDateMessage: Self = this.set("invalidDateMessage", js.undefined)
    
    @scala.inline
    def setMax(value: Date | Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Date | Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPickerType(value: calendar | list | native | rollers): Self = this.set("pickerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerType: Self = this.set("pickerType", js.undefined)
    
    @scala.inline
    def setShowAnalogClock(value: Boolean): Self = this.set("showAnalogClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAnalogClock: Self = this.set("showAnalogClock", js.undefined)
    
    @scala.inline
    def setType(value: date | datetime | time): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseMaskBehavior(value: Boolean): Self = this.set("useMaskBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMaskBehavior: Self = this.set("useMaskBehavior", js.undefined)
    
    @scala.inline
    def setValue(value: Date | Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
