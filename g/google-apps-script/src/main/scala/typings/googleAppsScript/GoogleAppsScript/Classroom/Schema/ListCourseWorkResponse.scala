package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCourseWorkResponse extends js.Object {
  
  var courseWork: js.UndefOr[js.Array[CourseWork]] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCourseWorkResponse {
  
  @scala.inline
  def apply(): ListCourseWorkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCourseWorkResponse]
  }
  
  @scala.inline
  implicit class ListCourseWorkResponseOps[Self <: ListCourseWorkResponse] (val x: Self) extends AnyVal {
    
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
    def setCourseWorkVarargs(value: CourseWork*): Self = this.set("courseWork", js.Array(value :_*))
    
    @scala.inline
    def setCourseWork(value: js.Array[CourseWork]): Self = this.set("courseWork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCourseWork: Self = this.set("courseWork", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
