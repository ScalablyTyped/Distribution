package typings.expoConfigTypes.anon

import typings.expoConfigTypes.expoConfigTypesStrings.appVersion
import typings.expoConfigTypes.expoConfigTypesStrings.nativeVersion
import typings.expoConfigTypes.expoConfigTypesStrings.sdkVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  var policy: nativeVersion | sdkVersion | appVersion
}
object Policy {
  
  inline def apply(policy: nativeVersion | sdkVersion | appVersion): Policy = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: nativeVersion | sdkVersion | appVersion): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
