package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGuardianInvitationsResponse extends js.Object {
  
  var guardianInvitations: js.UndefOr[js.Array[GuardianInvitation]] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListGuardianInvitationsResponse {
  
  @scala.inline
  def apply(): ListGuardianInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGuardianInvitationsResponse]
  }
  
  @scala.inline
  implicit class ListGuardianInvitationsResponseOps[Self <: ListGuardianInvitationsResponse] (val x: Self) extends AnyVal {
    
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
    def setGuardianInvitationsVarargs(value: GuardianInvitation*): Self = this.set("guardianInvitations", js.Array(value :_*))
    
    @scala.inline
    def setGuardianInvitations(value: js.Array[GuardianInvitation]): Self = this.set("guardianInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuardianInvitations: Self = this.set("guardianInvitations", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
