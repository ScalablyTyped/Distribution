package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string,   flexibleMaxX :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   flexibleMaxY :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean}, {[key: string] : any}> */
trait IBItemkeystringflexibleMa
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: FlexibleMaxX
}
object IBItemkeystringflexibleMa {
  
  inline def apply($: FlexibleMaxX): IBItemkeystringflexibleMa = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBItemkeystringflexibleMa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBItemkeystringflexibleMa] (val x: Self) extends AnyVal {
    
    inline def set$(value: FlexibleMaxX): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
