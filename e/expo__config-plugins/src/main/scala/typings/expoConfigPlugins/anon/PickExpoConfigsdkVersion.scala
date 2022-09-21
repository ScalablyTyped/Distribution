package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'sdkVersion'> */
trait PickExpoConfigsdkVersion extends StObject {
  
  var sdkVersion: js.UndefOr[String] = js.undefined
}
object PickExpoConfigsdkVersion {
  
  inline def apply(): PickExpoConfigsdkVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigsdkVersion]
  }
  
  extension [Self <: PickExpoConfigsdkVersion](x: Self) {
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}
