package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUserprofilesGuardianinvitationsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If specified, only results with the specified `invited_email_address`
    * will be returned.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.native
  /**
    * Maximum number of items to return. Zero or unspecified indicates that the
    * server may assign a maximum.  The server may return fewer than the
    * specified number of results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * nextPageToken value returned from a previous list call, indicating that
    * the subsequent page of results should be returned.  The list request must
    * be otherwise identical to the one that resulted in this token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * If specified, only results with the specified `state` values will be
    * returned. Otherwise, results with a `state` of `PENDING` will be
    * returned.
    */
  var states: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the student whose guardian invitations are to be returned. The
    * identifier can be one of the following:  * the numeric identifier for the
    * user * the email address of the user * the string literal `"me"`,
    * indicating the requesting user * the string literal `"-"`, indicating
    * that results should be returned for   all students that the requesting
    * user is permitted to view guardian   invitations.
    */
  var studentId: js.UndefOr[String] = js.native
}

object ParamsResourceUserprofilesGuardianinvitationsList {
  @scala.inline
  def apply(): ParamsResourceUserprofilesGuardianinvitationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserprofilesGuardianinvitationsList]
  }
  @scala.inline
  implicit class ParamsResourceUserprofilesGuardianinvitationsListOps[Self <: ParamsResourceUserprofilesGuardianinvitationsList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setInvitedEmailAddress(value: String): Self = this.set("invitedEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedEmailAddress: Self = this.set("invitedEmailAddress", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setStatesVarargs(value: String*): Self = this.set("states", js.Array(value :_*))
    @scala.inline
    def setStates(value: js.Array[String]): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    @scala.inline
    def setStudentId(value: String): Self = this.set("studentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudentId: Self = this.set("studentId", js.undefined)
  }
  
}

