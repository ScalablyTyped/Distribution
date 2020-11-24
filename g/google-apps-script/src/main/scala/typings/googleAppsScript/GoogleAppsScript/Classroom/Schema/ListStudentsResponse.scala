package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStudentsResponse extends js.Object {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var students: js.UndefOr[js.Array[Student]] = js.native
}
object ListStudentsResponse {
  
  @scala.inline
  def apply(): ListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudentsResponse]
  }
  
  @scala.inline
  implicit class ListStudentsResponseOps[Self <: ListStudentsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setStudentsVarargs(value: Student*): Self = this.set("students", js.Array(value :_*))
    
    @scala.inline
    def setStudents(value: js.Array[Student]): Self = this.set("students", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudents: Self = this.set("students", js.undefined)
  }
}
