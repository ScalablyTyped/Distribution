package typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotIam.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotIam.Anon_AccesstokenAltBearertokenCallbackFieldsKeyNameOauthtoken
import typings.gapiDotClientDotIam.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountsResource extends js.Object {
  var keys: KeysResource
  /**
    * Creates a ServiceAccount
    * and returns it.
    */
  def create(request: Anon_AccesstokenAltBearertoken): Request[ServiceAccount]
  /** Deletes a ServiceAccount. */
  def delete(request: Anon_AccesstokenAltBearertoken): Request[js.Object]
  /** Gets a ServiceAccount. */
  def get(request: Anon_AccesstokenAltBearertoken): Request[ServiceAccount]
  /**
    * Returns the IAM access control policy for a
    * ServiceAccount.
    */
  def getIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[Policy]
  /** Lists ServiceAccounts for a project. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyNameOauthtoken): Request[ListServiceAccountsResponse]
  /**
    * Sets the IAM access control policy for a
    * ServiceAccount.
    */
  def setIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[Policy]
  /** Signs a blob using a service account's system-managed private key. */
  def signBlob(request: Anon_AccesstokenAltBearertoken): Request[SignBlobResponse]
  /**
    * Signs a JWT using a service account's system-managed private key.
    *
    * If no expiry time (`exp`) is provided in the `SignJwtRequest`, IAM sets an
    * an expiry time of one hour by default. If you request an expiry time of
    * more than one hour, the request will fail.
    */
  def signJwt(request: Anon_AccesstokenAltBearertoken): Request[SignJwtResponse]
  /**
    * Tests the specified permissions against the IAM access control policy
    * for a ServiceAccount.
    */
  def testIamPermissions(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[TestIamPermissionsResponse]
  /**
    * Updates a ServiceAccount.
    *
    * Currently, only the following fields are updatable:
    * `display_name` .
    * The `etag` is mandatory.
    */
  def update(request: Anon_AccesstokenAltBearertoken): Request[ServiceAccount]
}

object ServiceAccountsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertoken => Request[ServiceAccount],
    delete: Anon_AccesstokenAltBearertoken => Request[js.Object],
    get: Anon_AccesstokenAltBearertoken => Request[ServiceAccount],
    getIamPolicy: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[Policy],
    keys: KeysResource,
    list: Anon_AccesstokenAltBearertokenCallbackFieldsKeyNameOauthtoken => Request[ListServiceAccountsResponse],
    setIamPolicy: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[Policy],
    signBlob: Anon_AccesstokenAltBearertoken => Request[SignBlobResponse],
    signJwt: Anon_AccesstokenAltBearertoken => Request[SignJwtResponse],
    testIamPermissions: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[TestIamPermissionsResponse],
    update: Anon_AccesstokenAltBearertoken => Request[ServiceAccount]
  ): ServiceAccountsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), keys = keys, list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), signBlob = js.Any.fromFunction1(signBlob), signJwt = js.Any.fromFunction1(signJwt), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ServiceAccountsResource]
  }
}

