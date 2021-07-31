package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUserprofilesGuardianinvitationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
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
  
  @scala.inline
  def apply(): ParamsResourceUserprofilesGuardianinvitationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserprofilesGuardianinvitationsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceUserprofilesGuardianinvitationsGetMutableBuilder[Self <: ParamsResourceUserprofilesGuardianinvitationsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    @scala.inline
    def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
