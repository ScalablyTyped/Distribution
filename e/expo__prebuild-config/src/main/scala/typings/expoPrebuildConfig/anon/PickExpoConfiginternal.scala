package typings.expoPrebuildConfig.anon

import typings.expoConfigTypes.anon.PluginHistory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, '_internal'> */
trait PickExpoConfiginternal extends StObject {
  
  var _internal: js.UndefOr[PluginHistory] = js.undefined
}
object PickExpoConfiginternal {
  
  inline def apply(): PickExpoConfiginternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfiginternal]
  }
  
  extension [Self <: PickExpoConfiginternal](x: Self) {
    
    inline def set_internal(value: PluginHistory): Self = StObject.set(x, "_internal", value.asInstanceOf[js.Any])
    
    inline def set_internalUndefined: Self = StObject.set(x, "_internal", js.undefined)
  }
}
