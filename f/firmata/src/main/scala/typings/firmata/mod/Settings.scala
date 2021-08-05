package typings.firmata.mod

import typings.firmata.anon.BaudRate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var reportVersionTimeout: Double
  
  var samplingInterval: Double
  
  var serialport: BaudRate
}
object Settings {
  
  inline def apply(reportVersionTimeout: Double, samplingInterval: Double, serialport: BaudRate): Settings = {
    val __obj = js.Dynamic.literal(reportVersionTimeout = reportVersionTimeout.asInstanceOf[js.Any], samplingInterval = samplingInterval.asInstanceOf[js.Any], serialport = serialport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setReportVersionTimeout(value: Double): Self = StObject.set(x, "reportVersionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
    
    inline def setSerialport(value: BaudRate): Self = StObject.set(x, "serialport", value.asInstanceOf[js.Any])
  }
}
