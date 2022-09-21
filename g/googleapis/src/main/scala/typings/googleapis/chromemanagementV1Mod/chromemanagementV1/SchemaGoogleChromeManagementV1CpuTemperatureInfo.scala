package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1CpuTemperatureInfo extends StObject {
  
  /**
    * Output only. CPU label. Example: Core 0
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. CPU temperature in Celsius.
    */
  var temperatureCelsius: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1CpuTemperatureInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1CpuTemperatureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1CpuTemperatureInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1CpuTemperatureInfo](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTemperatureCelsius(value: Double): Self = StObject.set(x, "temperatureCelsius", value.asInstanceOf[js.Any])
    
    inline def setTemperatureCelsiusNull: Self = StObject.set(x, "temperatureCelsius", null)
    
    inline def setTemperatureCelsiusUndefined: Self = StObject.set(x, "temperatureCelsius", js.undefined)
  }
}
