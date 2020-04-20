package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientIam.AnonBearertoken
import typings.gapiClientIam.AnonPageSize
import typings.gapiClientIam.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountsResource extends js.Object {
  var keys: KeysResource
  /**
    * Creates a ServiceAccount
    * and returns it.
    */
  def create(request: AnonBearertoken): Request_[ServiceAccount]
  /** Deletes a ServiceAccount. */
  def delete(request: AnonBearertoken): Request_[js.Object]
  /** Gets a ServiceAccount. */
  def get(request: AnonBearertoken): Request_[ServiceAccount]
  /**
    * Returns the IAM access control policy for a
    * ServiceAccount.
    */
  def getIamPolicy(request: AnonPp): Request_[Policy]
  /** Lists ServiceAccounts for a project. */
  def list(request: AnonPageSize): Request_[ListServiceAccountsResponse]
  /**
    * Sets the IAM access control policy for a
    * ServiceAccount.
    */
  def setIamPolicy(request: AnonPp): Request_[Policy]
  /** Signs a blob using a service account's system-managed private key. */
  def signBlob(request: AnonBearertoken): Request_[SignBlobResponse]
  /**
    * Signs a JWT using a service account's system-managed private key.
    *
    * If no expiry time (`exp`) is provided in the `SignJwtRequest`, IAM sets an
    * an expiry time of one hour by default. If you request an expiry time of
    * more than one hour, the request will fail.
    */
  def signJwt(request: AnonBearertoken): Request_[SignJwtResponse]
  /**
    * Tests the specified permissions against the IAM access control policy
    * for a ServiceAccount.
    */
  def testIamPermissions(request: AnonPp): Request_[TestIamPermissionsResponse]
  /**
    * Updates a ServiceAccount.
    *
    * Currently, only the following fields are updatable:
    * `display_name` .
    * The `etag` is mandatory.
    */
  def update(request: AnonBearertoken): Request_[ServiceAccount]
}

object ServiceAccountsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[ServiceAccount],
    delete: AnonBearertoken => Request_[js.Object],
    get: AnonBearertoken => Request_[ServiceAccount],
    getIamPolicy: AnonPp => Request_[Policy],
    keys: KeysResource,
    list: AnonPageSize => Request_[ListServiceAccountsResponse],
    setIamPolicy: AnonPp => Request_[Policy],
    signBlob: AnonBearertoken => Request_[SignBlobResponse],
    signJwt: AnonBearertoken => Request_[SignJwtResponse],
    testIamPermissions: AnonPp => Request_[TestIamPermissionsResponse],
    update: AnonBearertoken => Request_[ServiceAccount]
  ): ServiceAccountsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), keys = keys.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), signBlob = js.Any.fromFunction1(signBlob), signJwt = js.Any.fromFunction1(signJwt), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ServiceAccountsResource]
  }
}

