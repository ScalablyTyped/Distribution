package typings.exceljs.mod

import typings.exceljs.anon.PartialFastCsvFormatterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvWriteOptions extends StObject {
  
  var dateFormat: String
  
  var dateUTC: Boolean
  
  var encoding: String
  
  var formatterOptions: PartialFastCsvFormatterOp
  
  var includeEmptyRows: Boolean
  
  def map(value: Any, index: Double): Any
  
  var sheetId: Double
  
  var sheetName: String
}
object CsvWriteOptions {
  
  inline def apply(
    dateFormat: String,
    dateUTC: Boolean,
    encoding: String,
    formatterOptions: PartialFastCsvFormatterOp,
    includeEmptyRows: Boolean,
    map: (Any, Double) => Any,
    sheetId: Double,
    sheetName: String
  ): CsvWriteOptions = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateUTC = dateUTC.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], formatterOptions = formatterOptions.asInstanceOf[js.Any], includeEmptyRows = includeEmptyRows.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), sheetId = sheetId.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvWriteOptions]
  }
  
  extension [Self <: CsvWriteOptions](x: Self) {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateUTC(value: Boolean): Self = StObject.set(x, "dateUTC", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFormatterOptions(value: PartialFastCsvFormatterOp): Self = StObject.set(x, "formatterOptions", value.asInstanceOf[js.Any])
    
    inline def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
    
    inline def setMap(value: (Any, Double) => Any): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
  }
}
