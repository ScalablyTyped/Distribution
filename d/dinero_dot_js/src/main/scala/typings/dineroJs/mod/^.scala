package typings.dineroJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dinero.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultAmount: Double = js.native
  var defaultCurrency: Currency = js.native
  var defaultPrecision: Double = js.native
  var globalExchangeRatesApi: ExchangeRatesApiOptions = js.native
  var globalFormat: String = js.native
  var globalFormatRoundingMode: String = js.native
  var globalLocale: String = js.native
  var globalRoundingMode: RoundingMode = js.native
  def apply(): Dinero = js.native
  def apply(options: Options): Dinero = js.native
}

