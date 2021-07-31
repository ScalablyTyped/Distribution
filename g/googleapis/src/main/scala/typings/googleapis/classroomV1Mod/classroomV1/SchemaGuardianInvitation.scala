package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An invitation to become the guardian of a specified user, sent to a
  * specified email address.
  */
trait SchemaGuardianInvitation extends StObject {
  
  /**
    * The time that this invitation was created.  Read-only.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for this invitation.  Read-only.
    */
  var invitationId: js.UndefOr[String] = js.undefined
  
  /**
    * Email address that the invitation was sent to. This field is only visible
    * to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The state that this invitation is in.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the student (in standard format)
    */
  var studentId: js.UndefOr[String] = js.undefined
}
object SchemaGuardianInvitation {
  
  @scala.inline
  def apply(): SchemaGuardianInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuardianInvitation]
  }
  
  @scala.inline
  implicit class SchemaGuardianInvitationMutableBuilder[Self <: SchemaGuardianInvitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    @scala.inline
    def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
