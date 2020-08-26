package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing invitations.
  */
@js.native
trait SchemaListInvitationsResponse extends js.Object {
  /**
    * Invitations that match the list request.
    */
  var invitations: js.UndefOr[js.Array[SchemaInvitation]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListInvitationsResponse {
  @scala.inline
  def apply(): SchemaListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInvitationsResponse]
  }
  @scala.inline
  implicit class SchemaListInvitationsResponseOps[Self <: SchemaListInvitationsResponse] (val x: Self) extends AnyVal {
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
    def setInvitationsVarargs(value: SchemaInvitation*): Self = this.set("invitations", js.Array(value :_*))
    @scala.inline
    def setInvitations(value: js.Array[SchemaInvitation]): Self = this.set("invitations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitations: Self = this.set("invitations", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

