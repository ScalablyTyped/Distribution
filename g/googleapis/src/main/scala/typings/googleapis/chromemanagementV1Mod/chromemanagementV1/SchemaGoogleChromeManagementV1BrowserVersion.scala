package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1BrowserVersion extends StObject {
  
  /**
    * Output only. The release channel of the installed browser.
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Count grouped by device_system and major version
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Version of the system-specified operating system.
    */
  var deviceOsVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The device operating system.
    */
  var system: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The full version of the installed browser.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1BrowserVersion {
  
  inline def apply(): SchemaGoogleChromeManagementV1BrowserVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1BrowserVersion]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1BrowserVersion](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDeviceOsVersion(value: String): Self = StObject.set(x, "deviceOsVersion", value.asInstanceOf[js.Any])
    
    inline def setDeviceOsVersionNull: Self = StObject.set(x, "deviceOsVersion", null)
    
    inline def setDeviceOsVersionUndefined: Self = StObject.set(x, "deviceOsVersion", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemNull: Self = StObject.set(x, "system", null)
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
