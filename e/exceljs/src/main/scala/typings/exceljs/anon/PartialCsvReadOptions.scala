package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.CsvReadOptions> */
trait PartialCsvReadOptions extends StObject {
  
  var dateFormats: js.UndefOr[js.Array[String]] = js.undefined
  
  var map: js.UndefOr[js.Function2[/* value */ Any, /* index */ Double, Any]] = js.undefined
  
  var parserOptions: js.UndefOr[PartialFastCsvParserOptio] = js.undefined
  
  var sheetName: js.UndefOr[String] = js.undefined
}
object PartialCsvReadOptions {
  
  inline def apply(): PartialCsvReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCsvReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCsvReadOptions] (val x: Self) extends AnyVal {
    
    inline def setDateFormats(value: js.Array[String]): Self = StObject.set(x, "dateFormats", value.asInstanceOf[js.Any])
    
    inline def setDateFormatsUndefined: Self = StObject.set(x, "dateFormats", js.undefined)
    
    inline def setDateFormatsVarargs(value: String*): Self = StObject.set(x, "dateFormats", js.Array(value*))
    
    inline def setMap(value: (/* value */ Any, /* index */ Double) => Any): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setParserOptions(value: PartialFastCsvParserOptio): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
    
    inline def setParserOptionsUndefined: Self = StObject.set(x, "parserOptions", js.undefined)
    
    inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    inline def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
  }
}
