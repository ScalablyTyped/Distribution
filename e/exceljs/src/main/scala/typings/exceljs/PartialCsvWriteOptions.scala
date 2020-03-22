package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.CsvWriteOptions> */
trait PartialCsvWriteOptions extends js.Object {
  var dateFormat: js.UndefOr[String] = js.undefined
  var dateUTC: js.UndefOr[Boolean] = js.undefined
}

object PartialCsvWriteOptions {
  @scala.inline
  def apply(dateFormat: String = null, dateUTC: js.UndefOr[Boolean] = js.undefined): PartialCsvWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(dateUTC)) __obj.updateDynamic("dateUTC")(dateUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCsvWriteOptions]
  }
}

