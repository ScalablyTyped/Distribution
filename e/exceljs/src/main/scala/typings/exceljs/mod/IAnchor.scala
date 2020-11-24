package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnchor extends js.Object {
  
  var col: Double = js.native
  
  var nativeCol: Double = js.native
  
  var nativeColOff: Double = js.native
  
  var nativeRow: Double = js.native
  
  var nativeRowOff: Double = js.native
  
  var row: Double = js.native
}
object IAnchor {
  
  @scala.inline
  def apply(
    col: Double,
    nativeCol: Double,
    nativeColOff: Double,
    nativeRow: Double,
    nativeRowOff: Double,
    row: Double
  ): IAnchor = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], nativeCol = nativeCol.asInstanceOf[js.Any], nativeColOff = nativeColOff.asInstanceOf[js.Any], nativeRow = nativeRow.asInstanceOf[js.Any], nativeRowOff = nativeRowOff.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnchor]
  }
  
  @scala.inline
  implicit class IAnchorOps[Self <: IAnchor] (val x: Self) extends AnyVal {
    
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeCol(value: Double): Self = this.set("nativeCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeColOff(value: Double): Self = this.set("nativeColOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeRow(value: Double): Self = this.set("nativeRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeRowOff(value: Double): Self = this.set("nativeRowOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
  }
}
