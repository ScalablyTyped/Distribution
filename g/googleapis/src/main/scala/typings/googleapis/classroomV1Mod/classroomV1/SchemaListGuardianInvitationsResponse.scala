package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing guardian invitations.
  */
@js.native
trait SchemaListGuardianInvitationsResponse extends StObject {
  
  /**
    * Guardian invitations that matched the list request.
    */
  var guardianInvitations: js.UndefOr[js.Array[SchemaGuardianInvitation]] = js.native
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListGuardianInvitationsResponse {
  
  @scala.inline
  def apply(): SchemaListGuardianInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGuardianInvitationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListGuardianInvitationsResponseMutableBuilder[Self <: SchemaListGuardianInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuardianInvitations(value: js.Array[SchemaGuardianInvitation]): Self = StObject.set(x, "guardianInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardianInvitationsUndefined: Self = StObject.set(x, "guardianInvitations", js.undefined)
    
    @scala.inline
    def setGuardianInvitationsVarargs(value: SchemaGuardianInvitation*): Self = StObject.set(x, "guardianInvitations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
