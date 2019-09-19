package typings.atFormatjsIntlDashUtils.distUnifiedDashNumberformatDashTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnifiedNumberFormatLocaleData extends js.Object {
  var locale: String
  var units: Record[String, UnitData]
}

object UnifiedNumberFormatLocaleData {
  @scala.inline
  def apply(locale: String, units: Record[String, UnitData]): UnifiedNumberFormatLocaleData = {
    val __obj = js.Dynamic.literal(locale = locale, units = units)
  
    __obj.asInstanceOf[UnifiedNumberFormatLocaleData]
  }
}

