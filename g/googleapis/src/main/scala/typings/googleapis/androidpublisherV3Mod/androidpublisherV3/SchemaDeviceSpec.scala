package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceSpec extends StObject {
  
  /**
    * Screen dpi.
    */
  var screenDensity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Supported ABI architectures in the order of preference. The values should be the string as reported by the platform, e.g. "armeabi-v7a", "x86_64".
    */
  var supportedAbis: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * All installed locales represented as BCP-47 strings, e.g. "en-US".
    */
  var supportedLocales: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaDeviceSpec {
  
  inline def apply(): SchemaDeviceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceSpec]
  }
  
  extension [Self <: SchemaDeviceSpec](x: Self) {
    
    inline def setScreenDensity(value: Double): Self = StObject.set(x, "screenDensity", value.asInstanceOf[js.Any])
    
    inline def setScreenDensityNull: Self = StObject.set(x, "screenDensity", null)
    
    inline def setScreenDensityUndefined: Self = StObject.set(x, "screenDensity", js.undefined)
    
    inline def setSupportedAbis(value: js.Array[String]): Self = StObject.set(x, "supportedAbis", value.asInstanceOf[js.Any])
    
    inline def setSupportedAbisNull: Self = StObject.set(x, "supportedAbis", null)
    
    inline def setSupportedAbisUndefined: Self = StObject.set(x, "supportedAbis", js.undefined)
    
    inline def setSupportedAbisVarargs(value: String*): Self = StObject.set(x, "supportedAbis", js.Array(value*))
    
    inline def setSupportedLocales(value: js.Array[String]): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
    
    inline def setSupportedLocalesNull: Self = StObject.set(x, "supportedLocales", null)
    
    inline def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
    
    inline def setSupportedLocalesVarargs(value: String*): Self = StObject.set(x, "supportedLocales", js.Array(value*))
  }
}
