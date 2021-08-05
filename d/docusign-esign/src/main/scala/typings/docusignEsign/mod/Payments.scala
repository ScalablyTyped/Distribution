package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payments extends StObject {
  
  /**
    * Reserved: TBD
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * A sender-defined description of the line item.
    *
    */
  var description: js.UndefOr[String] = js.undefined
  
  var paymentDate: js.UndefOr[String] = js.undefined
  
  var paymentId: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, a PDF version of the invoice is available.
    *
    * To get the PDF, make the call again and change "Accept:" in the header to "Accept: application/pdf".
    */
  var paymentNumber: js.UndefOr[String] = js.undefined
}
object Payments {
  
  inline def apply(): Payments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payments]
  }
  
  extension [Self <: Payments](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
    
    inline def setPaymentDateUndefined: Self = StObject.set(x, "paymentDate", js.undefined)
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
    
    inline def setPaymentNumber(value: String): Self = StObject.set(x, "paymentNumber", value.asInstanceOf[js.Any])
    
    inline def setPaymentNumberUndefined: Self = StObject.set(x, "paymentNumber", js.undefined)
  }
}
