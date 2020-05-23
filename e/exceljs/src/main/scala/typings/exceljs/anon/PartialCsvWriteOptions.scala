package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CsvWriteOptions> */
trait PartialCsvWriteOptions extends js.Object {
  var dateFormat: js.UndefOr[String] = js.undefined
  var dateUTC: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var formatterOptions: js.UndefOr[PartialFastCsvFormatterOp] = js.undefined
  var includeEmptyRows: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, _]] = js.undefined
  var sheetId: js.UndefOr[Double] = js.undefined
  var sheetName: js.UndefOr[String] = js.undefined
}

object PartialCsvWriteOptions {
  @scala.inline
  def apply(
    dateFormat: String = null,
    dateUTC: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    formatterOptions: PartialFastCsvFormatterOp = null,
    includeEmptyRows: js.UndefOr[Boolean] = js.undefined,
    map: (/* value */ js.Any, /* index */ Double) => _ = null,
    sheetId: js.UndefOr[Double] = js.undefined,
    sheetName: String = null
  ): PartialCsvWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(dateUTC)) __obj.updateDynamic("dateUTC")(dateUTC.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (formatterOptions != null) __obj.updateDynamic("formatterOptions")(formatterOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmptyRows)) __obj.updateDynamic("includeEmptyRows")(includeEmptyRows.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction2(map))
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    if (sheetName != null) __obj.updateDynamic("sheetName")(sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCsvWriteOptions]
  }
}

