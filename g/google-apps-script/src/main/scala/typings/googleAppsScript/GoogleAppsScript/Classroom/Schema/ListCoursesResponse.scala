package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCoursesResponse extends js.Object {
  var courses: js.UndefOr[js.Array[Course]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListCoursesResponse {
  @scala.inline
  def apply(): ListCoursesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoursesResponse]
  }
  @scala.inline
  implicit class ListCoursesResponseOps[Self <: ListCoursesResponse] (val x: Self) extends AnyVal {
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
    def setCoursesVarargs(value: Course*): Self = this.set("courses", js.Array(value :_*))
    @scala.inline
    def setCourses(value: js.Array[Course]): Self = this.set("courses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourses: Self = this.set("courses", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

