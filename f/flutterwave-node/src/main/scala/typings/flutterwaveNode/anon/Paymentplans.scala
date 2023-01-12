package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paymentplans extends StObject {
  
  var page_info: Currentpage
  
  var paymentplans: js.Array[Datecreated]
}
object Paymentplans {
  
  inline def apply(page_info: Currentpage, paymentplans: js.Array[Datecreated]): Paymentplans = {
    val __obj = js.Dynamic.literal(page_info = page_info.asInstanceOf[js.Any], paymentplans = paymentplans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paymentplans]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paymentplans] (val x: Self) extends AnyVal {
    
    inline def setPage_info(value: Currentpage): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
    
    inline def setPaymentplans(value: js.Array[Datecreated]): Self = StObject.set(x, "paymentplans", value.asInstanceOf[js.Any])
    
    inline def setPaymentplansVarargs(value: Datecreated*): Self = StObject.set(x, "paymentplans", js.Array(value*))
  }
}
