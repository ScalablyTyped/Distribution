package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouduseraccounts.AnonAltFields
import typings.gapiClientClouduseraccounts.AnonAltFieldsFingerprint
import typings.gapiClientClouduseraccounts.AnonAltFieldsKey
import typings.gapiClientClouduseraccounts.AnonAltFieldsKeyOauthtoken
import typings.gapiClientClouduseraccounts.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Adds a public key to the specified User resource with the data included in the request. */
  def addPublicKey(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Deletes the specified User resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Returns the specified User resource. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[User]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonAltFieldsKey): Request_[Policy]
  /** Creates a User resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtoken): Request_[Operation]
  /** Retrieves a list of users contained within the specified project. */
  def list(request: AnonAltFields): Request_[UserList]
  /** Removes the specified public key from the user. */
  def removePublicKey(request: AnonAltFieldsFingerprint): Request_[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonAltFieldsKey): Request_[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonAltFieldsKey): Request_[TestPermissionsResponse]
}

object UsersResource {
  @scala.inline
  def apply(
    addPublicKey: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    delete: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[User],
    getIamPolicy: AnonAltFieldsKey => Request_[Policy],
    insert: AnonAltFieldsKeyOauthtoken => Request_[Operation],
    list: AnonAltFields => Request_[UserList],
    removePublicKey: AnonAltFieldsFingerprint => Request_[Operation],
    setIamPolicy: AnonAltFieldsKey => Request_[Policy],
    testIamPermissions: AnonAltFieldsKey => Request_[TestPermissionsResponse]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(addPublicKey = js.Any.fromFunction1(addPublicKey), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removePublicKey = js.Any.fromFunction1(removePublicKey), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[UsersResource]
  }
}

