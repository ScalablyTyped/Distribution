package typings.gapiDotClientDotClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always clouduseraccounts#group for groups. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output Only] A list of URLs to User resources who belong to the group. Users may only be members of groups in the same project. */
  var members: js.UndefOr[js.Array[String]] = js.undefined
  /** Name of the resource; provided by the client when the resource is created. */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] Server defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    members: js.Array[String] = null,
    name: String = null,
    selfLink: String = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (members != null) __obj.updateDynamic("members")(members)
    if (name != null) __obj.updateDynamic("name")(name)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Group]
  }
}

