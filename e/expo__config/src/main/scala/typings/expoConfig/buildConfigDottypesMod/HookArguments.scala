package typings.expoConfig.buildConfigDottypesMod

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookArguments extends StObject {
  
  var androidBundle: String | js.typedarray.Uint8Array
  
  var androidManifest: Any
  
  var androidManifestUrl: String
  
  var androidSourceMap: String | Null
  
  var config: Any
  
  var exp: ExpoConfig
  
  var iosBundle: String | js.typedarray.Uint8Array
  
  var iosManifest: Any
  
  var iosManifestUrl: String
  
  var iosSourceMap: String | Null
  
  def log(msg: Any): Unit
  
  var projectRoot: String
  
  var url: Any
}
object HookArguments {
  
  inline def apply(
    androidBundle: String | js.typedarray.Uint8Array,
    androidManifest: Any,
    androidManifestUrl: String,
    config: Any,
    exp: ExpoConfig,
    iosBundle: String | js.typedarray.Uint8Array,
    iosManifest: Any,
    iosManifestUrl: String,
    log: Any => Unit,
    projectRoot: String,
    url: Any
  ): HookArguments = {
    val __obj = js.Dynamic.literal(androidBundle = androidBundle.asInstanceOf[js.Any], androidManifest = androidManifest.asInstanceOf[js.Any], androidManifestUrl = androidManifestUrl.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iosBundle = iosBundle.asInstanceOf[js.Any], iosManifest = iosManifest.asInstanceOf[js.Any], iosManifestUrl = iosManifestUrl.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), projectRoot = projectRoot.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], androidSourceMap = null, iosSourceMap = null)
    __obj.asInstanceOf[HookArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HookArguments] (val x: Self) extends AnyVal {
    
    inline def setAndroidBundle(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "androidBundle", value.asInstanceOf[js.Any])
    
    inline def setAndroidManifest(value: Any): Self = StObject.set(x, "androidManifest", value.asInstanceOf[js.Any])
    
    inline def setAndroidManifestUrl(value: String): Self = StObject.set(x, "androidManifestUrl", value.asInstanceOf[js.Any])
    
    inline def setAndroidSourceMap(value: String): Self = StObject.set(x, "androidSourceMap", value.asInstanceOf[js.Any])
    
    inline def setAndroidSourceMapNull: Self = StObject.set(x, "androidSourceMap", null)
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setExp(value: ExpoConfig): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setIosBundle(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "iosBundle", value.asInstanceOf[js.Any])
    
    inline def setIosManifest(value: Any): Self = StObject.set(x, "iosManifest", value.asInstanceOf[js.Any])
    
    inline def setIosManifestUrl(value: String): Self = StObject.set(x, "iosManifestUrl", value.asInstanceOf[js.Any])
    
    inline def setIosSourceMap(value: String): Self = StObject.set(x, "iosSourceMap", value.asInstanceOf[js.Any])
    
    inline def setIosSourceMapNull: Self = StObject.set(x, "iosSourceMap", null)
    
    inline def setLog(value: Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
