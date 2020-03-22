package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouduseraccounts.AnonFields
import typings.gapiClientClouduseraccounts.AnonFingerprint
import typings.gapiClientClouduseraccounts.AnonOauthtoken
import typings.gapiClientClouduseraccounts.AnonPrettyPrint
import typings.gapiClientClouduseraccounts.AnonProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Adds a public key to the specified User resource with the data included in the request. */
  def addPublicKey(request: AnonProject): Request_[Operation]
  /** Deletes the specified User resource. */
  def delete(request: AnonProject): Request_[Operation]
  /** Returns the specified User resource. */
  def get(request: AnonProject): Request_[User]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /** Creates a User resource in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of users contained within the specified project. */
  def list(request: AnonFields): Request_[UserList]
  /** Removes the specified public key from the user. */
  def removePublicKey(request: AnonFingerprint): Request_[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestPermissionsResponse]
}

object UsersResource {
  @scala.inline
  def apply(
    addPublicKey: AnonProject => Request_[Operation],
    delete: AnonProject => Request_[Operation],
    get: AnonProject => Request_[User],
    getIamPolicy: AnonOauthtoken => Request_[Policy],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFields => Request_[UserList],
    removePublicKey: AnonFingerprint => Request_[Operation],
    setIamPolicy: AnonOauthtoken => Request_[Policy],
    testIamPermissions: AnonOauthtoken => Request_[TestPermissionsResponse]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(addPublicKey = js.Any.fromFunction1(addPublicKey), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removePublicKey = js.Any.fromFunction1(removePublicKey), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[UsersResource]
  }
}

