package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.expoConfigPluginsStrings.automatic_
import typings.expoConfigPlugins.expoConfigPluginsStrings.dark_
import typings.expoConfigPlugins.expoConfigPluginsStrings.light_
import typings.expoConfigTypes.mod.Android
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'android' | 'userInterfaceStyle'> */
trait PickExpoConfigandroiduser extends StObject {
  
  var android: js.UndefOr[Android] = js.undefined
  
  var userInterfaceStyle: js.UndefOr[light_ | dark_ | automatic_] = js.undefined
}
object PickExpoConfigandroiduser {
  
  inline def apply(): PickExpoConfigandroiduser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigandroiduser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigandroiduser] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setUserInterfaceStyle(value: light_ | dark_ | automatic_): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
  }
}
