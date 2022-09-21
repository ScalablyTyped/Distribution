package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'primaryColor'> */
trait PickExpoConfigprimaryColo extends StObject {
  
  var primaryColor: js.UndefOr[String] = js.undefined
}
object PickExpoConfigprimaryColo {
  
  inline def apply(): PickExpoConfigprimaryColo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigprimaryColo]
  }
  
  extension [Self <: PickExpoConfigprimaryColo](x: Self) {
    
    inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
  }
}
