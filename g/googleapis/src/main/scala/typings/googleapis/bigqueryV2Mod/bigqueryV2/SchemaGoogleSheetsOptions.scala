package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSheetsOptions extends StObject {
  
  /**
    * [Beta] [Optional] Range of a sheet to query from. Only used when
    * non-empty. Typical format:
    * sheet_name!top_left_cell_id:bottom_right_cell_id For example:
    * sheet1!A1:B20
    */
  var range: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The number of rows at the top of a sheet that BigQuery will
    * skip when reading the data. The default value is 0. This property is
    * useful if you have header rows that should be skipped. When autodetect is
    * on, behavior is the following: * skipLeadingRows unspecified - Autodetect
    * tries to detect headers in the first row. If they are not detected, the
    * row is read as data. Otherwise data is read starting from the second row.
    * * skipLeadingRows is 0 - Instructs autodetect that there are no headers
    * and data should be read starting from the first row. * skipLeadingRows =
    * N &gt; 0 - Autodetect skips N-1 rows and tries to detect headers in row
    * N. If headers are not detected, row N is just skipped. Otherwise row N is
    * used to extract column names for the detected schema.
    */
  var skipLeadingRows: js.UndefOr[String] = js.undefined
}
object SchemaGoogleSheetsOptions {
  
  @scala.inline
  def apply(): SchemaGoogleSheetsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSheetsOptions]
  }
  
  @scala.inline
  implicit class SchemaGoogleSheetsOptionsMutableBuilder[Self <: SchemaGoogleSheetsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSkipLeadingRows(value: String): Self = StObject.set(x, "skipLeadingRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipLeadingRowsUndefined: Self = StObject.set(x, "skipLeadingRows", js.undefined)
  }
}
