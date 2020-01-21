package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCoursesCourseworkList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Identifier of the course. This identifier can be either the
    * Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Restriction on the work status to return. Only courseWork that matches is
    * returned. If unspecified, items with a work status of `PUBLISHED` is
    * returned.
    */
  var courseWorkStates: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional sort ordering for results. A comma-separated list of fields with
    * an optional sort direction keyword. Supported fields are `updateTime` and
    * `dueDate`. Supported direction keywords are `asc` and `desc`. If not
    * specified, `updateTime desc` is the default behavior. Examples: `dueDate
    * asc,updateTime desc`, `updateTime,dueDate desc`
    */
  var orderBy: js.UndefOr[String] = js.native
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
}

