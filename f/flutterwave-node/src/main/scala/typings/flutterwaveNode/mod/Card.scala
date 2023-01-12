package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  def charge(data: CardChargeRequest): js.Promise[js.Promise[AxiosResponse[CardChargeResponse, Any]]]
  
  def validate(data: CardValidateRequest): js.Promise[AxiosResponse[CardValidateResponse, Any]]
}
object Card {
  
  inline def apply(
    charge: CardChargeRequest => js.Promise[js.Promise[AxiosResponse[CardChargeResponse, Any]]],
    validate: CardValidateRequest => js.Promise[AxiosResponse[CardValidateResponse, Any]]
  ): Card = {
    val __obj = js.Dynamic.literal(charge = js.Any.fromFunction1(charge), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
    
    inline def setCharge(value: CardChargeRequest => js.Promise[js.Promise[AxiosResponse[CardChargeResponse, Any]]]): Self = StObject.set(x, "charge", js.Any.fromFunction1(value))
    
    inline def setValidate(value: CardValidateRequest => js.Promise[AxiosResponse[CardValidateResponse, Any]]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
