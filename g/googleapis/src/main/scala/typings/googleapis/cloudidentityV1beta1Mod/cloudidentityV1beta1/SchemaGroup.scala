package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a Group
  */
@js.native
trait SchemaGroup extends js.Object {
  /**
    * Optional. Additional entity key aliases for a Group
    */
  var additionalGroupKeys: js.UndefOr[js.Array[SchemaEntityKey]] = js.native
  /**
    * The time when the Group was created. Output only
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * An extended description to help users determine the purpose of a Group.
    * For example, you can include information about who should join the Group,
    * the types of messages to send to the Group, links to FAQs about the
    * Group, or related Groups. Maximum length is 4,096 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The Group&#39;s display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * EntityKey of the Group.  Must be set when creating a Group, read-only
    * afterwards.
    */
  var groupKey: js.UndefOr[SchemaEntityKey] = js.native
  /**
    * Labels for Group resource. Required. For creating Groups under a
    * namespace, set label key to &#39;labels/system/groups/external&#39; and
    * label value as empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where group_id is the
    * unique id assigned to the Group.  Must be left blank while creating a
    * Group
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The entity under which this Group resides in Cloud Identity resource
    * hierarchy. Must be set when creating a Group, read-only afterwards.
    * Currently allowed types: &#39;identitysources&#39;.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The time when the Group was last updated. Output only
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGroup {
  @scala.inline
  def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  @scala.inline
  implicit class SchemaGroupOps[Self <: SchemaGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalGroupKeysVarargs(value: SchemaEntityKey*): Self = this.set("additionalGroupKeys", js.Array(value :_*))
    @scala.inline
    def setAdditionalGroupKeys(value: js.Array[SchemaEntityKey]): Self = this.set("additionalGroupKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalGroupKeys: Self = this.set("additionalGroupKeys", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setGroupKey(value: SchemaEntityKey): Self = this.set("groupKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupKey: Self = this.set("groupKey", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

