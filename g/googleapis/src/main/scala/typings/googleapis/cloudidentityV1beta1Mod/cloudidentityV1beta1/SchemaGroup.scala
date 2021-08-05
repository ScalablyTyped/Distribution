package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource representing a Group
  */
trait SchemaGroup extends StObject {
  
  /**
    * Optional. Additional entity key aliases for a Group
    */
  var additionalGroupKeys: js.UndefOr[js.Array[SchemaEntityKey]] = js.undefined
  
  /**
    * The time when the Group was created. Output only
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * An extended description to help users determine the purpose of a Group.
    * For example, you can include information about who should join the Group,
    * the types of messages to send to the Group, links to FAQs about the
    * Group, or related Groups. Maximum length is 4,096 characters.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The Group&#39;s display name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * EntityKey of the Group.  Must be set when creating a Group, read-only
    * afterwards.
    */
  var groupKey: js.UndefOr[SchemaEntityKey] = js.undefined
  
  /**
    * Labels for Group resource. Required. For creating Groups under a
    * namespace, set label key to &#39;labels/system/groups/external&#39; and
    * label value as empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where group_id is the
    * unique id assigned to the Group.  Must be left blank while creating a
    * Group
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The entity under which this Group resides in Cloud Identity resource
    * hierarchy. Must be set when creating a Group, read-only afterwards.
    * Currently allowed types: &#39;identitysources&#39;.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the Group was last updated. Output only
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaGroup {
  
  inline def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  extension [Self <: SchemaGroup](x: Self) {
    
    inline def setAdditionalGroupKeys(value: js.Array[SchemaEntityKey]): Self = StObject.set(x, "additionalGroupKeys", value.asInstanceOf[js.Any])
    
    inline def setAdditionalGroupKeysUndefined: Self = StObject.set(x, "additionalGroupKeys", js.undefined)
    
    inline def setAdditionalGroupKeysVarargs(value: SchemaEntityKey*): Self = StObject.set(x, "additionalGroupKeys", js.Array(value :_*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGroupKey(value: SchemaEntityKey): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
