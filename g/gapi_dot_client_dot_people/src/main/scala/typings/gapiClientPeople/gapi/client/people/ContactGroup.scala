package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroup extends js.Object {
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.undefined
  /**
    * Output only. The name translated and formatted in the viewer's account locale
    * or the `Accept-Language` HTTP header locale for system groups names.
    * Group names set by the owner are the same as name.
    */
  var formattedName: js.UndefOr[String] = js.undefined
  /** Output only. The contact group type. */
  var groupType: js.UndefOr[String] = js.undefined
  /**
    * Output only. The total number of contacts in the group irrespective of max members in
    * specified in the request.
    */
  var memberCount: js.UndefOr[Double] = js.undefined
  /**
    * Output only. The list of contact person resource names that are members of the contact
    * group. The field is not populated for LIST requests and can only be updated
    * through the
    * [ModifyContactGroupMembers](/people/api/rest/v1/contactgroups/members/modify).
    */
  var memberResourceNames: js.UndefOr[js.Array[String]] = js.undefined
  /** Output only. Metadata about the contact group. */
  var metadata: js.UndefOr[ContactGroupMetadata] = js.undefined
  /**
    * The contact group name set by the group owner or a system provided name
    * for system groups.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The resource name for the contact group, assigned by the server. An ASCII
    * string, in the form of `contactGroups/{contact_group_id}`.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}

object ContactGroup {
  @scala.inline
  def apply(
    etag: String = null,
    formattedName: String = null,
    groupType: String = null,
    memberCount: Int | Double = null,
    memberResourceNames: js.Array[String] = null,
    metadata: ContactGroupMetadata = null,
    name: String = null,
    resourceName: String = null
  ): ContactGroup = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (formattedName != null) __obj.updateDynamic("formattedName")(formattedName.asInstanceOf[js.Any])
    if (groupType != null) __obj.updateDynamic("groupType")(groupType.asInstanceOf[js.Any])
    if (memberCount != null) __obj.updateDynamic("memberCount")(memberCount.asInstanceOf[js.Any])
    if (memberResourceNames != null) __obj.updateDynamic("memberResourceNames")(memberResourceNames.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactGroup]
  }
}

