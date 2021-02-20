package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends StObject {
  
  @JSName("$col$row")
  var DollarcolDollarrow: String = js.native
  
  var address: String = js.native
  
  var col: String = js.native
  
  var row: String = js.native
  
  var sheetName: js.UndefOr[String] = js.native
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
