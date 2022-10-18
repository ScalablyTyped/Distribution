package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  type :'com.apple.InterfaceBuilder3.CocoaTouch.Storyboard.XIB' | string,   version :'3.0' | string,   toolsVersion :number,   targetRuntime :'iOS.CocoaTouch' | string,   propertyAccessControl :'none' | string,   useAutolayout :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   launchScreen :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   useTraitCollections :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   useSafeAreas :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   colorMatched :@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBBoolean,   initialViewController :string}, {  device :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBDevice>,   dependencies :std.Array<unknown>,   scenes :std.Array<{  scene :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBScene>}>,   resources :std.Array<{  image :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBResourceImage>}>}> */
trait IBItemtypecomappleInterfa extends StObject {
  
  @JSName("$")
  var $: ColorMatched
  
  var dependencies: js.Array[Any]
  
  var device: js.Array[IBDevice]
  
  var resources: js.Array[Image]
  
  var scenes: js.Array[Scene]
}
object IBItemtypecomappleInterfa {
  
  inline def apply(
    $: ColorMatched,
    dependencies: js.Array[Any],
    device: js.Array[IBDevice],
    resources: js.Array[Image],
    scenes: js.Array[Scene]
  ): IBItemtypecomappleInterfa = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBItemtypecomappleInterfa]
  }
  
  extension [Self <: IBItemtypecomappleInterfa](x: Self) {
    
    inline def set$(value: ColorMatched): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[Any]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: Any*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDevice(value: js.Array[IBDevice]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceVarargs(value: IBDevice*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setResources(value: js.Array[Image]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: Image*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setScenes(value: js.Array[Scene]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
    
    inline def setScenesVarargs(value: Scene*): Self = StObject.set(x, "scenes", js.Array(value*))
  }
}
