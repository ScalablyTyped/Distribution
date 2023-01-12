package typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.Rect, {[key: string] : any}> */
trait IBRect
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$")
  var $: Rect
}
object IBRect {
  
  inline def apply($: Rect): IBRect = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBRect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBRect] (val x: Self) extends AnyVal {
    
    inline def set$(value: Rect): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
