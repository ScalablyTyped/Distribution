package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  @JSName("$col$row")
  var DollarcolDollarrow: String
  
  var address: String
  
  var col: String
  
  var row: String
  
  var sheetName: js.UndefOr[String] = js.undefined
}
object Address {
  
  @scala.inline
  def apply(DollarcolDollarrow: String, address: String, col: String, row: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.updateDynamic("$col$row")(DollarcolDollarrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCol(value: String): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarcolDollarrow(value: String): Self = StObject.set(x, "$col$row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
  }
}
