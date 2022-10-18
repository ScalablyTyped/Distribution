package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBImageView
import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<object, {  imageView :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBImageView>,   label :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBLabel>}> */
trait IBItemobjectimageViewArra extends StObject {
  
  @JSName("$")
  var $: js.Object
  
  var imageView: js.Array[IBImageView]
  
  var label: js.Array[IBLabel]
}
object IBItemobjectimageViewArra {
  
  inline def apply($: js.Object, imageView: js.Array[IBImageView], label: js.Array[IBLabel]): IBItemobjectimageViewArra = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], imageView = imageView.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBItemobjectimageViewArra]
  }
  
  extension [Self <: IBItemobjectimageViewArra](x: Self) {
    
    inline def set$(value: js.Object): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setImageView(value: js.Array[IBImageView]): Self = StObject.set(x, "imageView", value.asInstanceOf[js.Any])
    
    inline def setImageViewVarargs(value: IBImageView*): Self = StObject.set(x, "imageView", js.Array(value*))
    
    inline def setLabel(value: js.Array[IBLabel]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelVarargs(value: IBLabel*): Self = StObject.set(x, "label", js.Array(value*))
  }
}
