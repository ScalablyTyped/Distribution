package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'locales'> */
trait PickExpoConfiglocales extends StObject {
  
  var locales: js.UndefOr[StringDictionary[String | StringDictionary[Any]]] = js.undefined
}
object PickExpoConfiglocales {
  
  inline def apply(): PickExpoConfiglocales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfiglocales]
  }
  
  extension [Self <: PickExpoConfiglocales](x: Self) {
    
    inline def setLocales(value: StringDictionary[String | StringDictionary[Any]]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
  }
}
