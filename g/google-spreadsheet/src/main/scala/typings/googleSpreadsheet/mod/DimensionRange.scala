package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionRange extends StObject {
  
  var dimension: Dimension
  
  var endIndex: Double
  
  var sheetId: Double
  
  var startIndex: Double
}
object DimensionRange {
  
  @scala.inline
  def apply(dimension: Dimension, endIndex: Double, sheetId: Double, startIndex: Double): DimensionRange = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], endIndex = endIndex.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionRange]
  }
  
  @scala.inline
  implicit class DimensionRangeMutableBuilder[Self <: DimensionRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimension(value: Dimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
  }
}
