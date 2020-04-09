package typings.exceljs.mod

import typings.exceljs.PartialFastCsvParserOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvReadOptions extends js.Object {
  var dateFormats: js.Array[String]
  var parserOptions: PartialFastCsvParserOptio
  var sheetName: String
  def map(value: js.Any, index: Double): js.Any
}

object CsvReadOptions {
  @scala.inline
  def apply(
    dateFormats: js.Array[String],
    map: (js.Any, Double) => js.Any,
    parserOptions: PartialFastCsvParserOptio,
    sheetName: String
  ): CsvReadOptions = {
    val __obj = js.Dynamic.literal(dateFormats = dateFormats.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), parserOptions = parserOptions.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CsvReadOptions]
  }
}

