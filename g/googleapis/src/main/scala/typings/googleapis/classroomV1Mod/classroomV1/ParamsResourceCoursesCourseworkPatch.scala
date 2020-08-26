package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCoursesCourseworkPatch extends StandardParameters {
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
  var requestBody: js.UndefOr[SchemaCourseWork] = js.native
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

object ParamsResourceCoursesCourseworkPatch {
  @scala.inline
  def apply(): ParamsResourceCoursesCourseworkPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesCourseworkPatch]
  }
  @scala.inline
  implicit class ParamsResourceCoursesCourseworkPatchOps[Self <: ParamsResourceCoursesCourseworkPatch] (val x: Self) extends AnyVal {
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
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaCourseWork): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

