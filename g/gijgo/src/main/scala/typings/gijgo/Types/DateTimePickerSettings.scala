package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DateTimePicker
@js.native
trait DateTimePickerSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var datepicker: js.UndefOr[DatePickerSettings] = js.native
  var footer: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var uiLibrary: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object DateTimePickerSettings {
  @scala.inline
  def apply(): DateTimePickerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerSettings]
  }
  @scala.inline
  implicit class DateTimePickerSettingsOps[Self <: DateTimePickerSettings] (val x: Self) extends AnyVal {
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
    def setChange(value: /* e */ js.Any => _): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setDatepicker(value: DatePickerSettings): Self = this.set("datepicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatepicker: Self = this.set("datepicker", js.undefined)
    @scala.inline
    def setFooter(value: Boolean): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setUiLibrary(value: String): Self = this.set("uiLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUiLibrary: Self = this.set("uiLibrary", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

