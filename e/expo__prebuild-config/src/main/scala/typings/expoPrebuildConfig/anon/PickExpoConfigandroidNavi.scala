package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.anon.BarStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'androidNavigationBar'> */
trait PickExpoConfigandroidNavi extends StObject {
  
  var androidNavigationBar: js.UndefOr[BarStyle] = js.undefined
}
object PickExpoConfigandroidNavi {
  
  inline def apply(): PickExpoConfigandroidNavi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigandroidNavi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigandroidNavi] (val x: Self) extends AnyVal {
    
    inline def setAndroidNavigationBar(value: BarStyle): Self = StObject.set(x, "androidNavigationBar", value.asInstanceOf[js.Any])
    
    inline def setAndroidNavigationBarUndefined: Self = StObject.set(x, "androidNavigationBar", js.undefined)
  }
}
