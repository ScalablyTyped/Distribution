package typings.formatjsIntlDatetimeformat.typesMod

import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.buddhist
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.chinese
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.coptic
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.ethiopia
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.ethiopic
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.full
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.gregory
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.h11
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.h12
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.h23
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.h24
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.hebrew
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.indian
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.islamic
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.iso8601
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.japanese
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.long
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.medium
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.persian
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.roc
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormatOptions
  extends typings.std.Intl.DateTimeFormatOptions {
  var calendar: js.UndefOr[
    buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
  ] = js.native
  var dateStyle: js.UndefOr[full | long | medium | short] = js.native
  var fractionalSecondDigits: js.UndefOr[Double] = js.native
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.native
  var numberingSystem: js.UndefOr[String] = js.native
  var timeStyle: js.UndefOr[full | long | medium | short] = js.native
}

object DateTimeFormatOptions {
  @scala.inline
  def apply(): DateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormatOptions]
  }
  @scala.inline
  implicit class DateTimeFormatOptionsOps[Self <: DateTimeFormatOptions] (val x: Self) extends AnyVal {
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
    def setCalendar(
      value: buddhist | chinese | coptic | ethiopia | ethiopic | gregory | hebrew | indian | islamic | iso8601 | japanese | persian | roc
    ): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setDateStyle(value: full | long | medium | short): Self = this.set("dateStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateStyle: Self = this.set("dateStyle", js.undefined)
    @scala.inline
    def setFractionalSecondDigits(value: Double): Self = this.set("fractionalSecondDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractionalSecondDigits: Self = this.set("fractionalSecondDigits", js.undefined)
    @scala.inline
    def setHourCycle(value: h11 | h12 | h23 | h24): Self = this.set("hourCycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourCycle: Self = this.set("hourCycle", js.undefined)
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
    @scala.inline
    def setTimeStyle(value: full | long | medium | short): Self = this.set("timeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeStyle: Self = this.set("timeStyle", js.undefined)
  }
  
}

