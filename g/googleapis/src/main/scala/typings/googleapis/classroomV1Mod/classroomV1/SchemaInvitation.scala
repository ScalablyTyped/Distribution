package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvitation extends StObject {
  
  /**
    * Identifier of the course to invite the user to.
    */
  var courseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier assigned by Classroom. Read-only.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Role to invite the user to have. Must not be `COURSE_ROLE_UNSPECIFIED`.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier of the invited user. When specified as a parameter of a request, this identifier can be set to one of the following: * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaInvitation {
  
  inline def apply(): SchemaInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvitation]
  }
  
  extension [Self <: SchemaInvitation](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdNull: Self = StObject.set(x, "courseId", null)
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
