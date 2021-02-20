package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.CsvReadOptions> */
@js.native
trait PartialCsvReadOptions extends StObject {
  
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
  implicit class PartialCsvReadOptionsMutableBuilder[Self <: PartialCsvReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormats(value: js.Array[String]): Self = StObject.set(x, "dateFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatsUndefined: Self = StObject.set(x, "dateFormats", js.undefined)
    
    @scala.inline
    def setDateFormatsVarargs(value: String*): Self = StObject.set(x, "dateFormats", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: (/* value */ js.Any, /* index */ Double) => _): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setParserOptions(value: PartialFastCsvParserOptio): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserOptionsUndefined: Self = StObject.set(x, "parserOptions", js.undefined)
    
    @scala.inline
    def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
  }
}
