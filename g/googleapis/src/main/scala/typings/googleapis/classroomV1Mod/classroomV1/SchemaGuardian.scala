package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Association between a student and a guardian of that student. The guardian
  * may receive information about the student&#39;s course work.
  */
@js.native
trait SchemaGuardian extends js.Object {
  
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
  implicit class SchemaGuardianOps[Self <: SchemaGuardian] (val x: Self) extends AnyVal {
    
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
    def setGuardianId(value: String): Self = this.set("guardianId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuardianId: Self = this.set("guardianId", js.undefined)
    
    @scala.inline
    def setGuardianProfile(value: SchemaUserProfile): Self = this.set("guardianProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuardianProfile: Self = this.set("guardianProfile", js.undefined)
    
    @scala.inline
    def setInvitedEmailAddress(value: String): Self = this.set("invitedEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitedEmailAddress: Self = this.set("invitedEmailAddress", js.undefined)
    
    @scala.inline
    def setStudentId(value: String): Self = this.set("studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudentId: Self = this.set("studentId", js.undefined)
  }
}
