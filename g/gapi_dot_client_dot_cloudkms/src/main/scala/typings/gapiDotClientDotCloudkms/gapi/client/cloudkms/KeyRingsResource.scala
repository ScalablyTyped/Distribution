package typings.gapiDotClientDotCloudkms.gapi.client.cloudkms

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAlt
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRingsResource extends js.Object {
  var cryptoKeys: CryptoKeysResource
  /** Create a new KeyRing in a given Project and Location. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[KeyRing]
  /** Returns metadata for a given KeyRing. */
  def get(request: Anon_AccesstokenAlt): Request[KeyRing]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Policy]
  /** Lists KeyRings. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListKeyRingsResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[TestIamPermissionsResponse]
}

object KeyRingsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[KeyRing],
    cryptoKeys: CryptoKeysResource,
    get: Anon_AccesstokenAlt => Request[KeyRing],
    getIamPolicy: Anon_AccesstokenAltBearertokenCallbackFields => Request[Policy],
    list: Anon_AccesstokenAltBearertoken => Request[ListKeyRingsResponse],
    setIamPolicy: Anon_AccesstokenAltBearertokenCallbackFields => Request[Policy],
    testIamPermissions: Anon_AccesstokenAltBearertokenCallbackFields => Request[TestIamPermissionsResponse]
  ): KeyRingsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeys = cryptoKeys, get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[KeyRingsResource]
  }
}

