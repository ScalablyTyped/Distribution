package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.mod.IOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'scheme' | 'ios'>> */
trait PartialPickExpoConfigsche extends StObject {
  
  var ios: js.UndefOr[IOS] = js.undefined
  
  var scheme: js.UndefOr[String] = js.undefined
}
object PartialPickExpoConfigsche {
  
  inline def apply(): PartialPickExpoConfigsche = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickExpoConfigsche]
  }
  
  extension [Self <: PartialPickExpoConfigsche](x: Self) {
    
    inline def setIos(value: IOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
