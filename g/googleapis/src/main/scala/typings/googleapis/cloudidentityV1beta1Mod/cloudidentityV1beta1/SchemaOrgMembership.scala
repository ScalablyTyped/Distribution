package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrgMembership extends StObject {
  
  /**
    * Immutable. Org member id as full resource name. Format for shared drive resource: //drive.googleapis.com/drives/{$memberId\} where `$memberId` is the `id` from [Drive API (V3) `Drive` resource](https://developers.google.com/drive/api/v3/reference/drives#resource).
    */
  var member: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uri with which you can read the member. This follows https://aip.dev/122 Format for shared drive resource: https://drive.googleapis.com/drive/v3/drives/{$memberId\} where `$memberId` is the `id` from [Drive API (V3) `Drive` resource](https://developers.google.com/drive/api/v3/reference/drives#resource).
    */
  var memberUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The [resource name](https://cloud.google.com/apis/design/resource_names) of the OrgMembership. Format: orgUnits/{$orgUnitId\}/memberships/{$membership\} The `$orgUnitId` is the `orgUnitId` from the [Admin SDK `OrgUnit` resource](https://developers.google.com/admin-sdk/directory/reference/rest/v1/orgunits). The `$membership` shall be of the form `{$entityType\};{$memberId\}`, where `$entityType` is the enum value of [OrgMembership.EntityType], and `memberId` is the `id` from [Drive API (V3) `Drive` resource](https://developers.google.com/drive/api/v3/reference/drives#resource) for OrgMembership.EntityType.SHARED_DRIVE.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Entity type for the org member.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrgMembership {
  
  inline def apply(): SchemaOrgMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgMembership]
  }
  
  extension [Self <: SchemaOrgMembership](x: Self) {
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberNull: Self = StObject.set(x, "member", null)
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setMemberUri(value: String): Self = StObject.set(x, "memberUri", value.asInstanceOf[js.Any])
    
    inline def setMemberUriNull: Self = StObject.set(x, "memberUri", null)
    
    inline def setMemberUriUndefined: Self = StObject.set(x, "memberUri", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
