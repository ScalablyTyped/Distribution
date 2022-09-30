package typings.expoPrebuildConfig.interfaceBuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoPrebuildConfig.anon.FlexibleMaxX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string,   flexibleMaxX :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   flexibleMaxY :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean}, {[key: string] : any}> */
trait IBAutoresizingMask
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: FlexibleMaxX
}
object IBAutoresizingMask {
  
  inline def apply($: FlexibleMaxX): IBAutoresizingMask = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBAutoresizingMask]
  }
  
  extension [Self <: IBAutoresizingMask](x: Self) {
    
    inline def set$(value: FlexibleMaxX): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
