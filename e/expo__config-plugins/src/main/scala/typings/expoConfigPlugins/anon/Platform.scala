package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.createBaseModMod.BaseModProviderMethods
import typings.expoConfigPlugins.pluginTypesMod.ModPlatform
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platform[ModName /* <: String */] extends StObject {
  
  var platform: ModPlatform
  
  var providers: Partial[Record[ModName, BaseModProviderMethods[Any, Any]]]
}
object Platform {
  
  inline def apply[ModName /* <: String */](platform: ModPlatform, providers: Partial[Record[ModName, BaseModProviderMethods[Any, Any]]]): Platform[ModName] = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platform[ModName]]
  }
  
  extension [Self <: Platform[?], ModName /* <: String */](x: Self & Platform[ModName]) {
    
    inline def setPlatform(value: ModPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: Partial[Record[ModName, BaseModProviderMethods[Any, Any]]]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
  }
}
