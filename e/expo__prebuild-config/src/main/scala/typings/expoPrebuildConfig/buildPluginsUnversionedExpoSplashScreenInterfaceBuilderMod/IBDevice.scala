package typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoPrebuildConfig.anon.Appearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   orientation :string | 'portrait',   appearance :string | 'light'}, {[key: string] : any}> */
trait IBDevice
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: Appearance
}
object IBDevice {
  
  inline def apply($: Appearance): IBDevice = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBDevice]
  }
  
  extension [Self <: IBDevice](x: Self) {
    
    inline def set$(value: Appearance): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
