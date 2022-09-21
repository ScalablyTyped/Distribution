package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuardian extends StObject {
  
  /**
    * Identifier for the guardian.
    */
  var guardianId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User profile for the guardian.
    */
  var guardianProfile: js.UndefOr[SchemaUserProfile] = js.undefined
  
  /**
    * The email address to which the initial guardian invitation was sent. This field is only visible to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier for the student to whom the guardian relationship applies.
    */
  var studentId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGuardian {
  
  inline def apply(): SchemaGuardian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuardian]
  }
  
  extension [Self <: SchemaGuardian](x: Self) {
    
    inline def setGuardianId(value: String): Self = StObject.set(x, "guardianId", value.asInstanceOf[js.Any])
    
    inline def setGuardianIdNull: Self = StObject.set(x, "guardianId", null)
    
    inline def setGuardianIdUndefined: Self = StObject.set(x, "guardianId", js.undefined)
    
    inline def setGuardianProfile(value: SchemaUserProfile): Self = StObject.set(x, "guardianProfile", value.asInstanceOf[js.Any])
    
    inline def setGuardianProfileUndefined: Self = StObject.set(x, "guardianProfile", js.undefined)
    
    inline def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setInvitedEmailAddressNull: Self = StObject.set(x, "invitedEmailAddress", null)
    
    inline def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
    
    inline def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    inline def setStudentIdNull: Self = StObject.set(x, "studentId", null)
    
    inline def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
