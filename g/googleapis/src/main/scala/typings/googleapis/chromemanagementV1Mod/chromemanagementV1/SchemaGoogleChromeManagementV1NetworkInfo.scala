package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1NetworkInfo extends StObject {
  
  /**
    * Output only. List of network devices.
    */
  var networkDevices: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1NetworkDevice]] = js.undefined
}
object SchemaGoogleChromeManagementV1NetworkInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1NetworkInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1NetworkInfo](x: Self) {
    
    inline def setNetworkDevices(value: js.Array[SchemaGoogleChromeManagementV1NetworkDevice]): Self = StObject.set(x, "networkDevices", value.asInstanceOf[js.Any])
    
    inline def setNetworkDevicesUndefined: Self = StObject.set(x, "networkDevices", js.undefined)
    
    inline def setNetworkDevicesVarargs(value: SchemaGoogleChromeManagementV1NetworkDevice*): Self = StObject.set(x, "networkDevices", js.Array(value*))
  }
}
