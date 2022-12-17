package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildPluginDottypesMod.ExportedConfigWithProps
import typings.expoConfigPlugins.buildPluginDottypesMod.Mod
import typings.expoConfigPlugins.buildPluginDottypesMod.OptionalPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionMod[T] extends StObject {
  
  def action(config: ExportedConfigWithProps[T]): OptionalPromise[ExportedConfigWithProps[T]]
  @JSName("action")
  var action_Original: Mod[T]
}
object ActionMod {
  
  inline def apply[T](action: Mod[T]): ActionMod[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMod[T]]
  }
  
  extension [Self <: ActionMod[?], T](x: Self & ActionMod[T]) {
    
    inline def setAction(value: Mod[T]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
