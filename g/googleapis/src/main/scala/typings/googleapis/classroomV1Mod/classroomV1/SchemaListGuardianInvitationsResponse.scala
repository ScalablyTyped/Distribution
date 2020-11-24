package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing guardian invitations.
  */
@js.native
trait SchemaListGuardianInvitationsResponse extends js.Object {
  
  /**
    * Guardian invitations that matched the list request.
    */
  var guardianInvitations: js.UndefOr[js.Array[SchemaGuardianInvitation]] = js.native
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListGuardianInvitationsResponse {
  
  @scala.inline
  def apply(): SchemaListGuardianInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGuardianInvitationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListGuardianInvitationsResponseOps[Self <: SchemaListGuardianInvitationsResponse] (val x: Self) extends AnyVal {
    
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
    def setGuardianInvitationsVarargs(value: SchemaGuardianInvitation*): Self = this.set("guardianInvitations", js.Array(value :_*))
    
    @scala.inline
    def setGuardianInvitations(value: js.Array[SchemaGuardianInvitation]): Self = this.set("guardianInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuardianInvitations: Self = this.set("guardianInvitations", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
