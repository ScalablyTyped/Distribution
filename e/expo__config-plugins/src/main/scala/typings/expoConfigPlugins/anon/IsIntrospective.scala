package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsIntrospective extends StObject {
  
  /**
    * If the mod supports introspection, and avoids making any filesystem modifications during compilation.
    * By enabling, this mod, and all of its descendants will be run in introspection mode.
    * This should only be used for static files like JSON or XML, and not for application files that require regexes,
    * or complex static files that require other files to be generated like Xcode `.pbxproj`.
    */
  var isIntrospective: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that the mod provides data upstream to other mods.
    * This mod should always be the last one added.
    */
  var isProvider: js.UndefOr[Boolean] = js.undefined
}
object IsIntrospective {
  
  inline def apply(): IsIntrospective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIntrospective]
  }
  
  extension [Self <: IsIntrospective](x: Self) {
    
    inline def setIsIntrospective(value: Boolean): Self = StObject.set(x, "isIntrospective", value.asInstanceOf[js.Any])
    
    inline def setIsIntrospectiveUndefined: Self = StObject.set(x, "isIntrospective", js.undefined)
    
    inline def setIsProvider(value: Boolean): Self = StObject.set(x, "isProvider", value.asInstanceOf[js.Any])
    
    inline def setIsProviderUndefined: Self = StObject.set(x, "isProvider", js.undefined)
  }
}
