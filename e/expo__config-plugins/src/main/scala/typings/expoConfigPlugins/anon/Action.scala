package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildPluginDottypesMod.ExportedConfigWithProps
import typings.expoConfigPlugins.buildPluginDottypesMod.Mod
import typings.expoConfigPlugins.buildPluginDottypesMod.ModPlatform
import typings.expoConfigPlugins.buildPluginDottypesMod.OptionalPromise
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action[?], T] (val x: Self & Action[T]) extends AnyVal {
    
    inline def setAction(value: Mod[T]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: ModPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
