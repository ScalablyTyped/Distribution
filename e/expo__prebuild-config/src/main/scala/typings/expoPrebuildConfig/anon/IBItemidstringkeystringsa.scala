package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   key :string | 'safeArea'}, {[key: string] : any}> */
trait IBItemidstringkeystringsa
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: IdKey
}
object IBItemidstringkeystringsa {
  
  inline def apply($: IdKey): IBItemidstringkeystringsa = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBItemidstringkeystringsa]
  }
  
  extension [Self <: IBItemidstringkeystringsa](x: Self) {
    
    inline def set$(value: IdKey): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
