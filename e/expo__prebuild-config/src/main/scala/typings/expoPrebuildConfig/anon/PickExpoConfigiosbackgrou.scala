package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.mod.IOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'ios' | 'backgroundColor'> */
trait PickExpoConfigiosbackgrou extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var ios: js.UndefOr[IOS] = js.undefined
}
object PickExpoConfigiosbackgrou {
  
  inline def apply(): PickExpoConfigiosbackgrou = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigiosbackgrou]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigiosbackgrou] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setIos(value: IOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
