package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contact group.
  */
@js.native
trait Schema$ContactGroup extends js.Object {
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The read-only name translated and formatted in the viewer&#39;s account
    * locale or the `Accept-Language` HTTP header locale for system groups
    * names. Group names set by the owner are the same as name.
    */
  var formattedName: js.UndefOr[String] = js.native
  /**
    * The read-only contact group type.
    */
  var groupType: js.UndefOr[String] = js.native
  /**
    * The total number of contacts in the group irrespective of max members in
    * specified in the request.
    */
  var memberCount: js.UndefOr[Double] = js.native
  /**
    * The list of contact person resource names that are members of the contact
    * group. The field is not populated for LIST requests and can only be
    * updated through the
    * [ModifyContactGroupMembers](/people/api/rest/v1/contactgroups/members/modify).
    */
  var memberResourceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Metadata about the contact group.
    */
  var metadata: js.UndefOr[Schema$ContactGroupMetadata] = js.native
  /**
    * The contact group name set by the group owner or a system provided name
    * for system groups.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The resource name for the contact group, assigned by the server. An ASCII
    * string, in the form of
    * `contactGroups/`&lt;var&gt;contact_group_id&lt;/var&gt;.
    */
  var resourceName: js.UndefOr[String] = js.native
}

object Schema$ContactGroup {
  @scala.inline
  def apply(
    etag: String = null,
    formattedName: String = null,
    groupType: String = null,
    memberCount: Int | Double = null,
    memberResourceNames: js.Array[String] = null,
    metadata: Schema$ContactGroupMetadata = null,
    name: String = null,
    resourceName: String = null
  ): Schema$ContactGroup = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (formattedName != null) __obj.updateDynamic("formattedName")(formattedName.asInstanceOf[js.Any])
    if (groupType != null) __obj.updateDynamic("groupType")(groupType.asInstanceOf[js.Any])
    if (memberCount != null) __obj.updateDynamic("memberCount")(memberCount.asInstanceOf[js.Any])
    if (memberResourceNames != null) __obj.updateDynamic("memberResourceNames")(memberResourceNames.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ContactGroup]
  }
}

