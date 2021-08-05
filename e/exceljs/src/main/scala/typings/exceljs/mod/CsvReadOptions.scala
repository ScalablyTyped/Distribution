package typings.exceljs.mod

import typings.exceljs.anon.PartialFastCsvParserOptio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvReadOptions extends StObject {
  
  var dateFormats: js.Array[String]
  
  def map(value: js.Any, index: Double): js.Any
  
  var parserOptions: PartialFastCsvParserOptio
  
  var sheetName: String
}
object CsvReadOptions {
  
  inline def apply(
    dateFormats: js.Array[String],
    map: (js.Any, Double) => js.Any,
    parserOptions: PartialFastCsvParserOptio,
    sheetName: String
  ): CsvReadOptions = {
    val __obj = js.Dynamic.literal(dateFormats = dateFormats.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), parserOptions = parserOptions.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvReadOptions]
  }
  
  extension [Self <: CsvReadOptions](x: Self) {
    
    inline def setDateFormats(value: js.Array[String]): Self = StObject.set(x, "dateFormats", value.asInstanceOf[js.Any])
    
    inline def setDateFormatsVarargs(value: String*): Self = StObject.set(x, "dateFormats", js.Array(value :_*))
    
    inline def setMap(value: (js.Any, Double) => js.Any): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setParserOptions(value: PartialFastCsvParserOptio): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
    
    inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
  }
}
