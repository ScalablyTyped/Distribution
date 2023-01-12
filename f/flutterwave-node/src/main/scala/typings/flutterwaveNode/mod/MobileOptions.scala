package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileOptions extends StObject {
  
  def chargeUssd(data: MobileOptionsChargeUssdRequest): js.Promise[AxiosResponse[MobileOptionsChargeUssdResponse, Any]]
}
object MobileOptions {
  
  inline def apply(
    chargeUssd: MobileOptionsChargeUssdRequest => js.Promise[AxiosResponse[MobileOptionsChargeUssdResponse, Any]]
  ): MobileOptions = {
    val __obj = js.Dynamic.literal(chargeUssd = js.Any.fromFunction1(chargeUssd))
    __obj.asInstanceOf[MobileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileOptions] (val x: Self) extends AnyVal {
    
    inline def setChargeUssd(
      value: MobileOptionsChargeUssdRequest => js.Promise[AxiosResponse[MobileOptionsChargeUssdResponse, Any]]
    ): Self = StObject.set(x, "chargeUssd", js.Any.fromFunction1(value))
  }
}
