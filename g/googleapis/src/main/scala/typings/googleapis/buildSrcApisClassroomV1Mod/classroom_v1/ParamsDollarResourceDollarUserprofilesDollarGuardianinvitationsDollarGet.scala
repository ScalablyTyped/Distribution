package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUserprofilesDollarGuardianinvitationsDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The `id` field of the `GuardianInvitation` being requested.
    */
  var invitationId: js.UndefOr[String] = js.native
  /**
    * The ID of the student whose guardian invitation is being requested.
    */
  var studentId: js.UndefOr[String] = js.native
}

