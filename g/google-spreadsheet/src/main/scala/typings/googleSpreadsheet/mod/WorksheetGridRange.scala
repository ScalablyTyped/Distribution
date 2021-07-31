package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetGridRange extends StObject {
  
  var endColumnIndex: Double
  
  var endRowIndex: Double
  
  var startColumnIndex: Double
  
  var startRowIndex: Double
}
object WorksheetGridRange {
  
  @scala.inline
  def apply(endColumnIndex: Double, endRowIndex: Double, startColumnIndex: Double, startRowIndex: Double): WorksheetGridRange = {
    val __obj = js.Dynamic.literal(endColumnIndex = endColumnIndex.asInstanceOf[js.Any], endRowIndex = endRowIndex.asInstanceOf[js.Any], startColumnIndex = startColumnIndex.asInstanceOf[js.Any], startRowIndex = startRowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetGridRange]
  }
  
  @scala.inline
  implicit class WorksheetGridRangeMutableBuilder[Self <: WorksheetGridRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumnIndex(value: Double): Self = StObject.set(x, "endColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRowIndex(value: Double): Self = StObject.set(x, "endRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumnIndex(value: Double): Self = StObject.set(x, "startColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRowIndex(value: Double): Self = StObject.set(x, "startRowIndex", value.asInstanceOf[js.Any])
  }
}
