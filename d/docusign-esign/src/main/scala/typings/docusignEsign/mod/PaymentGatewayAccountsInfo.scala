package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentGatewayAccountsInfo extends StObject {
  
  /**
    * A list of payment gateway accounts.
    */
  var paymentGatewayAccounts: js.UndefOr[
    js.Array[
      /* This object contains details about a payment gateway account. */ PaymentGatewayAccount
    ]
  ] = js.undefined
}
object PaymentGatewayAccountsInfo {
  
  inline def apply(): PaymentGatewayAccountsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentGatewayAccountsInfo]
  }
  
  extension [Self <: PaymentGatewayAccountsInfo](x: Self) {
    
    inline def setPaymentGatewayAccounts(
      value: js.Array[
          /* This object contains details about a payment gateway account. */ PaymentGatewayAccount
        ]
    ): Self = StObject.set(x, "paymentGatewayAccounts", value.asInstanceOf[js.Any])
    
    inline def setPaymentGatewayAccountsUndefined: Self = StObject.set(x, "paymentGatewayAccounts", js.undefined)
    
    inline def setPaymentGatewayAccountsVarargs(
      value: (/* This object contains details about a payment gateway account. */ PaymentGatewayAccount)*
    ): Self = StObject.set(x, "paymentGatewayAccounts", js.Array(value*))
  }
}
