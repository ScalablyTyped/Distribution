package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnchor extends StObject {
  
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
  implicit class IAnchorMutableBuilder[Self <: IAnchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeCol(value: Double): Self = StObject.set(x, "nativeCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeColOff(value: Double): Self = StObject.set(x, "nativeColOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeRow(value: Double): Self = StObject.set(x, "nativeRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeRowOff(value: Double): Self = StObject.set(x, "nativeRowOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
