package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apnsdevicetoken extends StObject {
  
  var apns_device_token: js.UndefOr[String] = js.undefined
  
  var apns_environment: js.UndefOr[String] = js.undefined
}
object Apnsdevicetoken {
  
  inline def apply(): Apnsdevicetoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apnsdevicetoken]
  }
  
  extension [Self <: Apnsdevicetoken](x: Self) {
    
    inline def setApns_device_token(value: String): Self = StObject.set(x, "apns_device_token", value.asInstanceOf[js.Any])
    
    inline def setApns_device_tokenUndefined: Self = StObject.set(x, "apns_device_token", js.undefined)
    
    inline def setApns_environment(value: String): Self = StObject.set(x, "apns_environment", value.asInstanceOf[js.Any])
    
    inline def setApns_environmentUndefined: Self = StObject.set(x, "apns_environment", js.undefined)
  }
}
