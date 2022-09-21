package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  def charge(data: AccountChargeRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def validate(data: AccountValidateRequest): js.Promise[AxiosResponse[Any, Any]]
}
object Account {
  
  inline def apply(
    charge: AccountChargeRequest => js.Promise[AxiosResponse[Any, Any]],
    validate: AccountValidateRequest => js.Promise[AxiosResponse[Any, Any]]
  ): Account = {
    val __obj = js.Dynamic.literal(charge = js.Any.fromFunction1(charge), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setCharge(value: AccountChargeRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "charge", js.Any.fromFunction1(value))
    
    inline def setValidate(value: AccountValidateRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
