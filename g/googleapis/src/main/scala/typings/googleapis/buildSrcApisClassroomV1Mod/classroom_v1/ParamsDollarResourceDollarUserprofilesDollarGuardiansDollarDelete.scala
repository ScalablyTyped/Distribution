package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUserprofilesDollarGuardiansDollarDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The `id` field from a `Guardian`.
    */
  var guardianId: js.UndefOr[String] = js.native
  /**
    * The student whose guardian is to be deleted. One of the following:  * the
    * numeric identifier for the user * the email address of the user * the
    * string literal `"me"`, indicating the requesting user
    */
  var studentId: js.UndefOr[String] = js.native
}

