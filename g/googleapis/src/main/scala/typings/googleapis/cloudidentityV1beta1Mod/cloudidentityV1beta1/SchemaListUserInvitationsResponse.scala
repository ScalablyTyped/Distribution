package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListUserInvitationsResponse extends StObject {
  
  /**
    * The token for the next page. If not empty, indicates that there may be more `UserInvitation` resources that match the listing request; this value can be used in a subsequent ListUserInvitationsRequest to get continued results with the current list call.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of UserInvitation resources.
    */
  var userInvitations: js.UndefOr[js.Array[SchemaUserInvitation]] = js.undefined
}
object SchemaListUserInvitationsResponse {
  
  inline def apply(): SchemaListUserInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserInvitationsResponse]
  }
  
  extension [Self <: SchemaListUserInvitationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserInvitations(value: js.Array[SchemaUserInvitation]): Self = StObject.set(x, "userInvitations", value.asInstanceOf[js.Any])
    
    inline def setUserInvitationsUndefined: Self = StObject.set(x, "userInvitations", js.undefined)
    
    inline def setUserInvitationsVarargs(value: SchemaUserInvitation*): Self = StObject.set(x, "userInvitations", js.Array(value*))
  }
}
