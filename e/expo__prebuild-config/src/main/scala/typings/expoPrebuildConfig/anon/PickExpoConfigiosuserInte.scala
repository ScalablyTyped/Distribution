package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.mod.IOS
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.automatic
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.dark
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'ios' | 'userInterfaceStyle'> */
trait PickExpoConfigiosuserInte extends StObject {
  
  var ios: js.UndefOr[IOS] = js.undefined
  
  var userInterfaceStyle: js.UndefOr[light | dark | automatic] = js.undefined
}
object PickExpoConfigiosuserInte {
  
  inline def apply(): PickExpoConfigiosuserInte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigiosuserInte]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigiosuserInte] (val x: Self) extends AnyVal {
    
    inline def setIos(value: IOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setUserInterfaceStyle(value: light | dark | automatic): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
    
    inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
  }
}
