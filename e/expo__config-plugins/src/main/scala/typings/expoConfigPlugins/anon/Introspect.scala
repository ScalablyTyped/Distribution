package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.pluginTypesMod.ModPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Introspect extends StObject {
  
  var assertMissingModProviders: js.UndefOr[Boolean] = js.undefined
  
  var introspect: js.UndefOr[Boolean] = js.undefined
  
  var platforms: js.UndefOr[js.Array[ModPlatform]] = js.undefined
  
  var projectRoot: String
}
object Introspect {
  
  inline def apply(projectRoot: String): Introspect = {
    val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Introspect]
  }
  
  extension [Self <: Introspect](x: Self) {
    
    inline def setAssertMissingModProviders(value: Boolean): Self = StObject.set(x, "assertMissingModProviders", value.asInstanceOf[js.Any])
    
    inline def setAssertMissingModProvidersUndefined: Self = StObject.set(x, "assertMissingModProviders", js.undefined)
    
    inline def setIntrospect(value: Boolean): Self = StObject.set(x, "introspect", value.asInstanceOf[js.Any])
    
    inline def setIntrospectUndefined: Self = StObject.set(x, "introspect", js.undefined)
    
    inline def setPlatforms(value: js.Array[ModPlatform]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: ModPlatform*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
  }
}
