package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPosture extends StObject {
  
  /**
    * Device's security posture value.
    */
  var devicePosture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional details regarding the security posture of the device.
    */
  var postureDetails: js.UndefOr[js.Array[SchemaPostureDetail]] = js.undefined
}
object SchemaSecurityPosture {
  
  inline def apply(): SchemaSecurityPosture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPosture]
  }
  
  extension [Self <: SchemaSecurityPosture](x: Self) {
    
    inline def setDevicePosture(value: String): Self = StObject.set(x, "devicePosture", value.asInstanceOf[js.Any])
    
    inline def setDevicePostureNull: Self = StObject.set(x, "devicePosture", null)
    
    inline def setDevicePostureUndefined: Self = StObject.set(x, "devicePosture", js.undefined)
    
    inline def setPostureDetails(value: js.Array[SchemaPostureDetail]): Self = StObject.set(x, "postureDetails", value.asInstanceOf[js.Any])
    
    inline def setPostureDetailsUndefined: Self = StObject.set(x, "postureDetails", js.undefined)
    
    inline def setPostureDetailsVarargs(value: SchemaPostureDetail*): Self = StObject.set(x, "postureDetails", js.Array(value*))
  }
}
