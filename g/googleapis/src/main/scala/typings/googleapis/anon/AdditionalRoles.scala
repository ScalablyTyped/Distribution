package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalRoles extends js.Object {
  
  var additionalRoles: js.UndefOr[js.Array[String]] = js.native
  
  var primaryRole: js.UndefOr[String] = js.native
}
object AdditionalRoles {
  
  @scala.inline
  def apply(): AdditionalRoles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalRoles]
  }
  
  @scala.inline
  implicit class AdditionalRolesOps[Self <: AdditionalRoles] (val x: Self) extends AnyVal {
    
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
    def setAdditionalRolesVarargs(value: String*): Self = this.set("additionalRoles", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalRoles(value: js.Array[String]): Self = this.set("additionalRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalRoles: Self = this.set("additionalRoles", js.undefined)
    
    @scala.inline
    def setPrimaryRole(value: String): Self = this.set("primaryRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryRole: Self = this.set("primaryRole", js.undefined)
  }
}
