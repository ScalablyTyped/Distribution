package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CsvReadOptions> */
trait PartialCsvReadOptions extends js.Object {
  var dateFormats: js.UndefOr[js.Array[String]] = js.undefined
  var map: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, _]] = js.undefined
  var parserOptions: js.UndefOr[PartialFastCsvParserOptio] = js.undefined
  var sheetName: js.UndefOr[String] = js.undefined
}

object PartialCsvReadOptions {
  @scala.inline
  def apply(
    dateFormats: js.Array[String] = null,
    map: (/* value */ js.Any, /* index */ Double) => _ = null,
    parserOptions: PartialFastCsvParserOptio = null,
    sheetName: String = null
  ): PartialCsvReadOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormats != null) __obj.updateDynamic("dateFormats")(dateFormats.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction2(map))
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions.asInstanceOf[js.Any])
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCsvReadOptions]
  }
}

