package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothPairingHandlerHandlerDetails extends StObject {
  
  var deviceId: String
  
  var frame: WebFrameMain_
  
  /**
    * The type of pairing prompt being requested. One of the following values:
    */
  var pairingKind: "confirm" | "confirmPin" | "providePin"
  
  /**
    * The pin value to verify if `pairingKind` is `confirmPin`.
    */
  var pin: js.UndefOr[String] = js.undefined
}
object BluetoothPairingHandlerHandlerDetails {
  
  inline def apply(deviceId: String, frame: WebFrameMain_, pairingKind: "confirm" | "confirmPin" | "providePin"): BluetoothPairingHandlerHandlerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], pairingKind = pairingKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothPairingHandlerHandlerDetails]
  }
  
  extension [Self <: BluetoothPairingHandlerHandlerDetails](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setPairingKind(value: "confirm" | "confirmPin" | "providePin"): Self = StObject.set(x, "pairingKind", value.asInstanceOf[js.Any])
    
    inline def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
  }
}
