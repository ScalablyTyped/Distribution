package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudkms.AnonAlt
import typings.gapiClientCloudkms.AnonBearertoken
import typings.gapiClientCloudkms.AnonFields
import typings.gapiClientCloudkms.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRingsResource extends js.Object {
  var cryptoKeys: CryptoKeysResource
  /** Create a new KeyRing in a given Project and Location. */
  def create(request: AnonKey): Request_[KeyRing]
  /** Returns metadata for a given KeyRing. */
  def get(request: AnonAlt): Request_[KeyRing]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonFields): Request_[Policy]
  /** Lists KeyRings. */
  def list(request: AnonBearertoken): Request_[ListKeyRingsResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonFields): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonFields): Request_[TestIamPermissionsResponse]
}

object KeyRingsResource {
  @scala.inline
  def apply(
    create: AnonKey => Request_[KeyRing],
    cryptoKeys: CryptoKeysResource,
    get: AnonAlt => Request_[KeyRing],
    getIamPolicy: AnonFields => Request_[Policy],
    list: AnonBearertoken => Request_[ListKeyRingsResponse],
    setIamPolicy: AnonFields => Request_[Policy],
    testIamPermissions: AnonFields => Request_[TestIamPermissionsResponse]
  ): KeyRingsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeys = cryptoKeys.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[KeyRingsResource]
  }
}

