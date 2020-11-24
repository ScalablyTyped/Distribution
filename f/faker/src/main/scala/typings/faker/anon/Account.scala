package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  def account(): String = js.native
  def account(length: Double): String = js.native
  
  def accountName(): String = js.native
  
  def amount(): String = js.native
  def amount(
    min: js.UndefOr[scala.Nothing],
    max: js.UndefOr[scala.Nothing],
    dec: js.UndefOr[scala.Nothing],
    symbol: String
  ): String = js.native
  def amount(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], dec: Double): String = js.native
  def amount(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], dec: Double, symbol: String): String = js.native
  def amount(min: js.UndefOr[scala.Nothing], max: Double): String = js.native
  def amount(min: js.UndefOr[scala.Nothing], max: Double, dec: js.UndefOr[scala.Nothing], symbol: String): String = js.native
  def amount(min: js.UndefOr[scala.Nothing], max: Double, dec: Double): String = js.native
  def amount(min: js.UndefOr[scala.Nothing], max: Double, dec: Double, symbol: String): String = js.native
  def amount(min: Double): String = js.native
  def amount(min: Double, max: js.UndefOr[scala.Nothing], dec: js.UndefOr[scala.Nothing], symbol: String): String = js.native
  def amount(min: Double, max: js.UndefOr[scala.Nothing], dec: Double): String = js.native
  def amount(min: Double, max: js.UndefOr[scala.Nothing], dec: Double, symbol: String): String = js.native
  def amount(min: Double, max: Double): String = js.native
  def amount(min: Double, max: Double, dec: js.UndefOr[scala.Nothing], symbol: String): String = js.native
  def amount(min: Double, max: Double, dec: Double): String = js.native
  def amount(min: Double, max: Double, dec: Double, symbol: String): String = js.native
  
  def bic(): String = js.native
  
  def bitcoinAddress(): String = js.native
  
  def creditCardCVV(): String = js.native
  
  def creditCardNumber(): String = js.native
  def creditCardNumber(provider: String): String = js.native
  
  def currencyCode(): String = js.native
  
  def currencyName(): String = js.native
  
  def currencySymbol(): String = js.native
  
  def ethereumAddress(): String = js.native
  
  def iban(): String = js.native
  def iban(formatted: Boolean): String = js.native
  
  def litecoinAddress(): String = js.native
  
  def mask(): String = js.native
  def mask(length: js.UndefOr[scala.Nothing], parens: js.UndefOr[scala.Nothing], elipsis: Boolean): String = js.native
  def mask(length: js.UndefOr[scala.Nothing], parens: Boolean): String = js.native
  def mask(length: js.UndefOr[scala.Nothing], parens: Boolean, elipsis: Boolean): String = js.native
  def mask(length: Double): String = js.native
  def mask(length: Double, parens: js.UndefOr[scala.Nothing], elipsis: Boolean): String = js.native
  def mask(length: Double, parens: Boolean): String = js.native
  def mask(length: Double, parens: Boolean, elipsis: Boolean): String = js.native
  
  def routingNumber(): String = js.native
  
  def transactionDescription(): String = js.native
  
  def transactionType(): String = js.native
}
