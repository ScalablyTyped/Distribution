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

trait UsersResource extends js.Object {
  /** Adds a public key to the specified User resource with the data included in the request. */
  def addPublicKey(request: Project): Request[Operation]
  /** Deletes the specified User resource. */
  def delete(request: Project): Request[Operation]
  /** Returns the specified User resource. */
  def get(request: Project): Request[User]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Oauthtoken): Request[Policy]
  /** Creates a User resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves a list of users contained within the specified project. */
  def list(request: Fields): Request[UserList]
  /** Removes the specified public key from the user. */
  def removePublicKey(request: Fingerprint): Request[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Oauthtoken): Request[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Oauthtoken): Request[TestPermissionsResponse]
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
}

