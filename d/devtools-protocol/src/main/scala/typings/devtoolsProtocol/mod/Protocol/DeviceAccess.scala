package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeviceAccess {
  
  trait CancelPromptRequest extends StObject {
    
    var id: RequestId
  }
  object CancelPromptRequest {
    
    inline def apply(id: RequestId): CancelPromptRequest = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelPromptRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancelPromptRequest] (val x: Self) extends AnyVal {
      
      inline def setId(value: RequestId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type DeviceId = String
  
  trait DeviceRequestPromptedEvent extends StObject {
    
    var devices: js.Array[PromptDevice]
    
    var id: RequestId
  }
  object DeviceRequestPromptedEvent {
    
    inline def apply(devices: js.Array[PromptDevice], id: RequestId): DeviceRequestPromptedEvent = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceRequestPromptedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceRequestPromptedEvent] (val x: Self) extends AnyVal {
      
      inline def setDevices(value: js.Array[PromptDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesVarargs(value: PromptDevice*): Self = StObject.set(x, "devices", js.Array(value*))
      
      inline def setId(value: RequestId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromptDevice extends StObject {
    
    var id: DeviceId
    
    /**
      * Display name as it appears in a device request user prompt.
      */
    var name: String
  }
  object PromptDevice {
    
    inline def apply(id: DeviceId, name: String): PromptDevice = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptDevice]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptDevice] (val x: Self) extends AnyVal {
      
      inline def setId(value: DeviceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestId = String
  
  trait SelectPromptRequest extends StObject {
    
    var deviceId: DeviceId
    
    var id: RequestId
  }
  object SelectPromptRequest {
    
    inline def apply(deviceId: DeviceId, id: RequestId): SelectPromptRequest = {
      val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectPromptRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectPromptRequest] (val x: Self) extends AnyVal {
      
      inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setId(value: RequestId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
