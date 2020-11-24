package typings.easyRbac.anon

import typings.easyRbac.mod.RoleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Can extends js.Object {
  
  var can: js.Array[String | RoleObject] = js.native
  
  var inherits: js.UndefOr[js.Array[String]] = js.native
}
object Can {
  
  @scala.inline
  def apply(can: js.Array[String | RoleObject]): Can = {
    val __obj = js.Dynamic.literal(can = can.asInstanceOf[js.Any])
    __obj.asInstanceOf[Can]
  }
  
  @scala.inline
  implicit class CanOps[Self <: Can] (val x: Self) extends AnyVal {
    
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
    def setCanVarargs(value: (String | RoleObject)*): Self = this.set("can", js.Array(value :_*))
    
    @scala.inline
    def setCan(value: js.Array[String | RoleObject]): Self = this.set("can", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritsVarargs(value: String*): Self = this.set("inherits", js.Array(value :_*))
    
    @scala.inline
    def setInherits(value: js.Array[String]): Self = this.set("inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherits: Self = this.set("inherits", js.undefined)
  }
}
