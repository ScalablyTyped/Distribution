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
  
  @scala.inline
  def apply(reportVersionTimeout: Double, samplingInterval: Double, serialport: BaudRate): Settings = {
    val __obj = js.Dynamic.literal(reportVersionTimeout = reportVersionTimeout.asInstanceOf[js.Any], samplingInterval = samplingInterval.asInstanceOf[js.Any], serialport = serialport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportVersionTimeout(value: Double): Self = StObject.set(x, "reportVersionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialport(value: BaudRate): Self = StObject.set(x, "serialport", value.asInstanceOf[js.Any])
  }
}
