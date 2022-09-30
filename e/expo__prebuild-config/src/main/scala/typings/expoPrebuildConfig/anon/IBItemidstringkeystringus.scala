package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.interfaceBuilderMod.IBRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   key :string,   userInteractionEnabled :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   contentMode :string | 'scaleToFill',   insetsLayoutMarginsFromSafeArea :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   userLabel :string}, {  rect :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBRect>,   autoresizingMask :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string,   flexibleMaxX :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   flexibleMaxY :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean}, {[key: string] : any}>>,   subviews :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<object, {  imageView :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBImageView>,   label :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBLabel>}>>,   color :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string | 'backgroundColor',   systemColor :string | 'systemBackgroundColor'}, {[key: string] : any}>>,   constraints :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<object, {  constraint :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBConstraint>}>>,   viewLayoutGuide :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   key :string | 'safeArea'}, {[key: string] : any}>>}> */
trait IBItemidstringkeystringus extends StObject {
  
  @JSName("$")
  var $: ContentMode
  
  var autoresizingMask: js.Array[IBItemkeystringflexibleMa]
  
  var color: js.Array[IBItemkeystringbackground]
  
  var constraints: js.Array[IBItemobjectconstraintArr]
  
  var rect: js.Array[IBRect]
  
  var subviews: js.Array[IBItemobjectimageViewArra]
  
  var viewLayoutGuide: js.Array[IBItemidstringkeystringsa]
}
object IBItemidstringkeystringus {
  
  inline def apply(
    $: ContentMode,
    autoresizingMask: js.Array[IBItemkeystringflexibleMa],
    color: js.Array[IBItemkeystringbackground],
    constraints: js.Array[IBItemobjectconstraintArr],
    rect: js.Array[IBRect],
    subviews: js.Array[IBItemobjectimageViewArra],
    viewLayoutGuide: js.Array[IBItemidstringkeystringsa]
  ): IBItemidstringkeystringus = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], autoresizingMask = autoresizingMask.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], subviews = subviews.asInstanceOf[js.Any], viewLayoutGuide = viewLayoutGuide.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBItemidstringkeystringus]
  }
  
  extension [Self <: IBItemidstringkeystringus](x: Self) {
    
    inline def set$(value: ContentMode): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setAutoresizingMask(value: js.Array[IBItemkeystringflexibleMa]): Self = StObject.set(x, "autoresizingMask", value.asInstanceOf[js.Any])
    
    inline def setAutoresizingMaskVarargs(value: IBItemkeystringflexibleMa*): Self = StObject.set(x, "autoresizingMask", js.Array(value*))
    
    inline def setColor(value: js.Array[IBItemkeystringbackground]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: IBItemkeystringbackground*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setConstraints(value: js.Array[IBItemobjectconstraintArr]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: IBItemobjectconstraintArr*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setRect(value: js.Array[IBRect]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectVarargs(value: IBRect*): Self = StObject.set(x, "rect", js.Array(value*))
    
    inline def setSubviews(value: js.Array[IBItemobjectimageViewArra]): Self = StObject.set(x, "subviews", value.asInstanceOf[js.Any])
    
    inline def setSubviewsVarargs(value: IBItemobjectimageViewArra*): Self = StObject.set(x, "subviews", js.Array(value*))
    
    inline def setViewLayoutGuide(value: js.Array[IBItemidstringkeystringsa]): Self = StObject.set(x, "viewLayoutGuide", value.asInstanceOf[js.Any])
    
    inline def setViewLayoutGuideVarargs(value: IBItemidstringkeystringsa*): Self = StObject.set(x, "viewLayoutGuide", js.Array(value*))
  }
}
