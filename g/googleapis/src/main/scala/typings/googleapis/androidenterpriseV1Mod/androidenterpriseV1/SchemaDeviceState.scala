package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceState extends StObject {
  
  /**
    * The state of the Google account on the device. "enabled" indicates that the Google account on the device can be used to access Google services (including Google Play), while "disabled" means that it cannot. A new device is initially in the "disabled" state.
    */
  var accountState: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceState {
  
  inline def apply(): SchemaDeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceState]
  }
  
  extension [Self <: SchemaDeviceState](x: Self) {
    
    inline def setAccountState(value: String): Self = StObject.set(x, "accountState", value.asInstanceOf[js.Any])
    
    inline def setAccountStateNull: Self = StObject.set(x, "accountState", null)
    
    inline def setAccountStateUndefined: Self = StObject.set(x, "accountState", js.undefined)
  }
}
