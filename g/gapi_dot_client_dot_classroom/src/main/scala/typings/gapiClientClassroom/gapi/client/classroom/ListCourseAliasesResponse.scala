package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCourseAliasesResponse extends js.Object {
  /** The course aliases. */
  var aliases: js.UndefOr[js.Array[CourseAlias]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListCourseAliasesResponse {
  @scala.inline
  def apply(): ListCourseAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCourseAliasesResponse]
  }
  @scala.inline
  implicit class ListCourseAliasesResponseOps[Self <: ListCourseAliasesResponse] (val x: Self) extends AnyVal {
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
    def setAliasesVarargs(value: CourseAlias*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[CourseAlias]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

