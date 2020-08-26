package typings.fundamentalReact.timePickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Hour
import typings.fundamentalReact.anon.MeridiemPM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  buttonProps :{[x: string] : any} | undefined,   disabled :boolean | undefined,   id :string | undefined,   inputProps :{[x: string] : any} | undefined,   localizedText :{  meridiemAM :string,   meridiemPM :string} | undefined,   popoverProps :{[x: string] : any} | undefined,   timeProps :{[x: string] : any} | undefined,   value :string | undefined,   onChange :(args : ...any): any | undefined, [x: string] : any} & fundamental-react.fundamental-react/lib/Time/Time.TimeBaseProps */
@js.native
trait TimePickerProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var format12Hours: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var localizedText: js.UndefOr[MeridiemPM] = js.native
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var popoverProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var showHour: js.UndefOr[Boolean] = js.native
  var showMinute: js.UndefOr[Boolean] = js.native
  var showSecond: js.UndefOr[Boolean] = js.native
  var spinners: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Hour] = js.native
  var timeProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var value: js.UndefOr[String] = js.native
}

object TimePickerProps {
  @scala.inline
  def apply(): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProps]
  }
  @scala.inline
  implicit class TimePickerPropsOps[Self <: TimePickerProps] (val x: Self) extends AnyVal {
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
    def setButtonProps(value: StringDictionary[js.Any]): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputProps(value: StringDictionary[js.Any]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setLocalizedText(value: MeridiemPM): Self = this.set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedText: Self = this.set("localizedText", js.undefined)
    @scala.inline
    def setOnChange(value: /* repeated */ js.Any => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setPopoverProps(value: StringDictionary[js.Any]): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
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
    @scala.inline
    def setTimeProps(value: StringDictionary[js.Any]): Self = this.set("timeProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeProps: Self = this.set("timeProps", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

