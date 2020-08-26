package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing courses.
  */
@js.native
trait SchemaListCoursesResponse extends js.Object {
  /**
    * Courses that match the list request.
    */
  var courses: js.UndefOr[js.Array[SchemaCourse]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCoursesResponse {
  @scala.inline
  def apply(): SchemaListCoursesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCoursesResponse]
  }
  @scala.inline
  implicit class SchemaListCoursesResponseOps[Self <: SchemaListCoursesResponse] (val x: Self) extends AnyVal {
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
    def setCoursesVarargs(value: SchemaCourse*): Self = this.set("courses", js.Array(value :_*))
    @scala.inline
    def setCourses(value: js.Array[SchemaCourse]): Self = this.set("courses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourses: Self = this.set("courses", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

