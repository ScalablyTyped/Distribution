package typings.expoPrebuildConfig.interfaceBuilderMod

import typings.expoPrebuildConfig.anon.Placeholder
import typings.expoPrebuildConfig.anon.SceneID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  sceneID :string}, {  objects :std.Array<{  viewController :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBViewController>,   placeholder :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<{  id :string,   placeholderIdentifier :string | undefined,   userLabel :string,   sceneMemberID :string}, {[key: string] : any}>>}>,   point :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBPoint>}> */
trait IBScene extends StObject {
  
  @JSName("$")
  var $: SceneID
  
  var objects: js.Array[Placeholder]
  
  var point: js.Array[IBPoint]
}
object IBScene {
  
  inline def apply($: SceneID, objects: js.Array[Placeholder], point: js.Array[IBPoint]): IBScene = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBScene]
  }
  
  extension [Self <: IBScene](x: Self) {
    
    inline def set$(value: SceneID): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setObjects(value: js.Array[Placeholder]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Placeholder*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setPoint(value: js.Array[IBPoint]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointVarargs(value: IBPoint*): Self = StObject.set(x, "point", js.Array(value*))
  }
}
