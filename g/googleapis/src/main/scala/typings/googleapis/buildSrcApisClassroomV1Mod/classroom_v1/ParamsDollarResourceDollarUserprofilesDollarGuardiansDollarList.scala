package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarUserprofilesDollarGuardiansDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Filter results by the email address that the original invitation was sent
    * to, resulting in this guardian link. This filter can only be used by
    * domain administrators.
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
    * Filter results by the student who the guardian is linked to. The
    * identifier can be one of the following:  * the numeric identifier for the
    * user * the email address of the user * the string literal `"me"`,
    * indicating the requesting user * the string literal `"-"`, indicating
    * that results should be returned for   all students that the requesting
    * user has access to view.
    */
  var studentId: js.UndefOr[String] = js.native
}

