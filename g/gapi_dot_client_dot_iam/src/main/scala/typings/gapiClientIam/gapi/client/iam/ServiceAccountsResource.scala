package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientIam.AnonAccesstokenAltBearertoken
import typings.gapiClientIam.AnonAccesstokenAltBearertokenCallbackFieldsKeyNameOauthtoken
import typings.gapiClientIam.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountsResource extends js.Object {
  var keys: KeysResource
  /**
    * Creates a ServiceAccount
    * and returns it.
    */
  def create(request: AnonAccesstokenAltBearertoken): Request_[ServiceAccount]
  /** Deletes a ServiceAccount. */
  def delete(request: AnonAccesstokenAltBearertoken): Request_[js.Object]
  /** Gets a ServiceAccount. */
  def get(request: AnonAccesstokenAltBearertoken): Request_[ServiceAccount]
  /**
    * Returns the IAM access control policy for a
    * ServiceAccount.
    */
  def getIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[Policy]
  /** Lists ServiceAccounts for a project. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyNameOauthtoken): Request_[ListServiceAccountsResponse]
  /**
    * Sets the IAM access control policy for a
    * ServiceAccount.
    */
  def setIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[Policy]
  /** Signs a blob using a service account's system-managed private key. */
  def signBlob(request: AnonAccesstokenAltBearertoken): Request_[SignBlobResponse]
  /**
    * Signs a JWT using a service account's system-managed private key.
    *
    * If no expiry time (`exp`) is provided in the `SignJwtRequest`, IAM sets an
    * an expiry time of one hour by default. If you request an expiry time of
    * more than one hour, the request will fail.
    */
  def signJwt(request: AnonAccesstokenAltBearertoken): Request_[SignJwtResponse]
  /**
    * Tests the specified permissions against the IAM access control policy
    * for a ServiceAccount.
    */
  def testIamPermissions(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[TestIamPermissionsResponse]
  /**
    * Updates a ServiceAccount.
    *
    * Currently, only the following fields are updatable:
    * `display_name` .
    * The `etag` is mandatory.
    */
  def update(request: AnonAccesstokenAltBearertoken): Request_[ServiceAccount]
}

object ServiceAccountsResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertoken => Request_[ServiceAccount],
    delete: AnonAccesstokenAltBearertoken => Request_[js.Object],
    get: AnonAccesstokenAltBearertoken => Request_[ServiceAccount],
    getIamPolicy: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[Policy],
    keys: KeysResource,
    list: AnonAccesstokenAltBearertokenCallbackFieldsKeyNameOauthtoken => Request_[ListServiceAccountsResponse],
    setIamPolicy: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[Policy],
    signBlob: AnonAccesstokenAltBearertoken => Request_[SignBlobResponse],
    signJwt: AnonAccesstokenAltBearertoken => Request_[SignJwtResponse],
    testIamPermissions: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[TestIamPermissionsResponse],
    update: AnonAccesstokenAltBearertoken => Request_[ServiceAccount]
  ): ServiceAccountsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), keys = keys.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), signBlob = js.Any.fromFunction1(signBlob), signJwt = js.Any.fromFunction1(signJwt), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ServiceAccountsResource]
  }
}

