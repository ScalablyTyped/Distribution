package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.mod.IOS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'ios' | 'sdkVersion'> */
trait PickExpoConfigiossdkVersi extends StObject {
  
  var ios: js.UndefOr[IOS] = js.undefined
  
  var sdkVersion: js.UndefOr[String] = js.undefined
}
object PickExpoConfigiossdkVersi {
  
  inline def apply(): PickExpoConfigiossdkVersi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigiossdkVersi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigiossdkVersi] (val x: Self) extends AnyVal {
    
    inline def setIos(value: IOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}
