package typings.atFormatjsIntlDashUnifiedDashNumberformat

import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.CurrencyData
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberILD
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberLocalePatternData
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.RawNumberData
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.UnitData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib/data", JSImport.Namespace)
@js.native
object libDataMod extends js.Object {
  val ILND: Record[String, js.Array[String]] = js.native
  def extractILD(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String
  ): NumberILD = js.native
  def extractPatterns(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String
  ): NumberLocalePatternData = js.native
  def extractPatterns(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String,
    unit: String
  ): NumberLocalePatternData = js.native
  def extractPatterns(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String,
    unit: String,
    currency: String
  ): NumberLocalePatternData = js.native
}

