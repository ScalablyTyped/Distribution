package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceMetadata extends StObject {
  
  /**
    * Device CPU make, e.g. "Qualcomm"
    */
  var cpuMake: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device CPU model, e.g. "MSM8974"
    */
  var cpuModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device class (e.g. tablet)
    */
  var deviceClass: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OpenGL version
    */
  var glEsVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Device manufacturer (e.g. Motorola)
    */
  var manufacturer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Comma separated list of native platforms (e.g. "arm", "arm7")
    */
  var nativePlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device model name (e.g. Droid)
    */
  var productName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Device RAM in Megabytes, e.g. "2048"
    */
  var ramMb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Screen density in DPI
    */
  var screenDensityDpi: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Screen height in pixels
    */
  var screenHeightPx: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Screen width in pixels
    */
  var screenWidthPx: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDeviceMetadata {
  
  inline def apply(): SchemaDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceMetadata]
  }
  
  extension [Self <: SchemaDeviceMetadata](x: Self) {
    
    inline def setCpuMake(value: String): Self = StObject.set(x, "cpuMake", value.asInstanceOf[js.Any])
    
    inline def setCpuMakeNull: Self = StObject.set(x, "cpuMake", null)
    
    inline def setCpuMakeUndefined: Self = StObject.set(x, "cpuMake", js.undefined)
    
    inline def setCpuModel(value: String): Self = StObject.set(x, "cpuModel", value.asInstanceOf[js.Any])
    
    inline def setCpuModelNull: Self = StObject.set(x, "cpuModel", null)
    
    inline def setCpuModelUndefined: Self = StObject.set(x, "cpuModel", js.undefined)
    
    inline def setDeviceClass(value: String): Self = StObject.set(x, "deviceClass", value.asInstanceOf[js.Any])
    
    inline def setDeviceClassNull: Self = StObject.set(x, "deviceClass", null)
    
    inline def setDeviceClassUndefined: Self = StObject.set(x, "deviceClass", js.undefined)
    
    inline def setGlEsVersion(value: Double): Self = StObject.set(x, "glEsVersion", value.asInstanceOf[js.Any])
    
    inline def setGlEsVersionNull: Self = StObject.set(x, "glEsVersion", null)
    
    inline def setGlEsVersionUndefined: Self = StObject.set(x, "glEsVersion", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setNativePlatform(value: String): Self = StObject.set(x, "nativePlatform", value.asInstanceOf[js.Any])
    
    inline def setNativePlatformNull: Self = StObject.set(x, "nativePlatform", null)
    
    inline def setNativePlatformUndefined: Self = StObject.set(x, "nativePlatform", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameNull: Self = StObject.set(x, "productName", null)
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setRamMb(value: Double): Self = StObject.set(x, "ramMb", value.asInstanceOf[js.Any])
    
    inline def setRamMbNull: Self = StObject.set(x, "ramMb", null)
    
    inline def setRamMbUndefined: Self = StObject.set(x, "ramMb", js.undefined)
    
    inline def setScreenDensityDpi(value: Double): Self = StObject.set(x, "screenDensityDpi", value.asInstanceOf[js.Any])
    
    inline def setScreenDensityDpiNull: Self = StObject.set(x, "screenDensityDpi", null)
    
    inline def setScreenDensityDpiUndefined: Self = StObject.set(x, "screenDensityDpi", js.undefined)
    
    inline def setScreenHeightPx(value: Double): Self = StObject.set(x, "screenHeightPx", value.asInstanceOf[js.Any])
    
    inline def setScreenHeightPxNull: Self = StObject.set(x, "screenHeightPx", null)
    
    inline def setScreenHeightPxUndefined: Self = StObject.set(x, "screenHeightPx", js.undefined)
    
    inline def setScreenWidthPx(value: Double): Self = StObject.set(x, "screenWidthPx", value.asInstanceOf[js.Any])
    
    inline def setScreenWidthPxNull: Self = StObject.set(x, "screenWidthPx", null)
    
    inline def setScreenWidthPxUndefined: Self = StObject.set(x, "screenWidthPx", js.undefined)
  }
}
