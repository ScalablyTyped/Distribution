package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[String] = js.native
  /** [Output Only] A list of URLs to Group resources who contain the user. Users are only members of groups in the same project. */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.native
  /** [Output Only] Type of the resource. Always clouduseraccounts#user for users. */
  var kind: js.UndefOr[String] = js.native
  /** Name of the resource; provided by the client when the resource is created. */
  var name: js.UndefOr[String] = js.native
  /**
    * Email address of account's owner. This account will be validated to make sure it exists. The email can belong to any domain, but it must be tied to a
    * Google account.
    */
  var owner: js.UndefOr[String] = js.native
  /** [Output Only] Public keys that this user may use to login. */
  var publicKeys: js.UndefOr[js.Array[PublicKey]] = js.native
  /** [Output Only] Server defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
}

object User {
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPublicKeysVarargs(value: PublicKey*): Self = this.set("publicKeys", js.Array(value :_*))
    @scala.inline
    def setPublicKeys(value: js.Array[PublicKey]): Self = this.set("publicKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKeys: Self = this.set("publicKeys", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

