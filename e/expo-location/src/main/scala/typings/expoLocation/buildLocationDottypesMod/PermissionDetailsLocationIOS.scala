package typings.expoLocation.buildLocationDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionDetailsLocationIOS extends StObject {
  
  /**
    * The scope of granted permission. Indicates when it's possible to use location.
    */
  var scope: "whenInUse" | "always" | "none"
}
object PermissionDetailsLocationIOS {
  
  inline def apply(scope: "whenInUse" | "always" | "none"): PermissionDetailsLocationIOS = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDetailsLocationIOS]
  }
  
  extension [Self <: PermissionDetailsLocationIOS](x: Self) {
    
    inline def setScope(value: "whenInUse" | "always" | "none"): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
