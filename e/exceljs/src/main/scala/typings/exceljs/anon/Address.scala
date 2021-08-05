package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: String
  
  var col: String
  
  var row: String
  
  var sheetName: String
}
object Address {
  
  inline def apply(address: String, col: String, row: String, sheetName: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCol(value: String): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
  }
}
