package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.mod.Android
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'android'> */
trait PickExpoConfigandroid extends StObject {
  
  var android: js.UndefOr[Android] = js.undefined
}
object PickExpoConfigandroid {
  
  inline def apply(): PickExpoConfigandroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigandroid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigandroid] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
  }
}
