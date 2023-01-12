package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'version'> & {  android :std.Pick<@expo/config-types.@expo/config-types.Android, 'versionCode'> | undefined,   ios :std.Pick<@expo/config-types.@expo/config-types.IOS, 'buildNumber'> | undefined} */
trait PickExpoConfigversionandr extends StObject {
  
  var android: js.UndefOr[PickAndroidversionCode] = js.undefined
  
  var ios: js.UndefOr[PickIOSbuildNumber] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object PickExpoConfigversionandr {
  
  inline def apply(): PickExpoConfigversionandr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigversionandr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigversionandr] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: PickAndroidversionCode): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setIos(value: PickIOSbuildNumber): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
