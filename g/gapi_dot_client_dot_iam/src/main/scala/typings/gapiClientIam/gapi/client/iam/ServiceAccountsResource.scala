package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.gapiClientIam.anon.Bearertoken
import typings.gapiClientIam.anon.PageSize
import typings.gapiClientIam.anon.Pp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountsResource extends js.Object {
  var keys: KeysResource
  /**
    * Creates a ServiceAccount
    * and returns it.
    */
  def create(request: Bearertoken): Request[ServiceAccount]
  /** Deletes a ServiceAccount. */
  def delete(request: Bearertoken): Request[js.Object]
  /** Gets a ServiceAccount. */
  def get(request: Bearertoken): Request[ServiceAccount]
  /**
    * Returns the IAM access control policy for a
    * ServiceAccount.
    */
  def getIamPolicy(request: Pp): Request[Policy]
  /** Lists ServiceAccounts for a project. */
  def list(request: PageSize): Request[ListServiceAccountsResponse]
  /**
    * Sets the IAM access control policy for a
    * ServiceAccount.
    */
  def setIamPolicy(request: Pp): Request[Policy]
  /** Signs a blob using a service account's system-managed private key. */
  def signBlob(request: Bearertoken): Request[SignBlobResponse]
  /**
    * Signs a JWT using a service account's system-managed private key.
    *
    * If no expiry time (`exp`) is provided in the `SignJwtRequest`, IAM sets an
    * an expiry time of one hour by default. If you request an expiry time of
    * more than one hour, the request will fail.
    */
  def signJwt(request: Bearertoken): Request[SignJwtResponse]
  /**
    * Tests the specified permissions against the IAM access control policy
    * for a ServiceAccount.
    */
  def testIamPermissions(request: Pp): Request[TestIamPermissionsResponse]
  /**
    * Updates a ServiceAccount.
    *
    * Currently, only the following fields are updatable:
    * `display_name` .
    * The `etag` is mandatory.
    */
  def update(request: Bearertoken): Request[ServiceAccount]
}

object ServiceAccountsResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[ServiceAccount],
    delete: Bearertoken => Request[js.Object],
    get: Bearertoken => Request[ServiceAccount],
    getIamPolicy: Pp => Request[Policy],
    keys: KeysResource,
    list: PageSize => Request[ListServiceAccountsResponse],
    setIamPolicy: Pp => Request[Policy],
    signBlob: Bearertoken => Request[SignBlobResponse],
    signJwt: Bearertoken => Request[SignJwtResponse],
    testIamPermissions: Pp => Request[TestIamPermissionsResponse],
    update: Bearertoken => Request[ServiceAccount]
  ): ServiceAccountsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), keys = keys.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), signBlob = js.Any.fromFunction1(signBlob), signJwt = js.Any.fromFunction1(signJwt), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ServiceAccountsResource]
  }
}

