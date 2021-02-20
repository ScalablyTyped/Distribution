package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceRequest extends StObject {
  
  var Capabilities: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  var Count: js.UndefOr[Double] = js.native
  
  var DeviceIDs: js.UndefOr[js.Array[String]] = js.native
  
  var Driver: js.UndefOr[String] = js.native
  
  var Options: js.UndefOr[StringDictionary[String]] = js.native
}
object DeviceRequest {
  
  @scala.inline
  def apply(): DeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceRequest]
  }
  
  @scala.inline
  implicit class DeviceRequestMutableBuilder[Self <: DeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: js.Array[js.Array[String]]): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: js.Array[String]*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setDeviceIDs(value: js.Array[String]): Self = StObject.set(x, "DeviceIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIDsUndefined: Self = StObject.set(x, "DeviceIDs", js.undefined)
    
    @scala.inline
    def setDeviceIDsVarargs(value: String*): Self = StObject.set(x, "DeviceIDs", js.Array(value :_*))
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverUndefined: Self = StObject.set(x, "Driver", js.undefined)
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
  }
}
