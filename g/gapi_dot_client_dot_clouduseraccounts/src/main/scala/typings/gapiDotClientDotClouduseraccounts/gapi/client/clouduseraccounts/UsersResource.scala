package typings.gapiDotClientDotClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFields
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFieldsFingerprint
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFieldsKey
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Adds a public key to the specified User resource with the data included in the request. */
  def addPublicKey(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Deletes the specified User resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Returns the specified User resource. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[User]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Anon_AltFieldsKey): Request[Policy]
  /** Creates a User resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[Operation]
  /** Retrieves a list of users contained within the specified project. */
  def list(request: Anon_AltFields): Request[UserList]
  /** Removes the specified public key from the user. */
  def removePublicKey(request: Anon_AltFieldsFingerprint): Request[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Anon_AltFieldsKey): Request[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Anon_AltFieldsKey): Request[TestPermissionsResponse]
}

object UsersResource {
  @scala.inline
  def apply(
    addPublicKey: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[User],
    getIamPolicy: Anon_AltFieldsKey => Request[Policy],
    insert: Anon_AltFieldsKeyOauthtoken => Request[Operation],
    list: Anon_AltFields => Request[UserList],
    removePublicKey: Anon_AltFieldsFingerprint => Request[Operation],
    setIamPolicy: Anon_AltFieldsKey => Request[Policy],
    testIamPermissions: Anon_AltFieldsKey => Request[TestPermissionsResponse]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(addPublicKey = js.Any.fromFunction1(addPublicKey), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removePublicKey = js.Any.fromFunction1(removePublicKey), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[UsersResource]
  }
}

