package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1AudioStatusReport extends StObject {
  
  /**
    * Output only. Active input device's name.
    */
  var inputDevice: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Active input device's gain in [0, 100].
    */
  var inputGain: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Is active input device mute or not.
    */
  var inputMute: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Active output device's name.
    */
  var outputDevice: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Is active output device mute or not.
    */
  var outputMute: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Active output device's volume in [0, 100].
    */
  var outputVolume: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Timestamp of when the sample was collected on device.
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1AudioStatusReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1AudioStatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1AudioStatusReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1AudioStatusReport](x: Self) {
    
    inline def setInputDevice(value: String): Self = StObject.set(x, "inputDevice", value.asInstanceOf[js.Any])
    
    inline def setInputDeviceNull: Self = StObject.set(x, "inputDevice", null)
    
    inline def setInputDeviceUndefined: Self = StObject.set(x, "inputDevice", js.undefined)
    
    inline def setInputGain(value: Double): Self = StObject.set(x, "inputGain", value.asInstanceOf[js.Any])
    
    inline def setInputGainNull: Self = StObject.set(x, "inputGain", null)
    
    inline def setInputGainUndefined: Self = StObject.set(x, "inputGain", js.undefined)
    
    inline def setInputMute(value: Boolean): Self = StObject.set(x, "inputMute", value.asInstanceOf[js.Any])
    
    inline def setInputMuteNull: Self = StObject.set(x, "inputMute", null)
    
    inline def setInputMuteUndefined: Self = StObject.set(x, "inputMute", js.undefined)
    
    inline def setOutputDevice(value: String): Self = StObject.set(x, "outputDevice", value.asInstanceOf[js.Any])
    
    inline def setOutputDeviceNull: Self = StObject.set(x, "outputDevice", null)
    
    inline def setOutputDeviceUndefined: Self = StObject.set(x, "outputDevice", js.undefined)
    
    inline def setOutputMute(value: Boolean): Self = StObject.set(x, "outputMute", value.asInstanceOf[js.Any])
    
    inline def setOutputMuteNull: Self = StObject.set(x, "outputMute", null)
    
    inline def setOutputMuteUndefined: Self = StObject.set(x, "outputMute", js.undefined)
    
    inline def setOutputVolume(value: Double): Self = StObject.set(x, "outputVolume", value.asInstanceOf[js.Any])
    
    inline def setOutputVolumeNull: Self = StObject.set(x, "outputVolume", null)
    
    inline def setOutputVolumeUndefined: Self = StObject.set(x, "outputVolume", js.undefined)
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
  }
}
