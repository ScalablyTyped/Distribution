package typings.formatjsIntlUnifiedNumberformat.dataMod

import typings.formatjsIntlUtils.numberTypesMod.CurrencyData
import typings.formatjsIntlUtils.numberTypesMod.NumberILD
import typings.formatjsIntlUtils.numberTypesMod.RawNumberData
import typings.formatjsIntlUtils.numberTypesMod.UnitData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib/data", "extractILD")
@js.native
object extractILD extends js.Object {
  def apply(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String
  ): NumberILD = js.native
}

