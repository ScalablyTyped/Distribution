package typings.fundamentalReact.timeMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Hour
import typings.fundamentalReact.anon.MeridiemAM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  disabled :boolean | undefined,   hoursDownButtonProps :any | undefined,   hoursInputProps :any | undefined,   hoursUpButtonProps :any | undefined,   id :string | undefined,   localizedText :{  meridiemAM :string | undefined,   meridiemPM :string | undefined} | undefined,   meridiemDownButtonProps :any | undefined,   meridiemInputProps :any | undefined,   meridiemUpButtonProps :any | undefined,   minutesDownButtonProps :any | undefined,   minutesInputProps :any | undefined,   minutesUpButtonProps :any | undefined,   secondsDownButtonProps :any | undefined,   secondsInputProps :any | undefined,   secondsUpButtonProps :any | undefined,   onChange :(time : {  hour :string,   minute :string,   second :string,   meridiem :0 | 1}): void | undefined, [x: string] : any} & fundamental-react.fundamental-react/lib/Time/Time.TimeBaseProps */
@js.native
trait TimeProps
  extends /* x */ StringDictionary[js.Any] {
  
  var disableStyles: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var format12Hours: js.UndefOr[Boolean] = js.native
  
  var hoursDownButtonProps: js.UndefOr[js.Any] = js.native
  
  var hoursInputProps: js.UndefOr[js.Any] = js.native
  
  var hoursUpButtonProps: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var localizedText: js.UndefOr[MeridiemAM] = js.native
  
  var meridiemDownButtonProps: js.UndefOr[js.Any] = js.native
  
  var meridiemInputProps: js.UndefOr[js.Any] = js.native
  
  var meridiemUpButtonProps: js.UndefOr[js.Any] = js.native
  
  var minutesDownButtonProps: js.UndefOr[js.Any] = js.native
  
  var minutesInputProps: js.UndefOr[js.Any] = js.native
  
  var minutesUpButtonProps: js.UndefOr[js.Any] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* time */ Hour, Unit]] = js.native
  
  var secondsDownButtonProps: js.UndefOr[js.Any] = js.native
  
  var secondsInputProps: js.UndefOr[js.Any] = js.native
  
  var secondsUpButtonProps: js.UndefOr[js.Any] = js.native
  
  var showHour: js.UndefOr[Boolean] = js.native
  
  var showMinute: js.UndefOr[Boolean] = js.native
  
  var showSecond: js.UndefOr[Boolean] = js.native
  
  var spinners: js.UndefOr[Boolean] = js.native
  
  var time: js.UndefOr[Hour] = js.native
}
object TimeProps {
  
  @scala.inline
  def apply(): TimeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeProps]
  }
  
  @scala.inline
  implicit class TimePropsOps[Self <: TimeProps] (val x: Self) extends AnyVal {
    
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
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFormat12Hours(value: Boolean): Self = this.set("format12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat12Hours: Self = this.set("format12Hours", js.undefined)
    
    @scala.inline
    def setHoursDownButtonProps(value: js.Any): Self = this.set("hoursDownButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoursDownButtonProps: Self = this.set("hoursDownButtonProps", js.undefined)
    
    @scala.inline
    def setHoursInputProps(value: js.Any): Self = this.set("hoursInputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoursInputProps: Self = this.set("hoursInputProps", js.undefined)
    
    @scala.inline
    def setHoursUpButtonProps(value: js.Any): Self = this.set("hoursUpButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoursUpButtonProps: Self = this.set("hoursUpButtonProps", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocalizedText(value: MeridiemAM): Self = this.set("localizedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizedText: Self = this.set("localizedText", js.undefined)
    
    @scala.inline
    def setMeridiemDownButtonProps(value: js.Any): Self = this.set("meridiemDownButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeridiemDownButtonProps: Self = this.set("meridiemDownButtonProps", js.undefined)
    
    @scala.inline
    def setMeridiemInputProps(value: js.Any): Self = this.set("meridiemInputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeridiemInputProps: Self = this.set("meridiemInputProps", js.undefined)
    
    @scala.inline
    def setMeridiemUpButtonProps(value: js.Any): Self = this.set("meridiemUpButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeridiemUpButtonProps: Self = this.set("meridiemUpButtonProps", js.undefined)
    
    @scala.inline
    def setMinutesDownButtonProps(value: js.Any): Self = this.set("minutesDownButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutesDownButtonProps: Self = this.set("minutesDownButtonProps", js.undefined)
    
    @scala.inline
    def setMinutesInputProps(value: js.Any): Self = this.set("minutesInputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutesInputProps: Self = this.set("minutesInputProps", js.undefined)
    
    @scala.inline
    def setMinutesUpButtonProps(value: js.Any): Self = this.set("minutesUpButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutesUpButtonProps: Self = this.set("minutesUpButtonProps", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* time */ Hour => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setSecondsDownButtonProps(value: js.Any): Self = this.set("secondsDownButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondsDownButtonProps: Self = this.set("secondsDownButtonProps", js.undefined)
    
    @scala.inline
    def setSecondsInputProps(value: js.Any): Self = this.set("secondsInputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondsInputProps: Self = this.set("secondsInputProps", js.undefined)
    
    @scala.inline
    def setSecondsUpButtonProps(value: js.Any): Self = this.set("secondsUpButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondsUpButtonProps: Self = this.set("secondsUpButtonProps", js.undefined)
    
    @scala.inline
    def setShowHour(value: Boolean): Self = this.set("showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHour: Self = this.set("showHour", js.undefined)
    
    @scala.inline
    def setShowMinute(value: Boolean): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinute: Self = this.set("showMinute", js.undefined)
    
    @scala.inline
    def setShowSecond(value: Boolean): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSecond: Self = this.set("showSecond", js.undefined)
    
    @scala.inline
    def setSpinners(value: Boolean): Self = this.set("spinners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinners: Self = this.set("spinners", js.undefined)
    
    @scala.inline
    def setTime(value: Hour): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
