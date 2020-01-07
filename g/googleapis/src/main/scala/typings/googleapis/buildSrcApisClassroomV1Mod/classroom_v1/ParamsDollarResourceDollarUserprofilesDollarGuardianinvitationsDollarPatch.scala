package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUserprofilesDollarGuardianinvitationsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The `id` field of the `GuardianInvitation` to be modified.
    */
  var invitationId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$GuardianInvitation] = js.native
  /**
    * The ID of the student whose guardian invitation is to be modified.
    */
  var studentId: js.UndefOr[String] = js.native
  /**
    * Mask that identifies which fields on the course to update. This field is
    * required to do an update. The update will fail if invalid fields are
    * specified. The following fields are valid:  * `state`  When set in a
    * query parameter, this field should be specified as
    * `updateMask=<field1>,<field2>,...`
    */
  var updateMask: js.UndefOr[String] = js.native
}

