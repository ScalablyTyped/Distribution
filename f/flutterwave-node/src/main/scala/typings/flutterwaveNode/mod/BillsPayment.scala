package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillsPayment extends StObject {
  
  def bills(data: BillsPaymentBillsRequest): js.Promise[AxiosResponse[BillsPaymentBillsResponse, Any]]
}
object BillsPayment {
  
  inline def apply(bills: BillsPaymentBillsRequest => js.Promise[AxiosResponse[BillsPaymentBillsResponse, Any]]): BillsPayment = {
    val __obj = js.Dynamic.literal(bills = js.Any.fromFunction1(bills))
    __obj.asInstanceOf[BillsPayment]
  }
  
  extension [Self <: BillsPayment](x: Self) {
    
    inline def setBills(value: BillsPaymentBillsRequest => js.Promise[AxiosResponse[BillsPaymentBillsResponse, Any]]): Self = StObject.set(x, "bills", js.Any.fromFunction1(value))
  }
}
