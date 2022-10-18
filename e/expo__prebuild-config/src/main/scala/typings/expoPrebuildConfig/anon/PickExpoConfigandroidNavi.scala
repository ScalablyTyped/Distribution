package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.anon.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'androidNavigationBar'> */
trait PickExpoConfigandroidNavi extends StObject {
  
  var androidNavigationBar: js.UndefOr[Visible] = js.undefined
}
object PickExpoConfigandroidNavi {
  
  inline def apply(): PickExpoConfigandroidNavi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigandroidNavi]
  }
  
  extension [Self <: PickExpoConfigandroidNavi](x: Self) {
    
    inline def setAndroidNavigationBar(value: Visible): Self = StObject.set(x, "androidNavigationBar", value.asInstanceOf[js.Any])
    
    inline def setAndroidNavigationBarUndefined: Self = StObject.set(x, "androidNavigationBar", js.undefined)
  }
}
