package typings.exceljs.mod

import typings.exceljs.anon.PartialFastCsvFormatterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsvWriteOptions extends StObject {
  
  var dateFormat: String = js.native
  
  var dateUTC: Boolean = js.native
  
  var encoding: String = js.native
  
  var formatterOptions: PartialFastCsvFormatterOp = js.native
  
  var includeEmptyRows: Boolean = js.native
  
  def map(value: js.Any, index: Double): js.Any = js.native
  
  var sheetId: Double = js.native
  
  var sheetName: String = js.native
}
object CsvWriteOptions {
  
  @scala.inline
  def apply(
    dateFormat: String,
    dateUTC: Boolean,
    encoding: String,
    formatterOptions: PartialFastCsvFormatterOp,
    includeEmptyRows: Boolean,
    map: (js.Any, Double) => js.Any,
    sheetId: Double,
    sheetName: String
  ): CsvWriteOptions = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateUTC = dateUTC.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], formatterOptions = formatterOptions.asInstanceOf[js.Any], includeEmptyRows = includeEmptyRows.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), sheetId = sheetId.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvWriteOptions]
  }
  
  @scala.inline
  implicit class CsvWriteOptionsMutableBuilder[Self <: CsvWriteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUTC(value: Boolean): Self = StObject.set(x, "dateUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterOptions(value: PartialFastCsvFormatterOp): Self = StObject.set(x, "formatterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: (js.Any, Double) => js.Any): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
  }
}
