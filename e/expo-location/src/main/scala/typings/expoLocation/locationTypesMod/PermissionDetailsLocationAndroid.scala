package typings.expoLocation.locationTypesMod

import typings.expoLocation.expoLocationStrings.coarse
import typings.expoLocation.expoLocationStrings.fine
import typings.expoLocation.expoLocationStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionDetailsLocationAndroid extends StObject {
  
  var scope: fine | coarse | none
}
object PermissionDetailsLocationAndroid {
  
  inline def apply(scope: fine | coarse | none): PermissionDetailsLocationAndroid = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDetailsLocationAndroid]
  }
  
  extension [Self <: PermissionDetailsLocationAndroid](x: Self) {
    
    inline def setScope(value: fine | coarse | none): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
