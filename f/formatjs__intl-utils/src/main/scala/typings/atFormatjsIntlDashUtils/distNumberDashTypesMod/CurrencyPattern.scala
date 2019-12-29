package typings.atFormatjsIntlDashUtils.distNumberDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyPattern extends js.Object {
  var code: CurrencySignPattern
  var name: CurrencySignPattern
  var narrowSymbol: CurrencySignPattern
  var symbol: CurrencySignPattern
}

object CurrencyPattern {
  @scala.inline
  def apply(
    code: CurrencySignPattern,
    name: CurrencySignPattern,
    narrowSymbol: CurrencySignPattern,
    symbol: CurrencySignPattern
  ): CurrencyPattern = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], narrowSymbol = narrowSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CurrencyPattern]
  }
}

