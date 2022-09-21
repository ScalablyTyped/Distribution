package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedSpaceInfo extends StObject {
  
  var avatarInfo: js.UndefOr[SchemaAppsDynamiteSharedAvatarInfo] = js.undefined
  
  var avatarUrl: js.UndefOr[String | Null] = js.undefined
  
  var description: js.UndefOr[String | Null] = js.undefined
  
  var groupId: js.UndefOr[SchemaGroupId] = js.undefined
  
  /**
    * The email address of the user that invited the calling user to the room, if available. This field will only be populated for direct invites, it will be empty if the user was indirectly invited to the group.
    */
  var inviterEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this is a space that enables guest access
    */
  var isExternal: js.UndefOr[Boolean | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var numMembers: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * searching user's membership state in this space
    */
  var userMembershipState: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedSpaceInfo {
  
  inline def apply(): SchemaAppsDynamiteSharedSpaceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedSpaceInfo]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedSpaceInfo](x: Self) {
    
    inline def setAvatarInfo(value: SchemaAppsDynamiteSharedAvatarInfo): Self = StObject.set(x, "avatarInfo", value.asInstanceOf[js.Any])
    
    inline def setAvatarInfoUndefined: Self = StObject.set(x, "avatarInfo", js.undefined)
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlNull: Self = StObject.set(x, "avatarUrl", null)
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroupId(value: SchemaGroupId): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setInviterEmail(value: String): Self = StObject.set(x, "inviterEmail", value.asInstanceOf[js.Any])
    
    inline def setInviterEmailNull: Self = StObject.set(x, "inviterEmail", null)
    
    inline def setInviterEmailUndefined: Self = StObject.set(x, "inviterEmail", js.undefined)
    
    inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
    
    inline def setIsExternalNull: Self = StObject.set(x, "isExternal", null)
    
    inline def setIsExternalUndefined: Self = StObject.set(x, "isExternal", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumMembers(value: Double): Self = StObject.set(x, "numMembers", value.asInstanceOf[js.Any])
    
    inline def setNumMembersNull: Self = StObject.set(x, "numMembers", null)
    
    inline def setNumMembersUndefined: Self = StObject.set(x, "numMembers", js.undefined)
    
    inline def setUserMembershipState(value: String): Self = StObject.set(x, "userMembershipState", value.asInstanceOf[js.Any])
    
    inline def setUserMembershipStateNull: Self = StObject.set(x, "userMembershipState", null)
    
    inline def setUserMembershipStateUndefined: Self = StObject.set(x, "userMembershipState", js.undefined)
  }
}
