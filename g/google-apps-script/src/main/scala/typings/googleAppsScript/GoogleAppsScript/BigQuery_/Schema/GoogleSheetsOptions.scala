package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSheetsOptions extends StObject {
  
  var range: js.UndefOr[String] = js.undefined
  
  var skipLeadingRows: js.UndefOr[String] = js.undefined
}
object GoogleSheetsOptions {
  
  @scala.inline
  def apply(): GoogleSheetsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSheetsOptions]
  }
  
  @scala.inline
  implicit class GoogleSheetsOptionsMutableBuilder[Self <: GoogleSheetsOptions] (val x: Self) extends AnyVal {
    
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
