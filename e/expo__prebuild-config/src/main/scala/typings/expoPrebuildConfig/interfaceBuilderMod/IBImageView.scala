package typings.expoPrebuildConfig.interfaceBuilderMod

import typings.expoPrebuildConfig.anon.ClipsSubviews
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   userLabel :string,   image :string,   clipsSubviews :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean | undefined,   userInteractionEnabled :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   contentMode :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBContentMode,   horizontalHuggingPriority :number,   verticalHuggingPriority :number,   insetsLayoutMarginsFromSafeArea :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean | undefined,   translatesAutoresizingMaskIntoConstraints :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean | undefined}, {  rect :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBRect>}> */
trait IBImageView extends StObject {
  
  @JSName("$")
  var $: ClipsSubviews
  
  var rect: js.Array[IBRect]
}
object IBImageView {
  
  inline def apply($: ClipsSubviews, rect: js.Array[IBRect]): IBImageView = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBImageView]
  }
  
  extension [Self <: IBImageView](x: Self) {
    
    inline def set$(value: ClipsSubviews): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setRect(value: js.Array[IBRect]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectVarargs(value: IBRect*): Self = StObject.set(x, "rect", js.Array(value*))
  }
}
