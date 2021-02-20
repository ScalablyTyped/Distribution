package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUserprofilesGuardianinvitationsPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The `id` field of the `GuardianInvitation` to be modified.
    */
  var invitationId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGuardianInvitation] = js.native
  
  /**
    * The ID of the student whose guardian invitation is to be modified.
    */
  var studentId: js.UndefOr[String] = js.native
  
  /**
    * Mask that identifies which fields on the course to update. This field is
    * required to do an update. The update will fail if invalid fields are
    * specified. The following fields are valid:  * `state`  When set in a
    * query parameter, this field should be specified as
    * `updateMask=<field1>,<field2>,...`
    */
  var updateMask: js.UndefOr[String] = js.native
}
object ParamsResourceUserprofilesGuardianinvitationsPatch {
  
  @scala.inline
  def apply(): ParamsResourceUserprofilesGuardianinvitationsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserprofilesGuardianinvitationsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceUserprofilesGuardianinvitationsPatchMutableBuilder[Self <: ParamsResourceUserprofilesGuardianinvitationsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGuardianInvitation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
