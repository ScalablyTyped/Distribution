package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidResourcesMod.ResourceKind
import typings.expoConfigPlugins.expoConfigPluginsStrings.colors
import typings.expoConfigPlugins.expoConfigPluginsStrings.strings
import typings.expoConfigPlugins.expoConfigPluginsStrings.styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KindName extends StObject {
  
  var kind: js.UndefOr[ResourceKind] = js.undefined
  
  var name: colors | strings | styles | String
}
object KindName {
  
  inline def apply(name: colors | strings | styles | String): KindName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KindName]
  }
  
  extension [Self <: KindName](x: Self) {
    
    inline def setKind(value: ResourceKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: colors | strings | styles | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
