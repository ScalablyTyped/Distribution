package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.CsvReadOptions> */
@js.native
trait PartialCsvReadOptions extends js.Object {
  
  var dateFormats: js.UndefOr[js.Array[String]] = js.native
  
  var map: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, _]] = js.native
  
  var parserOptions: js.UndefOr[PartialFastCsvParserOptio] = js.native
  
  var sheetName: js.UndefOr[String] = js.native
}
object PartialCsvReadOptions {
  
  @scala.inline
  def apply(): PartialCsvReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCsvReadOptions]
  }
  
  @scala.inline
  implicit class PartialCsvReadOptionsOps[Self <: PartialCsvReadOptions] (val x: Self) extends AnyVal {
    
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
    def deleteDateFormats: Self = this.set("dateFormats", js.undefined)
    
    @scala.inline
    def setMap(value: (/* value */ js.Any, /* index */ Double) => _): Self = this.set("map", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setParserOptions(value: PartialFastCsvParserOptio): Self = this.set("parserOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParserOptions: Self = this.set("parserOptions", js.undefined)
    
    @scala.inline
    def setSheetName(value: String): Self = this.set("sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetName: Self = this.set("sheetName", js.undefined)
  }
}
