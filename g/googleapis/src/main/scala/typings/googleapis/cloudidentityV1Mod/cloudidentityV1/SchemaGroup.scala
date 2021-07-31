package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource representing a Group.
  */
trait SchemaGroup extends StObject {
  
  /**
    * The time when the Group was created. Output only.
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
    * `Required`. Labels for Group resource. For creating Groups under a
    * namespace, set label key to &#39;labels/system/groups/external&#39; and
    * label value as empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where group_id is the
    * unique ID assigned to the Group.  Must be left blank while creating a
    * Group.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The entity under which this Group resides in Cloud Identity resource
    * hierarchy. Must be set when creating a Group, read-only afterwards.
    * Currently allowed types: `identitysources`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the Group was last updated. Output only.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaGroup {
  
  @scala.inline
  def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  @scala.inline
  implicit class SchemaGroupMutableBuilder[Self <: SchemaGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGroupKey(value: SchemaEntityKey): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
