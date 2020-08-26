package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCoursesPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Identifier of the course to update. This identifier can be either the
    * Classroom-assigned identifier or an alias.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCourse] = js.native
  /**
    * Mask that identifies which fields on the course to update. This field is
    * required to do an update. The update will fail if invalid fields are
    * specified. The following fields are valid:  * `name` * `section` *
    * `descriptionHeading` * `description` * `room` * `courseState` * `ownerId`
    * Note: patches to ownerId are treated as being effective immediately, but
    * in practice it may take some time for the ownership transfer of all
    * affected resources to complete.  When set in a query parameter, this
    * field should be specified as  `updateMask=<field1>,<field2>,...`
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceCoursesPatch {
  @scala.inline
  def apply(): ParamsResourceCoursesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesPatch]
  }
  @scala.inline
  implicit class ParamsResourceCoursesPatchOps[Self <: ParamsResourceCoursesPatch] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaCourse): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

