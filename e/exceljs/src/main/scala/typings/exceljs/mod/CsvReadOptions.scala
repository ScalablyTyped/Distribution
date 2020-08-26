package typings.exceljs.mod

import typings.exceljs.anon.PartialFastCsvParserOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvReadOptions extends js.Object {
  var dateFormats: js.Array[String] = js.native
  var parserOptions: PartialFastCsvParserOptio = js.native
  var sheetName: String = js.native
  def map(value: js.Any, index: Double): js.Any = js.native
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
  @scala.inline
  implicit class CsvReadOptionsOps[Self <: CsvReadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDateFormatsVarargs(value: String*): Self = this.set("dateFormats", js.Array(value :_*))
    @scala.inline
    def setDateFormats(value: js.Array[String]): Self = this.set("dateFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: (js.Any, Double) => js.Any): Self = this.set("map", js.Any.fromFunction2(value))
    @scala.inline
    def setParserOptions(value: PartialFastCsvParserOptio): Self = this.set("parserOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSheetName(value: String): Self = this.set("sheetName", value.asInstanceOf[js.Any])
  }
  
}

