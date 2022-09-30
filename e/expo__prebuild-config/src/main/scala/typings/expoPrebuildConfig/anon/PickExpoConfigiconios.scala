package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.mod.IOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'icon' | 'ios'> */
trait PickExpoConfigiconios extends StObject {
  
  var icon: js.UndefOr[String] = js.undefined
  
  var ios: js.UndefOr[IOS] = js.undefined
}
object PickExpoConfigiconios {
  
  inline def apply(): PickExpoConfigiconios = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigiconios]
  }
  
  extension [Self <: PickExpoConfigiconios](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIos(value: IOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
