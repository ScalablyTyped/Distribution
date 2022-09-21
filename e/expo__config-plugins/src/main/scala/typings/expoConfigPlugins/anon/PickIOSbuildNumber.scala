package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.IOS, 'buildNumber'> */
trait PickIOSbuildNumber extends StObject {
  
  var buildNumber: js.UndefOr[String] = js.undefined
}
object PickIOSbuildNumber {
  
  inline def apply(): PickIOSbuildNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIOSbuildNumber]
  }
  
  extension [Self <: PickIOSbuildNumber](x: Self) {
    
    inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
  }
}
