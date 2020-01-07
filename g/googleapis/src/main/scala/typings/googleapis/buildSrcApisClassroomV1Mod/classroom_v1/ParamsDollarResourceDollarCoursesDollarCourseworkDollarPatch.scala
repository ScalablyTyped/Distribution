package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCoursesDollarCourseworkDollarPatch extends StandardParameters {
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
    * Identifier of the course work.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$CourseWork] = js.native
  /**
    * Mask that identifies which fields on the course work to update. This
    * field is required to do an update. The update fails if invalid fields are
    * specified. If a field supports empty values, it can be cleared by
    * specifying it in the update mask and not in the CourseWork object. If a
    * field that does not support empty values is included in the update mask
    * and not set in the CourseWork object, an `INVALID_ARGUMENT` error will be
    * returned.  The following fields may be specified by teachers:  * `title`
    * * `description` * `state` * `due_date` * `due_time` * `max_points` *
    * `scheduled_time` * `submission_modification_mode`
    */
  var updateMask: js.UndefOr[String] = js.native
}

