package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refund extends StObject {
  
  def refund(data: RefundRefundRequest): js.Promise[AxiosResponse[RefundRefundResponse, Any]]
}
object Refund {
  
  inline def apply(refund: RefundRefundRequest => js.Promise[AxiosResponse[RefundRefundResponse, Any]]): Refund = {
    val __obj = js.Dynamic.literal(refund = js.Any.fromFunction1(refund))
    __obj.asInstanceOf[Refund]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Refund] (val x: Self) extends AnyVal {
    
    inline def setRefund(value: RefundRefundRequest => js.Promise[AxiosResponse[RefundRefundResponse, Any]]): Self = StObject.set(x, "refund", js.Any.fromFunction1(value))
  }
}
