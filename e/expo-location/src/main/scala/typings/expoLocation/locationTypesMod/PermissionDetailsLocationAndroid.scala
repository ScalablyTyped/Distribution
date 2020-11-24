package typings.expoLocation.locationTypesMod

import typings.expoLocation.expoLocationStrings.coarse
import typings.expoLocation.expoLocationStrings.fine
import typings.expoLocation.expoLocationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionDetailsLocationAndroid extends js.Object {
  
  var scope: fine | coarse | none = js.native
}
object PermissionDetailsLocationAndroid {
  
  @scala.inline
  def apply(scope: fine | coarse | none): PermissionDetailsLocationAndroid = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDetailsLocationAndroid]
  }
  
  @scala.inline
  implicit class PermissionDetailsLocationAndroidOps[Self <: PermissionDetailsLocationAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScope(value: fine | coarse | none): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
}
