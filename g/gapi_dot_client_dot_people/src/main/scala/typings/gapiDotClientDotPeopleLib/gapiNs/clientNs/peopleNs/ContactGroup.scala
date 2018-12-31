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

