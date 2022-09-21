package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUserprofilesGuardianinvitationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The `id` field of the `GuardianInvitation` being requested.
    */
  var invitationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the student whose guardian invitation is being requested.
    */
  var studentId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUserprofilesGuardianinvitationsGet {
  
  inline def apply(): ParamsResourceUserprofilesGuardianinvitationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserprofilesGuardianinvitationsGet]
  }
  
  extension [Self <: ParamsResourceUserprofilesGuardianinvitationsGet](x: Self) {
    
    inline def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    inline def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    inline def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
