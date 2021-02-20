package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Association between a student and a guardian of that student. The guardian
  * may receive information about the student&#39;s course work.
  */
@js.native
trait SchemaGuardian extends StObject {
  
  /**
    * Identifier for the guardian.
    */
  var guardianId: js.UndefOr[String] = js.native
  
  /**
    * User profile for the guardian.
    */
  var guardianProfile: js.UndefOr[SchemaUserProfile] = js.native
  
  /**
    * The email address to which the initial guardian invitation was sent. This
    * field is only visible to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.native
  
  /**
    * Identifier for the student to whom the guardian relationship applies.
    */
  var studentId: js.UndefOr[String] = js.native
}
object SchemaGuardian {
  
  @scala.inline
  def apply(): SchemaGuardian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuardian]
  }
  
  @scala.inline
  implicit class SchemaGuardianMutableBuilder[Self <: SchemaGuardian] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuardianId(value: String): Self = StObject.set(x, "guardianId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardianIdUndefined: Self = StObject.set(x, "guardianId", js.undefined)
    
    @scala.inline
    def setGuardianProfile(value: SchemaUserProfile): Self = StObject.set(x, "guardianProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardianProfileUndefined: Self = StObject.set(x, "guardianProfile", js.undefined)
    
    @scala.inline
    def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
    
    @scala.inline
    def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
