package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCoursesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Restricts returned courses to those in one of the specified states The
    * default value is ACTIVE, ARCHIVED, PROVISIONED, DECLINED.
    */
  var courseStates: js.UndefOr[js.Array[String]] = js.native
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
    * Restricts returned courses to those having a student with the specified
    * identifier. The identifier can be one of the following:  * the numeric
    * identifier for the user * the email address of the user * the string
    * literal `"me"`, indicating the requesting user
    */
  var studentId: js.UndefOr[String] = js.native
  /**
    * Restricts returned courses to those having a teacher with the specified
    * identifier. The identifier can be one of the following:  * the numeric
    * identifier for the user * the email address of the user * the string
    * literal `"me"`, indicating the requesting user
    */
  var teacherId: js.UndefOr[String] = js.native
}

