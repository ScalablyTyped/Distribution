package typings.atFormatjsIntlDashUtils.distUnifiedDashNumberformatDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyData extends js.Object {
  var displayName: CurrencyPattern
  var narrowSymbol: js.UndefOr[String] = js.undefined
  var symbol: String
  var variantSymbol: js.UndefOr[String] = js.undefined
}

object CurrencyData {
  @scala.inline
  def apply(
    displayName: CurrencyPattern,
    symbol: String,
    narrowSymbol: String = null,
    variantSymbol: String = null
  ): CurrencyData = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    if (narrowSymbol != null) __obj.updateDynamic("narrowSymbol")(narrowSymbol.asInstanceOf[js.Any])
    if (variantSymbol != null) __obj.updateDynamic("variantSymbol")(variantSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyData]
  }
}

