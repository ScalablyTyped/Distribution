package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.CsvWriteOptions> */
trait PartialCsvWriteOptions extends StObject {
  
  var dateFormat: js.UndefOr[String] = js.undefined
  
  var dateUTC: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var formatterOptions: js.UndefOr[PartialFastCsvFormatterOp] = js.undefined
  
  var includeEmptyRows: js.UndefOr[Boolean] = js.undefined
  
  var map: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, js.Any]] = js.undefined
  
  var sheetId: js.UndefOr[Double] = js.undefined
  
  var sheetName: js.UndefOr[String] = js.undefined
}
object PartialCsvWriteOptions {
  
  @scala.inline
  def apply(): PartialCsvWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCsvWriteOptions]
  }
  
  @scala.inline
  implicit class PartialCsvWriteOptionsMutableBuilder[Self <: PartialCsvWriteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDateUTC(value: Boolean): Self = StObject.set(x, "dateUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUTCUndefined: Self = StObject.set(x, "dateUTC", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFormatterOptions(value: PartialFastCsvFormatterOp): Self = StObject.set(x, "formatterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterOptionsUndefined: Self = StObject.set(x, "formatterOptions", js.undefined)
    
    @scala.inline
    def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEmptyRowsUndefined: Self = StObject.set(x, "includeEmptyRows", js.undefined)
    
    @scala.inline
    def setMap(value: (/* value */ js.Any, /* index */ Double) => js.Any): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    @scala.inline
    def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
  }
}
