package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCoursesAliasesDelete extends StandardParameters {
  /**
    * Alias to delete. This may not be the Classroom-assigned identifier.
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Identifier of the course whose alias should be deleted. This identifier
    * can be either the Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.native
}

object ParamsResourceCoursesAliasesDelete {
  @scala.inline
  def apply(): ParamsResourceCoursesAliasesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesAliasesDelete]
  }
  @scala.inline
  implicit class ParamsResourceCoursesAliasesDeleteOps[Self <: ParamsResourceCoursesAliasesDelete] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
  }
  
}

