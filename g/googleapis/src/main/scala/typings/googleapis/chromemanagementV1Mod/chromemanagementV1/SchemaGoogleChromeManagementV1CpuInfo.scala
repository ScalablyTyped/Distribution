package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1CpuInfo extends StObject {
  
  /**
    * Output only. The CPU architecture.
    */
  var architecture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether keylocker is configured.`TRUE` = Enabled; `FALSE` = disabled. Only reported if keylockerSupported = `TRUE`.
    */
  var keylockerConfigured: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether keylocker is supported.
    */
  var keylockerSupported: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The max CPU clock speed in kHz.
    */
  var maxClockSpeed: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The CPU model name. Example: Intel(R) Core(TM) i5-8250U CPU @ 1.60GHz
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1CpuInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1CpuInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1CpuInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1CpuInfo](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureNull: Self = StObject.set(x, "architecture", null)
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setKeylockerConfigured(value: Boolean): Self = StObject.set(x, "keylockerConfigured", value.asInstanceOf[js.Any])
    
    inline def setKeylockerConfiguredNull: Self = StObject.set(x, "keylockerConfigured", null)
    
    inline def setKeylockerConfiguredUndefined: Self = StObject.set(x, "keylockerConfigured", js.undefined)
    
    inline def setKeylockerSupported(value: Boolean): Self = StObject.set(x, "keylockerSupported", value.asInstanceOf[js.Any])
    
    inline def setKeylockerSupportedNull: Self = StObject.set(x, "keylockerSupported", null)
    
    inline def setKeylockerSupportedUndefined: Self = StObject.set(x, "keylockerSupported", js.undefined)
    
    inline def setMaxClockSpeed(value: Double): Self = StObject.set(x, "maxClockSpeed", value.asInstanceOf[js.Any])
    
    inline def setMaxClockSpeedNull: Self = StObject.set(x, "maxClockSpeed", null)
    
    inline def setMaxClockSpeedUndefined: Self = StObject.set(x, "maxClockSpeed", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
