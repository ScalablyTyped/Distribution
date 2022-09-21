package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'version'> */
trait PickExpoConfigversion extends StObject {
  
  var version: js.UndefOr[String] = js.undefined
}
object PickExpoConfigversion {
  
  inline def apply(): PickExpoConfigversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigversion]
  }
  
  extension [Self <: PickExpoConfigversion](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
