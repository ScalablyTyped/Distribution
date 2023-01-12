package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-plugins.@expo/config-plugins/build/utils/Updates.ExpoConfigUpdates, 'sdkVersion'> */
trait PickExpoConfigUpdatessdkVSdkVersion extends StObject {
  
  var sdkVersion: js.UndefOr[String] = js.undefined
}
object PickExpoConfigUpdatessdkVSdkVersion {
  
  inline def apply(): PickExpoConfigUpdatessdkVSdkVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigUpdatessdkVSdkVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigUpdatessdkVSdkVersion] (val x: Self) extends AnyVal {
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}
