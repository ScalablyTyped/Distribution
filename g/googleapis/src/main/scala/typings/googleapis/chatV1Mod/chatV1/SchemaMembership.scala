package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembership extends StObject {
  
  /**
    * Output only. The creation time of the membership, such as when a member joined or was invited to join a space.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Google Chat user or app. Format: `users/{user\}` or `users/app` When `users/{user\}`, represents a [person](https://developers.google.com/people/api/rest/v1/people) in the People API or a [user](https://developers.google.com/admin-sdk/directory/reference/rest/v1/users) in the Admin SDK Directory API. When `users/app`, represents a Chat app creating membership for itself.
    */
  var member: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Resource name of the membership. Format: spaces/{space\}/members/{member\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. User's role within a Chat space, which determines their permitted actions in the space.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the membership.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembership {
  
  inline def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  
  extension [Self <: SchemaMembership](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setMember(value: SchemaUser): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
