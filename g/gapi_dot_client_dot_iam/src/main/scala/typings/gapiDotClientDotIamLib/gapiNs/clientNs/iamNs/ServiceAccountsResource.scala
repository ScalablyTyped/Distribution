package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountsResource extends js.Object {
  var keys: KeysResource
  /**
    * Creates a ServiceAccount
    * and returns it.
    */
  def create(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccount]
  /** Deletes a ServiceAccount. */
  def delete(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a ServiceAccount. */
  def get(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccount]
  /**
    * Returns the IAM access control policy for a
    * ServiceAccount.
    */
  def getIamPolicy(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Lists ServiceAccounts for a project. */
  def list(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyNameOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ListServiceAccountsResponse]
  /**
    * Sets the IAM access control policy for a
    * ServiceAccount.
    */
  def setIamPolicy(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Signs a blob using a service account's system-managed private key. */
  def signBlob(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[SignBlobResponse]
  /**
    * Signs a JWT using a service account's system-managed private key.
    *
    * If no expiry time (`exp`) is provided in the `SignJwtRequest`, IAM sets an
    * an expiry time of one hour by default. If you request an expiry time of
    * more than one hour, the request will fail.
    */
  def signJwt(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[SignJwtResponse]
  /**
    * Tests the specified permissions against the IAM access control policy
    * for a ServiceAccount.
    */
  def testIamPermissions(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
  /**
    * Updates a ServiceAccount.
    *
    * Currently, only the following fields are updatable:
    * `display_name` .
    * The `etag` is mandatory.
    */
  def update(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccount]
}

