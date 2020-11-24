package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Student in a course.
  */
@js.native
trait SchemaStudent extends js.Object {
  
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  
  /**
    * Global user information for the student.  Read-only.
    */
  var profile: js.UndefOr[SchemaUserProfile] = js.native
  
  /**
    * Information about a Drive Folder for this student&#39;s work in this
    * course. Only visible to the student and domain administrators. Read-only.
    */
  var studentWorkFolder: js.UndefOr[SchemaDriveFolder] = js.native
  
  /**
    * Identifier of the user.  When specified as a parameter of a request, this
    * identifier can be one of the following:  * the numeric identifier for the
    * user * the email address of the user * the string literal
    * `&quot;me&quot;`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaStudent {
  
  @scala.inline
  def apply(): SchemaStudent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStudent]
  }
  
  @scala.inline
  implicit class SchemaStudentOps[Self <: SchemaStudent] (val x: Self) extends AnyVal {
    
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
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
    
    @scala.inline
    def setProfile(value: SchemaUserProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setStudentWorkFolder(value: SchemaDriveFolder): Self = this.set("studentWorkFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudentWorkFolder: Self = this.set("studentWorkFolder", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
