package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] A list of URLs to Group resources who contain the user. Users are only members of groups in the same project. */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always clouduseraccounts#user for users. */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of the resource; provided by the client when the resource is created. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Email address of account's owner. This account will be validated to make sure it exists. The email can belong to any domain, but it must be tied to a
    * Google account.
    */
  var owner: js.UndefOr[String] = js.undefined
  /** [Output Only] Public keys that this user may use to login. */
  var publicKeys: js.UndefOr[js.Array[PublicKey]] = js.undefined
  /** [Output Only] Server defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    groups: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    owner: String = null,
    publicKeys: js.Array[PublicKey] = null,
    selfLink: String = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

