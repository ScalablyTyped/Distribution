package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.narrowSymbol
import typings.atFormatjsIntlDashUtils.distUnifiedDashNumberformatDashTypesMod.CurrencyData
import typings.atFormatjsIntlDashUtils.distUnifiedDashNumberformatDashTypesMod.UnitData
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Currencies extends js.Object {
  /** currency ISO code -> currency data mapping */
  var currencies: js.UndefOr[Record[String, Pick[CurrencyData, narrowSymbol]]] = js.undefined
  /** unit name -> data mapping */
  var units: js.UndefOr[Record[String, UnitData]] = js.undefined
}

object Anon_Currencies {
  @scala.inline
  def apply(
    currencies: Record[String, Pick[CurrencyData, narrowSymbol]] = null,
    units: Record[String, UnitData] = null
  ): Anon_Currencies = {
    val __obj = js.Dynamic.literal()
    if (currencies != null) __obj.updateDynamic("currencies")(currencies.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Currencies]
  }
}

