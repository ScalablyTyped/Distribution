package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroup extends StObject {
  
  /**
    * Output only. The time when the `Group` was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An extended description to help users determine the purpose of a `Group`. Must not be longer than 4,096 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the `Group`.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Dynamic group metadata like queries and status.
    */
  var dynamicGroupMetadata: js.UndefOr[SchemaDynamicGroupMetadata] = js.undefined
  
  /**
    * Required. The `EntityKey` of the `Group`.
    */
  var groupKey: js.UndefOr[SchemaEntityKey] = js.undefined
  
  /**
    * Required. One or more label entries that apply to the Group. Currently supported labels contain a key with an empty value. Google Groups are the default type of group and have a label with a key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing Google Groups can have an additional label with a key of `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an immutable change and the security label cannot be removed once added.** Dynamic groups have a label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for Cloud Search have a label with a key of `system/groups/external` and an empty value.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Group`. Shall be of the form `groups/{group_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The resource name of the entity under which this `Group` resides in the Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source_id\}` for external- identity-mapped groups or `customers/{customer_id\}` for Google Groups. The `customer_id` must begin with "C" (for example, 'C046psxkn').
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The POSIX groups associated with the `Group`.
    */
  var posixGroups: js.UndefOr[js.Array[SchemaPosixGroup]] = js.undefined
  
  /**
    * Output only. The time when the `Group` was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroup {
  
  inline def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  extension [Self <: SchemaGroup](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDynamicGroupMetadata(value: SchemaDynamicGroupMetadata): Self = StObject.set(x, "dynamicGroupMetadata", value.asInstanceOf[js.Any])
    
    inline def setDynamicGroupMetadataUndefined: Self = StObject.set(x, "dynamicGroupMetadata", js.undefined)
    
    inline def setGroupKey(value: SchemaEntityKey): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPosixGroups(value: js.Array[SchemaPosixGroup]): Self = StObject.set(x, "posixGroups", value.asInstanceOf[js.Any])
    
    inline def setPosixGroupsUndefined: Self = StObject.set(x, "posixGroups", js.undefined)
    
    inline def setPosixGroupsVarargs(value: SchemaPosixGroup*): Self = StObject.set(x, "posixGroups", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
