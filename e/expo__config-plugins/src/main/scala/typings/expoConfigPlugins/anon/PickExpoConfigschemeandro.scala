package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.mod.Android
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'scheme' | 'android'> */
trait PickExpoConfigschemeandro extends StObject {
  
  var android: js.UndefOr[Android] = js.undefined
  
  var scheme: js.UndefOr[String] = js.undefined
}
object PickExpoConfigschemeandro {
  
  inline def apply(): PickExpoConfigschemeandro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigschemeandro]
  }
  
  extension [Self <: PickExpoConfigschemeandro](x: Self) {
    
    inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
