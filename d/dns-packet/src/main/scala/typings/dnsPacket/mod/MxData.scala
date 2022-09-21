package typings.dnsPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MxData extends StObject {
  
  var exchange: String
  
  var preference: js.UndefOr[Double] = js.undefined
}
object MxData {
  
  inline def apply(exchange: String): MxData = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MxData]
  }
  
  extension [Self <: MxData](x: Self) {
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setPreference(value: Double): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
  }
}
