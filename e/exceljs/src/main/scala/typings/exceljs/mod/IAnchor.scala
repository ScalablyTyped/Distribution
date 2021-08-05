package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnchor extends StObject {
  
  var col: Double
  
  var nativeCol: Double
  
  var nativeColOff: Double
  
  var nativeRow: Double
  
  var nativeRowOff: Double
  
  var row: Double
}
object IAnchor {
  
  inline def apply(
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
  
  extension [Self <: IAnchor](x: Self) {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setNativeCol(value: Double): Self = StObject.set(x, "nativeCol", value.asInstanceOf[js.Any])
    
    inline def setNativeColOff(value: Double): Self = StObject.set(x, "nativeColOff", value.asInstanceOf[js.Any])
    
    inline def setNativeRow(value: Double): Self = StObject.set(x, "nativeRow", value.asInstanceOf[js.Any])
    
    inline def setNativeRowOff(value: Double): Self = StObject.set(x, "nativeRowOff", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
