package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudkms.AnonAccesstokenAlt
import typings.gapiClientCloudkms.AnonAccesstokenAltBearertoken
import typings.gapiClientCloudkms.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientCloudkms.AnonAccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRingsResource extends js.Object {
  var cryptoKeys: CryptoKeysResource
  /** Create a new KeyRing in a given Project and Location. */
  def create(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[KeyRing]
  /** Returns metadata for a given KeyRing. */
  def get(request: AnonAccesstokenAlt): Request_[KeyRing]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Policy]
  /** Lists KeyRings. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListKeyRingsResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[TestIamPermissionsResponse]
}

object KeyRingsResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[KeyRing],
    cryptoKeys: CryptoKeysResource,
    get: AnonAccesstokenAlt => Request_[KeyRing],
    getIamPolicy: AnonAccesstokenAltBearertokenCallbackFields => Request_[Policy],
    list: AnonAccesstokenAltBearertoken => Request_[ListKeyRingsResponse],
    setIamPolicy: AnonAccesstokenAltBearertokenCallbackFields => Request_[Policy],
    testIamPermissions: AnonAccesstokenAltBearertokenCallbackFields => Request_[TestIamPermissionsResponse]
  ): KeyRingsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeys = cryptoKeys.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[KeyRingsResource]
  }
}

