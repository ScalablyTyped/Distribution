package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.anon.BarStyle
import typings.expoConfigTypes.mod.Android
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.automatic
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.dark
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'android' | 'androidStatusBar' | 'userInterfaceStyle'> */
trait PickExpoConfigandroidandr extends StObject {
  
  var android: js.UndefOr[Android] = js.undefined
  
  var androidStatusBar: js.UndefOr[BarStyle] = js.undefined
  
  var userInterfaceStyle: js.UndefOr[light | dark | automatic] = js.undefined
}
object PickExpoConfigandroidandr {
  
  inline def apply(): PickExpoConfigandroidandr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigandroidandr]
  }
  
  extension [Self <: PickExpoConfigandroidandr](x: Self) {
    
    inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidStatusBar(value: BarStyle): Self = StObject.set(x, "androidStatusBar", value.asInstanceOf[js.Any])
    
    inline def setAndroidStatusBarUndefined: Self = StObject.set(x, "androidStatusBar", js.undefined)
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setUserInterfaceStyle(value: light | dark | automatic): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
  }
}
