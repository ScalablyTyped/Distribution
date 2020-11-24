package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionRange extends js.Object {
  
  var dimension: Dimension = js.native
  
  var endIndex: Double = js.native
  
  var sheetId: Double = js.native
  
  var startIndex: Double = js.native
}
object DimensionRange {
  
  @scala.inline
  def apply(dimension: Dimension, endIndex: Double, sheetId: Double, startIndex: Double): DimensionRange = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], endIndex = endIndex.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionRange]
  }
  
  @scala.inline
  implicit class DimensionRangeOps[Self <: DimensionRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDimension(value: Dimension): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
  }
}
