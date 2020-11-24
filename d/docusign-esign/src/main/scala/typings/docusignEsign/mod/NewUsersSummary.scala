package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewUsersSummary extends js.Object {
  
  /**
    * A list of one or more new users.
    */
  var newUsers: js.UndefOr[js.Array[/* object representing a new user. */ NewUser]] = js.native
}
object NewUsersSummary {
  
  @scala.inline
  def apply(): NewUsersSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUsersSummary]
  }
  
  @scala.inline
  implicit class NewUsersSummaryOps[Self <: NewUsersSummary] (val x: Self) extends AnyVal {
    
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
    def setNewUsersVarargs(value: (/* object representing a new user. */ NewUser)*): Self = this.set("newUsers", js.Array(value :_*))
    
    @scala.inline
    def setNewUsers(value: js.Array[/* object representing a new user. */ NewUser]): Self = this.set("newUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewUsers: Self = this.set("newUsers", js.undefined)
  }
}
