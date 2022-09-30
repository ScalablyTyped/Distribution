package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string | 'backgroundColor',   systemColor :string | 'systemBackgroundColor'}, {[key: string] : any}> */
trait IBItemkeystringbackground
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: SystemColor
}
object IBItemkeystringbackground {
  
  inline def apply($: SystemColor): IBItemkeystringbackground = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBItemkeystringbackground]
  }
  
  extension [Self <: IBItemkeystringbackground](x: Self) {
    
    inline def set$(value: SystemColor): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
