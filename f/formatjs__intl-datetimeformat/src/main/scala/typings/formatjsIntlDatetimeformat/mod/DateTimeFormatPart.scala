package typings.formatjsIntlDatetimeformat.mod

import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.day
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.dayPeriod
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.era
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.hour
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.literal
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.minute
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.month
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.relatedYear
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.second
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.string
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.timeZoneName
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.unknown
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.weekday
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.year
import typings.formatjsIntlDatetimeformat.formatjsIntlDatetimeformatStrings.yearName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormatPart extends js.Object {
  var `type`: literal | era | year | month | day | hour | minute | second | weekday | timeZoneName | dayPeriod | relatedYear | yearName | unknown = js.native
  var value: string = js.native
}

object DateTimeFormatPart {
  @scala.inline
  def apply(
    `type`: literal | era | year | month | day | hour | minute | second | weekday | timeZoneName | dayPeriod | relatedYear | yearName | unknown,
    value: string
  ): DateTimeFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatPart]
  }
  @scala.inline
  implicit class DateTimeFormatPartOps[Self <: DateTimeFormatPart] (val x: Self) extends AnyVal {
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
    def setType(
      value: literal | era | year | month | day | hour | minute | second | weekday | timeZoneName | dayPeriod | relatedYear | yearName | unknown
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: string): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

