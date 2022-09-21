package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.mod.IOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'ios'> */
trait PickExpoConfigios extends StObject {
  
  var ios: js.UndefOr[IOS] = js.undefined
}
object PickExpoConfigios {
  
  inline def apply(): PickExpoConfigios = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigios]
  }
  
  extension [Self <: PickExpoConfigios](x: Self) {
    
    inline def setIos(value: IOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
