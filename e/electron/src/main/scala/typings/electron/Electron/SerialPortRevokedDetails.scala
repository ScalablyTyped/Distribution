package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPortRevokedDetails extends StObject {
  
  var frame: WebFrameMain_
  
  /**
    * The origin that the device has been revoked from.
    */
  var origin: String
  
  var port: SerialPort
}
object SerialPortRevokedDetails {
  
  inline def apply(frame: WebFrameMain_, origin: String, port: SerialPort): SerialPortRevokedDetails = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortRevokedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerialPortRevokedDetails] (val x: Self) extends AnyVal {
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPort(value: SerialPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
