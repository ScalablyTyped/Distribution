package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.mod.Android
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'android' | 'backgroundColor'> */
trait PickExpoConfigandroidback extends StObject {
  
  var android: js.UndefOr[Android] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
}
object PickExpoConfigandroidback {
  
  inline def apply(): PickExpoConfigandroidback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigandroidback]
  }
  
  extension [Self <: PickExpoConfigandroidback](x: Self) {
    
    inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
  }
}
