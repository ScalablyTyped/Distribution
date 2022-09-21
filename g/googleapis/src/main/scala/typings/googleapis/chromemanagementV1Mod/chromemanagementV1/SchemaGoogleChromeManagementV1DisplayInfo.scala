package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1DisplayInfo extends StObject {
  
  /**
    * Output only. Represents the graphics card device id.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates if display is internal or not.
    */
  var isInternal: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Refresh rate in Hz.
    */
  var refreshRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Resolution height in pixels.
    */
  var resolutionHeight: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Resolution width in pixels.
    */
  var resolutionWidth: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1DisplayInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1DisplayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1DisplayInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1DisplayInfo](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
    
    inline def setIsInternalNull: Self = StObject.set(x, "isInternal", null)
    
    inline def setIsInternalUndefined: Self = StObject.set(x, "isInternal", js.undefined)
    
    inline def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
    
    inline def setRefreshRateNull: Self = StObject.set(x, "refreshRate", null)
    
    inline def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
    
    inline def setResolutionHeight(value: Double): Self = StObject.set(x, "resolutionHeight", value.asInstanceOf[js.Any])
    
    inline def setResolutionHeightNull: Self = StObject.set(x, "resolutionHeight", null)
    
    inline def setResolutionHeightUndefined: Self = StObject.set(x, "resolutionHeight", js.undefined)
    
    inline def setResolutionWidth(value: Double): Self = StObject.set(x, "resolutionWidth", value.asInstanceOf[js.Any])
    
    inline def setResolutionWidthNull: Self = StObject.set(x, "resolutionWidth", null)
    
    inline def setResolutionWidthUndefined: Self = StObject.set(x, "resolutionWidth", js.undefined)
  }
}
