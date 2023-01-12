package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.anon.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-plugins.@expo/config-plugins/build/utils/Updates.ExpoConfigUpdates, 'sdkVersion' | 'runtimeVersion'> */
trait PickExpoConfigUpdatessdkV extends StObject {
  
  var runtimeVersion: js.UndefOr[String | Policy] = js.undefined
  
  var sdkVersion: js.UndefOr[String] = js.undefined
}
object PickExpoConfigUpdatessdkV {
  
  inline def apply(): PickExpoConfigUpdatessdkV = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigUpdatessdkV]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickExpoConfigUpdatessdkV] (val x: Self) extends AnyVal {
    
    inline def setRuntimeVersion(value: String | Policy): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}
