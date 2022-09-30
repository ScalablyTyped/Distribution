package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string}, {[key: string] : any}> */
trait IBItemkeystringkeystringa
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: Key
}
object IBItemkeystringkeystringa {
  
  inline def apply($: Key): IBItemkeystringkeystringa = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBItemkeystringkeystringa]
  }
  
  extension [Self <: IBItemkeystringkeystringa](x: Self) {
    
    inline def set$(value: Key): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
