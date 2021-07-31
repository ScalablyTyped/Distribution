package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUserprofilesGuardianinvitationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * If specified, only results with the specified `invited_email_address`
    * will be returned.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of items to return. Zero or unspecified indicates that the
    * server may assign a maximum.  The server may return fewer than the
    * specified number of results.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * nextPageToken value returned from a previous list call, indicating that
    * the subsequent page of results should be returned.  The list request must
    * be otherwise identical to the one that resulted in this token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, only results with the specified `state` values will be
    * returned. Otherwise, results with a `state` of `PENDING` will be
    * returned.
    */
  var states: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The ID of the student whose guardian invitations are to be returned. The
    * identifier can be one of the following:  * the numeric identifier for the
    * user * the email address of the user * the string literal `"me"`,
    * indicating the requesting user * the string literal `"-"`, indicating
    * that results should be returned for   all students that the requesting
    * user is permitted to view guardian   invitations.
    */
  var studentId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUserprofilesGuardianinvitationsList {
  
  @scala.inline
  def apply(): ParamsResourceUserprofilesGuardianinvitationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserprofilesGuardianinvitationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceUserprofilesGuardianinvitationsListMutableBuilder[Self <: ParamsResourceUserprofilesGuardianinvitationsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStates(value: js.Array[String]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: String*): Self = StObject.set(x, "states", js.Array(value :_*))
    
    @scala.inline
    def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
