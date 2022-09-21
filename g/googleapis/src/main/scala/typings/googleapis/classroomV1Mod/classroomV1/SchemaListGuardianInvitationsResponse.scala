package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGuardianInvitationsResponse extends StObject {
  
  /**
    * Guardian invitations that matched the list request.
    */
  var guardianInvitations: js.UndefOr[js.Array[SchemaGuardianInvitation]] = js.undefined
  
  /**
    * Token identifying the next page of results to return. If empty, no further results are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGuardianInvitationsResponse {
  
  inline def apply(): SchemaListGuardianInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGuardianInvitationsResponse]
  }
  
  extension [Self <: SchemaListGuardianInvitationsResponse](x: Self) {
    
    inline def setGuardianInvitations(value: js.Array[SchemaGuardianInvitation]): Self = StObject.set(x, "guardianInvitations", value.asInstanceOf[js.Any])
    
    inline def setGuardianInvitationsUndefined: Self = StObject.set(x, "guardianInvitations", js.undefined)
    
    inline def setGuardianInvitationsVarargs(value: SchemaGuardianInvitation*): Self = StObject.set(x, "guardianInvitations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
