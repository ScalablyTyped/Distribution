package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualAccount extends StObject {
  
  def accountNumber(data: VirtualAccountAccountNumberRequest): js.Promise[AxiosResponse[VirtualAccountAccountNumberResponse, Any]]
}
object VirtualAccount {
  
  inline def apply(
    accountNumber: VirtualAccountAccountNumberRequest => js.Promise[AxiosResponse[VirtualAccountAccountNumberResponse, Any]]
  ): VirtualAccount = {
    val __obj = js.Dynamic.literal(accountNumber = js.Any.fromFunction1(accountNumber))
    __obj.asInstanceOf[VirtualAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountNumber(
      value: VirtualAccountAccountNumberRequest => js.Promise[AxiosResponse[VirtualAccountAccountNumberResponse, Any]]
    ): Self = StObject.set(x, "accountNumber", js.Any.fromFunction1(value))
  }
}
