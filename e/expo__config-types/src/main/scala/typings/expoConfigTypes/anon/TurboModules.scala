package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TurboModules extends StObject {
  
  /**
    * Enables Turbo Modules, which are a type of native modules that use a different way of communicating between JS and platform code. When installing a Turbo Module you will need to enable this experimental option (the library still needs to be a part of Expo SDK already, like react-native-reanimated v2). Turbo Modules do not support remote debugging and enabling this option will disable remote debugging.
    */
  var turboModules: js.UndefOr[Boolean] = js.undefined
}
object TurboModules {
  
  inline def apply(): TurboModules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurboModules]
  }
  
  extension [Self <: TurboModules](x: Self) {
    
    inline def setTurboModules(value: Boolean): Self = StObject.set(x, "turboModules", value.asInstanceOf[js.Any])
    
    inline def setTurboModulesUndefined: Self = StObject.set(x, "turboModules", js.undefined)
  }
}
