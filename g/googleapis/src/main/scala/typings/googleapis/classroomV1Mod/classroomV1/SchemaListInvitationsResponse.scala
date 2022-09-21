package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListInvitationsResponse extends StObject {
  
  /**
    * Invitations that match the list request.
    */
  var invitations: js.UndefOr[js.Array[SchemaInvitation]] = js.undefined
  
  /**
    * Token identifying the next page of results to return. If empty, no further results are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListInvitationsResponse {
  
  inline def apply(): SchemaListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInvitationsResponse]
  }
  
  extension [Self <: SchemaListInvitationsResponse](x: Self) {
    
    inline def setInvitations(value: js.Array[SchemaInvitation]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: SchemaInvitation*): Self = StObject.set(x, "invitations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
