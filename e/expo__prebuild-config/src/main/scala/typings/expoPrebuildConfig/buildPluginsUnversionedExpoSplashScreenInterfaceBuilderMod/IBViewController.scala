package typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod

import typings.expoPrebuildConfig.anon.IBItemidstringkeystringus
import typings.expoPrebuildConfig.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   placeholderIdentifier :string | undefined,   userLabel :string,   sceneMemberID :string}, {  view :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   key :string,   userInteractionEnabled :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   contentMode :string | 'scaleToFill',   insetsLayoutMarginsFromSafeArea :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   userLabel :string}, {  rect :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBRect>,   autoresizingMask :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string,   flexibleMaxX :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   flexibleMaxY :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean}, {[key: string] : any}>>,   subviews :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<object, {  imageView :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBImageView>,   label :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBLabel>}>>,   color :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  key :string | 'backgroundColor',   systemColor :string | 'systemBackgroundColor'}, {[key: string] : any}>>,   constraints :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<object, {  constraint :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBConstraint>}>>,   viewLayoutGuide :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   key :string | 'safeArea'}, {[key: string] : any}>>}>>}> */
trait IBViewController extends StObject {
  
  @JSName("$")
  var $: Id
  
  var view: js.Array[IBItemidstringkeystringus]
}
object IBViewController {
  
  inline def apply($: Id, view: js.Array[IBItemidstringkeystringus]): IBViewController = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBViewController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBViewController] (val x: Self) extends AnyVal {
    
    inline def set$(value: Id): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setView(value: js.Array[IBItemidstringkeystringus]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewVarargs(value: IBItemidstringkeystringus*): Self = StObject.set(x, "view", js.Array(value*))
  }
}
