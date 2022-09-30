package typings.expoPrebuildConfig.interfaceBuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoPrebuildConfig.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  name :string,   width :number,   height :number}, {[key: string] : any}> */
trait IBResourceImage
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: Height
}
object IBResourceImage {
  
  inline def apply($: Height): IBResourceImage = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBResourceImage]
  }
  
  extension [Self <: IBResourceImage](x: Self) {
    
    inline def set$(value: Height): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
