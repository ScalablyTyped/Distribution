package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyTransaction extends StObject {
  
  def verify(data: VerifyTransactionVerifyRequest): js.Promise[AxiosResponse[VerifyTransactionVerifyResponse, Any]]
}
object VerifyTransaction {
  
  inline def apply(
    verify: VerifyTransactionVerifyRequest => js.Promise[AxiosResponse[VerifyTransactionVerifyResponse, Any]]
  ): VerifyTransaction = {
    val __obj = js.Dynamic.literal(verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[VerifyTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyTransaction] (val x: Self) extends AnyVal {
    
    inline def setVerify(
      value: VerifyTransactionVerifyRequest => js.Promise[AxiosResponse[VerifyTransactionVerifyResponse, Any]]
    ): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
  }
}
