package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroup extends js.Object {
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The read-only name translated and formatted in the viewer's account locale
    * or the `Accept-Language` HTTP header locale for system groups names.
    * Group names set by the owner are the same as name.
    */
  var formattedName: js.UndefOr[java.lang.String] = js.undefined
  /** The read-only contact group type. */
  var groupType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The total number of contacts in the group irrespective of max members in
    * specified in the request.
    */
  var memberCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The list of contact person resource names that are members of the contact
    * group. The field is not populated for LIST requests and can only be updated
    * through the
    * [ModifyContactGroupMembers](/people/api/rest/v1/contactgroups/members/modify).
    */
  var memberResourceNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Metadata about the contact group. */
  var metadata: js.UndefOr[ContactGroupMetadata] = js.undefined
  /**
    * The contact group name set by the group owner or a system provided name
    * for system groups.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource name for the contact group, assigned by the server. An ASCII
    * string, in the form of `contactGroups/`<var>contact_group_id</var>.
    */
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
}

object ContactGroup {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    formattedName: java.lang.String = null,
    groupType: java.lang.String = null,
    memberCount: scala.Int | scala.Double = null,
    memberResourceNames: js.Array[java.lang.String] = null,
    metadata: ContactGroupMetadata = null,
    name: java.lang.String = null,
    resourceName: java.lang.String = null
  ): ContactGroup = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (formattedName != null) __obj.updateDynamic("formattedName")(formattedName)
    if (groupType != null) __obj.updateDynamic("groupType")(groupType)
    if (memberCount != null) __obj.updateDynamic("memberCount")(memberCount.asInstanceOf[js.Any])
    if (memberResourceNames != null) __obj.updateDynamic("memberResourceNames")(memberResourceNames)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[ContactGroup]
  }
}

