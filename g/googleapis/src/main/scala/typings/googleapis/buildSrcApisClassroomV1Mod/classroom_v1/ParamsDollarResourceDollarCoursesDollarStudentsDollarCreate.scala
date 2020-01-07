package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarCoursesDollarStudentsDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Identifier of the course to create the student in. This identifier can be
    * either the Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Enrollment code of the course to create the student in. This code is
    * required if userId corresponds to the requesting user; it may be omitted
    * if the requesting user has administrative permissions to create students
    * for any user.
    */
  var enrollmentCode: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Student] = js.native
}

