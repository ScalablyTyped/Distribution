package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A list of URLs to Group resources who contain the user. Users are only members of groups in the same project. */
  var groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always clouduseraccounts#user for users. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the resource; provided by the client when the resource is created. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Email address of account's owner. This account will be validated to make sure it exists. The email can belong to any domain, but it must be tied to a
    * Google account.
    */
  var owner: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Public keys that this user may use to login. */
  var publicKeys: js.UndefOr[js.Array[PublicKey]] = js.undefined
  /** [Output Only] Server defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    groups: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    owner: java.lang.String = null,
    publicKeys: js.Array[PublicKey] = null,
    selfLink: java.lang.String = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[User]
  }
}

