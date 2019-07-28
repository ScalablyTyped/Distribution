package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvWriteOptions extends js.Object {
  var dateFormat: js.UndefOr[String] = js.undefined
}

object CsvWriteOptions {
  @scala.inline
  def apply(dateFormat: String = null): CsvWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    __obj.asInstanceOf[CsvWriteOptions]
  }
}

