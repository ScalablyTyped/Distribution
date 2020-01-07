package typings.googleapis.buildSrcApisCloudidentityV1beta1Mod.cloudidentity_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a Group
  */
@js.native
trait Schema$Group extends js.Object {
  /**
    * Optional. Additional entity key aliases for a Group
    */
  var additionalGroupKeys: js.UndefOr[js.Array[Schema$EntityKey]] = js.native
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
  var groupKey: js.UndefOr[Schema$EntityKey] = js.native
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

object Schema$Group {
  @scala.inline
  def apply(
    additionalGroupKeys: js.Array[Schema$EntityKey] = null,
    createTime: String = null,
    description: String = null,
    displayName: String = null,
    groupKey: Schema$EntityKey = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    parent: String = null,
    updateTime: String = null
  ): Schema$Group = {
    val __obj = js.Dynamic.literal()
    if (additionalGroupKeys != null) __obj.updateDynamic("additionalGroupKeys")(additionalGroupKeys.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (groupKey != null) __obj.updateDynamic("groupKey")(groupKey.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Group]
  }
}

