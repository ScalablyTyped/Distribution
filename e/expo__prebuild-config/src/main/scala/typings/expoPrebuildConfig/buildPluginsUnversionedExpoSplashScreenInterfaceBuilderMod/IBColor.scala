package typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoPrebuildConfig.anon.rednumbergreennumberbluen
import typings.expoPrebuildConfig.anon.systemColorlinkColorstrin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem</ ** Custom color * / {  red :number,   green :number,   blue :number,   alpha :number,   colorSpace :'custom' | string,   customColorSpace :'displayP3' | 'sRGB' | string} & {  key :string} | {  systemColor :'linkColor' | string} & {  key :string}, {[key: string] : any}> */
trait IBColor
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: rednumbergreennumberbluen | systemColorlinkColorstrin
}
object IBColor {
  
  inline def apply($: rednumbergreennumberbluen | systemColorlinkColorstrin): IBColor = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBColor]
  }
  
  extension [Self <: IBColor](x: Self) {
    
    inline def set$(value: rednumbergreennumberbluen | systemColorlinkColorstrin): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
