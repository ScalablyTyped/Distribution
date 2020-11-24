package typings.exprEval.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithMembers extends js.Object {
  
  var withMembers: js.UndefOr[Boolean] = js.native
}
object WithMembers {
  
  @scala.inline
  def apply(): WithMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithMembers]
  }
  
  @scala.inline
  implicit class WithMembersOps[Self <: WithMembers] (val x: Self) extends AnyVal {
    
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
    def setWithMembers(value: Boolean): Self = this.set("withMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithMembers: Self = this.set("withMembers", js.undefined)
  }
}
