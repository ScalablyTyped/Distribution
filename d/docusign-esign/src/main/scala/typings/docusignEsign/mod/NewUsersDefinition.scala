package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewUsersDefinition extends js.Object {
  
  /**
    * A list of one or more new users.
    */
  var newUsers: js.UndefOr[js.Array[UserInformation]] = js.native
}
object NewUsersDefinition {
  
  @scala.inline
  def apply(): NewUsersDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUsersDefinition]
  }
  
  @scala.inline
  implicit class NewUsersDefinitionOps[Self <: NewUsersDefinition] (val x: Self) extends AnyVal {
    
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
    def setNewUsersVarargs(value: UserInformation*): Self = this.set("newUsers", js.Array(value :_*))
    
    @scala.inline
    def setNewUsers(value: js.Array[UserInformation]): Self = this.set("newUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewUsers: Self = this.set("newUsers", js.undefined)
  }
}
