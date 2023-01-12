package typings.expoConfigPlugins.anon

import typings.expoConfigTypes.anon.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.Android, 'versionCode' | 'runtimeVersion'> */
trait PickAndroidversionCoderun extends StObject {
  
  var runtimeVersion: js.UndefOr[String | Policy] = js.undefined
  
  var versionCode: js.UndefOr[Double] = js.undefined
}
object PickAndroidversionCoderun {
  
  inline def apply(): PickAndroidversionCoderun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAndroidversionCoderun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickAndroidversionCoderun] (val x: Self) extends AnyVal {
    
    inline def setRuntimeVersion(value: String | Policy): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
