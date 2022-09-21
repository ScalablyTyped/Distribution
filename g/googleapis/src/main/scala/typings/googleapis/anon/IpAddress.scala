package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpAddress extends StObject {
  
  var ipAddress: js.UndefOr[String] = js.undefined
  
  var wanIpAddress: js.UndefOr[String] = js.undefined
}
object IpAddress {
  
  inline def apply(): IpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddress]
  }
  
  extension [Self <: IpAddress](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setWanIpAddress(value: String): Self = StObject.set(x, "wanIpAddress", value.asInstanceOf[js.Any])
    
    inline def setWanIpAddressUndefined: Self = StObject.set(x, "wanIpAddress", js.undefined)
  }
}
