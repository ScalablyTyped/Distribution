package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesDevicesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the device in the form enterprises/{enterpriseId\}/devices/{deviceId\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional flags that control the device wiping behavior.
    */
  var wipeDataFlags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. A short message displayed to the user before wiping the work profile on personal devices. This has no effect on company owned devices. The maximum message length is 200 characters.
    */
  var wipeReasonMessage: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesDevicesDelete {
  
  inline def apply(): ParamsResourceEnterprisesDevicesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesDevicesDelete]
  }
  
  extension [Self <: ParamsResourceEnterprisesDevicesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWipeDataFlags(value: js.Array[String]): Self = StObject.set(x, "wipeDataFlags", value.asInstanceOf[js.Any])
    
    inline def setWipeDataFlagsUndefined: Self = StObject.set(x, "wipeDataFlags", js.undefined)
    
    inline def setWipeDataFlagsVarargs(value: String*): Self = StObject.set(x, "wipeDataFlags", js.Array(value*))
    
    inline def setWipeReasonMessage(value: String): Self = StObject.set(x, "wipeReasonMessage", value.asInstanceOf[js.Any])
    
    inline def setWipeReasonMessageUndefined: Self = StObject.set(x, "wipeReasonMessage", js.undefined)
  }
}
