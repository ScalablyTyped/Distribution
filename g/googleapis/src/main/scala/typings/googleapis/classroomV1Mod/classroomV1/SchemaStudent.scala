package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Student in a course.
  */
trait SchemaStudent extends StObject {
  
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.undefined
  
  /**
    * Global user information for the student.  Read-only.
    */
  var profile: js.UndefOr[SchemaUserProfile] = js.undefined
  
  /**
    * Information about a Drive Folder for this student&#39;s work in this
    * course. Only visible to the student and domain administrators. Read-only.
    */
  var studentWorkFolder: js.UndefOr[SchemaDriveFolder] = js.undefined
  
  /**
    * Identifier of the user.  When specified as a parameter of a request, this
    * identifier can be one of the following:  * the numeric identifier for the
    * user * the email address of the user * the string literal
    * `&quot;me&quot;`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.undefined
}
object SchemaStudent {
  
  inline def apply(): SchemaStudent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStudent]
  }
  
  extension [Self <: SchemaStudent](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setProfile(value: SchemaUserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setStudentWorkFolder(value: SchemaDriveFolder): Self = StObject.set(x, "studentWorkFolder", value.asInstanceOf[js.Any])
    
    inline def setStudentWorkFolderUndefined: Self = StObject.set(x, "studentWorkFolder", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
