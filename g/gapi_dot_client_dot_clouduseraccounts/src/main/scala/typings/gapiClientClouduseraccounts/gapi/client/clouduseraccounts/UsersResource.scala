package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouduseraccounts.anon.Fields
import typings.gapiClientClouduseraccounts.anon.Fingerprint
import typings.gapiClientClouduseraccounts.anon.Oauthtoken
import typings.gapiClientClouduseraccounts.anon.PrettyPrint
import typings.gapiClientClouduseraccounts.anon.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Adds a public key to the specified User resource with the data included in the request. */
  def addPublicKey(request: Project): Request[Operation] = js.native
  /** Deletes the specified User resource. */
  def delete(request: Project): Request[Operation] = js.native
  /** Returns the specified User resource. */
  def get(request: Project): Request[User] = js.native
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  /** Creates a User resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of users contained within the specified project. */
  def list(request: Fields): Request[UserList] = js.native
  /** Removes the specified public key from the user. */
  def removePublicKey(request: Fingerprint): Request[Operation] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Oauthtoken): Request[TestPermissionsResponse] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    addPublicKey: Project => Request[Operation],
    delete: Project => Request[Operation],
    get: Project => Request[User],
    getIamPolicy: Oauthtoken => Request[Policy],
    insert: PrettyPrint => Request[Operation],
    list: Fields => Request[UserList],
    removePublicKey: Fingerprint => Request[Operation],
    setIamPolicy: Oauthtoken => Request[Policy],
    testIamPermissions: Oauthtoken => Request[TestPermissionsResponse]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(addPublicKey = js.Any.fromFunction1(addPublicKey), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removePublicKey = js.Any.fromFunction1(removePublicKey), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
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
    def setAddPublicKey(value: Project => Request[Operation]): Self = this.set("addPublicKey", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Project => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Project => Request[User]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Oauthtoken => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[UserList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRemovePublicKey(value: Fingerprint => Request[Operation]): Self = this.set("removePublicKey", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Oauthtoken => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Oauthtoken => Request[TestPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
  }
  
}

