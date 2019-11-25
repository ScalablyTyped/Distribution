package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvWriteOptions extends js.Object {
  var dateFormat: String
  var dateUTC: Boolean
}

object CsvWriteOptions {
  @scala.inline
  def apply(dateFormat: String, dateUTC: Boolean): CsvWriteOptions = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateUTC = dateUTC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CsvWriteOptions]
  }
}

