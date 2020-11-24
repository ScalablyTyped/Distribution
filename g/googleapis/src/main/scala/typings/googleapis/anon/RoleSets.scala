package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleSets extends js.Object {
  
  var roleSets: js.UndefOr[js.Array[AdditionalRoles]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object RoleSets {
  
  @scala.inline
  def apply(): RoleSets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleSets]
  }
  
  @scala.inline
  implicit class RoleSetsOps[Self <: RoleSets] (val x: Self) extends AnyVal {
    
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
    def setRoleSetsVarargs(value: AdditionalRoles*): Self = this.set("roleSets", js.Array(value :_*))
    
    @scala.inline
    def setRoleSets(value: js.Array[AdditionalRoles]): Self = this.set("roleSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleSets: Self = this.set("roleSets", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
