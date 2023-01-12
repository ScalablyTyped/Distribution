package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.anon.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.IOS, 'buildNumber' | 'runtimeVersion'> */
trait PickIOSbuildNumberruntime extends StObject {
  
  var buildNumber: js.UndefOr[String] = js.undefined
  
  var runtimeVersion: js.UndefOr[String | Policy] = js.undefined
}
object PickIOSbuildNumberruntime {
  
  inline def apply(): PickIOSbuildNumberruntime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIOSbuildNumberruntime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickIOSbuildNumberruntime] (val x: Self) extends AnyVal {
    
    inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    inline def setRuntimeVersion(value: String | Policy): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
  }
}
