package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildPluginDottypesMod.ExportedConfigWithProps
import typings.expoConfigPlugins.buildPluginDottypesMod.ModPlatform
import typings.expoConfigPlugins.buildPluginDottypesMod.OptionalPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mod[T] extends StObject {
  
  def action(config: ExportedConfigWithProps[T]): OptionalPromise[ExportedConfigWithProps[T]]
  @JSName("action")
  var action_Original: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[T]
  
  var mod: String
  
  var platform: ModPlatform
}
object Mod {
  
  inline def apply[T](
    action: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[T],
    mod: String,
    platform: ModPlatform
  ): Mod[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mod[T]]
  }
  
  extension [Self <: Mod[?], T](x: Self & Mod[T]) {
    
    inline def setAction(value: typings.expoConfigPlugins.buildPluginDottypesMod.Mod[T]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: ModPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
