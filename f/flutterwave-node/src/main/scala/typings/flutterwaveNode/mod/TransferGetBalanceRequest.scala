package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferGetBalanceRequest extends StObject {
  
  var currency: js.UndefOr[String] = js.undefined
}
object TransferGetBalanceRequest {
  
  inline def apply(): TransferGetBalanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferGetBalanceRequest]
  }
  
  extension [Self <: TransferGetBalanceRequest](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
  }
}
