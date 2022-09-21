package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.pluginTypesMod.ExportedConfigWithProps
import typings.expoConfigPlugins.pluginTypesMod.Mod
import typings.expoConfigPlugins.pluginTypesMod.ModPlatform
import typings.expoConfigPlugins.pluginTypesMod.OptionalPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action[T] extends StObject {
  
  def action(config: ExportedConfigWithProps[T]): OptionalPromise[ExportedConfigWithProps[T]]
  @JSName("action")
  var action_Original: Mod[T]
  
  var mod: String
  
  var platform: ModPlatform
}
object Action {
  
  inline def apply[T](action: Mod[T], mod: String, platform: ModPlatform): Action[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
  
  extension [Self <: Action[?], T](x: Self & Action[T]) {
    
    inline def setAction(value: Mod[T]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: ModPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
