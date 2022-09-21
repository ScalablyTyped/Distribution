package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.expoConfigPluginsStrings.default
import typings.expoConfigPlugins.expoConfigPluginsStrings.landscape
import typings.expoConfigPlugins.expoConfigPluginsStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'orientation'> */
trait PickExpoConfigorientation extends StObject {
  
  var orientation: js.UndefOr[default | portrait | landscape] = js.undefined
}
object PickExpoConfigorientation {
  
  inline def apply(): PickExpoConfigorientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickExpoConfigorientation]
  }
  
  extension [Self <: PickExpoConfigorientation](x: Self) {
    
    inline def setOrientation(value: default | portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
