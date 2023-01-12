package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-plugins.@expo/config-plugins/build/Plugin.types.ModProps<@expo/config-plugins.@expo/config-plugins/build/ios/IosConfig.types.InfoPlist>, 'projectRoot'> */
trait PickModPropsInfoPlistproj extends StObject {
  
  var projectRoot: String
}
object PickModPropsInfoPlistproj {
  
  inline def apply(projectRoot: String): PickModPropsInfoPlistproj = {
    val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickModPropsInfoPlistproj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickModPropsInfoPlistproj] (val x: Self) extends AnyVal {
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
  }
}
