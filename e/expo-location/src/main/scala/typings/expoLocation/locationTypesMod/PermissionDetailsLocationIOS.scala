package typings.expoLocation.locationTypesMod

import typings.expoLocation.expoLocationStrings.always
import typings.expoLocation.expoLocationStrings.none
import typings.expoLocation.expoLocationStrings.whenInUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionDetailsLocationIOS extends StObject {
  
  var scope: whenInUse | always | none = js.native
}
object PermissionDetailsLocationIOS {
  
  @scala.inline
  def apply(scope: whenInUse | always | none): PermissionDetailsLocationIOS = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDetailsLocationIOS]
  }
  
  @scala.inline
  implicit class PermissionDetailsLocationIOSMutableBuilder[Self <: PermissionDetailsLocationIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: whenInUse | always | none): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
