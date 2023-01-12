package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.anon.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'version' | 'runtimeVersion' | 'sdkVersion'> & {  android :std.Pick<@expo/config-types.@expo/config-types.Android, 'versionCode' | 'runtimeVersion'> | undefined,   ios :std.Pick<@expo/config-types.@expo/config-types.IOS, 'buildNumber' | 'runtimeVersion'> | undefined} */
trait PickExpoConfigversionrunt extends StObject {
  
  var android: js.UndefOr[PickAndroidversionCoderun] = js.undefined
  
  var ios: js.UndefOr[PickIOSbuildNumberruntime] = js.undefined
  
  var runtimeVersion: js.UndefOr[String | Policy] = js.undefined
  
  var sdkVersion: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object PickExpoConfigversionrunt {
  
  inline def apply(): PickExpoConfigversionrunt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigversionrunt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigversionrunt] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: PickAndroidversionCoderun): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setIos(value: PickIOSbuildNumberruntime): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setRuntimeVersion(value: String | Policy): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
