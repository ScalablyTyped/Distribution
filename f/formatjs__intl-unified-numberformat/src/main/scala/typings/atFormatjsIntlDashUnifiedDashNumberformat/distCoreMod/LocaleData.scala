package typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleData extends js.Object {
  var locale: String
  var parentLocale: js.UndefOr[String] = js.undefined
  var units: Record[String, UnitData]
}

object LocaleData {
  @scala.inline
  def apply(locale: String, units: Record[String, UnitData], parentLocale: String = null): LocaleData = {
    val __obj = js.Dynamic.literal(locale = locale, units = units)
    if (parentLocale != null) __obj.updateDynamic("parentLocale")(parentLocale)
    __obj.asInstanceOf[LocaleData]
  }
}

