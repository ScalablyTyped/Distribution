package typings.formatjsIntlRelativetimeformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ f in @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.RelativeTimeField ]:? @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.FieldData} & {  nu :std.Array<string | null> | undefined} */
@js.native
trait LocaleFieldsData extends js.Object {
  var day: js.UndefOr[FieldData] = js.native
  var `day-narrow`: js.UndefOr[FieldData] = js.native
  var `day-short`: js.UndefOr[FieldData] = js.native
  var hour: js.UndefOr[FieldData] = js.native
  var `hour-narrow`: js.UndefOr[FieldData] = js.native
  var `hour-short`: js.UndefOr[FieldData] = js.native
  var minute: js.UndefOr[FieldData] = js.native
  var `minute-narrow`: js.UndefOr[FieldData] = js.native
  var `minute-short`: js.UndefOr[FieldData] = js.native
  var month: js.UndefOr[FieldData] = js.native
  var `month-narrow`: js.UndefOr[FieldData] = js.native
  var `month-short`: js.UndefOr[FieldData] = js.native
  var nu: js.UndefOr[js.Array[String | Null]] = js.native
  var quarter: js.UndefOr[FieldData] = js.native
  var `quarter-narrow`: js.UndefOr[FieldData] = js.native
  var `quarter-short`: js.UndefOr[FieldData] = js.native
  var second: js.UndefOr[FieldData] = js.native
  var `second-narrow`: js.UndefOr[FieldData] = js.native
  var `second-short`: js.UndefOr[FieldData] = js.native
  var week: js.UndefOr[FieldData] = js.native
  var `week-narrow`: js.UndefOr[FieldData] = js.native
  var `week-short`: js.UndefOr[FieldData] = js.native
  var year: js.UndefOr[FieldData] = js.native
  var `year-narrow`: js.UndefOr[FieldData] = js.native
  var `year-short`: js.UndefOr[FieldData] = js.native
}

object LocaleFieldsData {
  @scala.inline
  def apply(): LocaleFieldsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleFieldsData]
  }
  @scala.inline
  implicit class LocaleFieldsDataOps[Self <: LocaleFieldsData] (val x: Self) extends AnyVal {
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
    def setDay(value: FieldData): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def `setDay-narrow`(value: FieldData): Self = this.set("day-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDay-narrow`: Self = this.set("day-narrow", js.undefined)
    @scala.inline
    def `setDay-short`(value: FieldData): Self = this.set("day-short", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDay-short`: Self = this.set("day-short", js.undefined)
    @scala.inline
    def setHour(value: FieldData): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def `setHour-narrow`(value: FieldData): Self = this.set("hour-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHour-narrow`: Self = this.set("hour-narrow", js.undefined)
    @scala.inline
    def `setHour-short`(value: FieldData): Self = this.set("hour-short", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHour-short`: Self = this.set("hour-short", js.undefined)
    @scala.inline
    def setMinute(value: FieldData): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def `setMinute-narrow`(value: FieldData): Self = this.set("minute-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMinute-narrow`: Self = this.set("minute-narrow", js.undefined)
    @scala.inline
    def `setMinute-short`(value: FieldData): Self = this.set("minute-short", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMinute-short`: Self = this.set("minute-short", js.undefined)
    @scala.inline
    def setMonth(value: FieldData): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def `setMonth-narrow`(value: FieldData): Self = this.set("month-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMonth-narrow`: Self = this.set("month-narrow", js.undefined)
    @scala.inline
    def `setMonth-short`(value: FieldData): Self = this.set("month-short", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMonth-short`: Self = this.set("month-short", js.undefined)
    @scala.inline
    def setNuVarargs(value: (String | Null)*): Self = this.set("nu", js.Array(value :_*))
    @scala.inline
    def setNu(value: js.Array[String | Null]): Self = this.set("nu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNu: Self = this.set("nu", js.undefined)
    @scala.inline
    def setQuarter(value: FieldData): Self = this.set("quarter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarter: Self = this.set("quarter", js.undefined)
    @scala.inline
    def `setQuarter-narrow`(value: FieldData): Self = this.set("quarter-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteQuarter-narrow`: Self = this.set("quarter-narrow", js.undefined)
    @scala.inline
    def `setQuarter-short`(value: FieldData): Self = this.set("quarter-short", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteQuarter-short`: Self = this.set("quarter-short", js.undefined)
    @scala.inline
    def setSecond(value: FieldData): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    @scala.inline
    def `setSecond-narrow`(value: FieldData): Self = this.set("second-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSecond-narrow`: Self = this.set("second-narrow", js.undefined)
    @scala.inline
    def `setSecond-short`(value: FieldData): Self = this.set("second-short", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSecond-short`: Self = this.set("second-short", js.undefined)
    @scala.inline
    def setWeek(value: FieldData): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    @scala.inline
    def `setWeek-narrow`(value: FieldData): Self = this.set("week-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWeek-narrow`: Self = this.set("week-narrow", js.undefined)
    @scala.inline
    def `setWeek-short`(value: FieldData): Self = this.set("week-short", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWeek-short`: Self = this.set("week-short", js.undefined)
    @scala.inline
    def setYear(value: FieldData): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
    @scala.inline
    def `setYear-narrow`(value: FieldData): Self = this.set("year-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteYear-narrow`: Self = this.set("year-narrow", js.undefined)
    @scala.inline
    def `setYear-short`(value: FieldData): Self = this.set("year-short", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteYear-short`: Self = this.set("year-short", js.undefined)
  }
  
}

