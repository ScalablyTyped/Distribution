package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subaccounts extends StObject {
  
  var page_info: Currentpage
  
  var subaccounts: js.Array[Accountbank]
}
object Subaccounts {
  
  inline def apply(page_info: Currentpage, subaccounts: js.Array[Accountbank]): Subaccounts = {
    val __obj = js.Dynamic.literal(page_info = page_info.asInstanceOf[js.Any], subaccounts = subaccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subaccounts]
  }
  
  extension [Self <: Subaccounts](x: Self) {
    
    inline def setPage_info(value: Currentpage): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
    
    inline def setSubaccounts(value: js.Array[Accountbank]): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    inline def setSubaccountsVarargs(value: Accountbank*): Self = StObject.set(x, "subaccounts", js.Array(value*))
  }
}
