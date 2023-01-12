package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileMoney extends StObject {
  
  def francophone(data: MobileMoneyFrancophoneRequest): js.Promise[AxiosResponse[MobileMoneyFrancophoneResponse, Any]]
  
  def ghana(data: MobileMoneyGhanaRequest): js.Promise[AxiosResponse[MobileMoneyGhanaResponse, Any]]
  
  def mpesa(data: MobileMoneyMpesaRequest): js.Promise[AxiosResponse[MobileMoneyMpesaResponse, Any]]
  
  def rwanda(data: MobileMoneyRwandaRequest): js.Promise[AxiosResponse[MobileMoneyRwandaResponse, Any]]
  
  def uganda(data: MobileMoneyUgandaRequest): js.Promise[AxiosResponse[MobileMoneyUgandaResponse, Any]]
  
  def zambia(data: MobileMoneyZambiaRequest): js.Promise[AxiosResponse[MobileMoneyZambiaResponse, Any]]
}
object MobileMoney {
  
  inline def apply(
    francophone: MobileMoneyFrancophoneRequest => js.Promise[AxiosResponse[MobileMoneyFrancophoneResponse, Any]],
    ghana: MobileMoneyGhanaRequest => js.Promise[AxiosResponse[MobileMoneyGhanaResponse, Any]],
    mpesa: MobileMoneyMpesaRequest => js.Promise[AxiosResponse[MobileMoneyMpesaResponse, Any]],
    rwanda: MobileMoneyRwandaRequest => js.Promise[AxiosResponse[MobileMoneyRwandaResponse, Any]],
    uganda: MobileMoneyUgandaRequest => js.Promise[AxiosResponse[MobileMoneyUgandaResponse, Any]],
    zambia: MobileMoneyZambiaRequest => js.Promise[AxiosResponse[MobileMoneyZambiaResponse, Any]]
  ): MobileMoney = {
    val __obj = js.Dynamic.literal(francophone = js.Any.fromFunction1(francophone), ghana = js.Any.fromFunction1(ghana), mpesa = js.Any.fromFunction1(mpesa), rwanda = js.Any.fromFunction1(rwanda), uganda = js.Any.fromFunction1(uganda), zambia = js.Any.fromFunction1(zambia))
    __obj.asInstanceOf[MobileMoney]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileMoney] (val x: Self) extends AnyVal {
    
    inline def setFrancophone(
      value: MobileMoneyFrancophoneRequest => js.Promise[AxiosResponse[MobileMoneyFrancophoneResponse, Any]]
    ): Self = StObject.set(x, "francophone", js.Any.fromFunction1(value))
    
    inline def setGhana(value: MobileMoneyGhanaRequest => js.Promise[AxiosResponse[MobileMoneyGhanaResponse, Any]]): Self = StObject.set(x, "ghana", js.Any.fromFunction1(value))
    
    inline def setMpesa(value: MobileMoneyMpesaRequest => js.Promise[AxiosResponse[MobileMoneyMpesaResponse, Any]]): Self = StObject.set(x, "mpesa", js.Any.fromFunction1(value))
    
    inline def setRwanda(value: MobileMoneyRwandaRequest => js.Promise[AxiosResponse[MobileMoneyRwandaResponse, Any]]): Self = StObject.set(x, "rwanda", js.Any.fromFunction1(value))
    
    inline def setUganda(value: MobileMoneyUgandaRequest => js.Promise[AxiosResponse[MobileMoneyUgandaResponse, Any]]): Self = StObject.set(x, "uganda", js.Any.fromFunction1(value))
    
    inline def setZambia(value: MobileMoneyZambiaRequest => js.Promise[AxiosResponse[MobileMoneyZambiaResponse, Any]]): Self = StObject.set(x, "zambia", js.Any.fromFunction1(value))
  }
}
