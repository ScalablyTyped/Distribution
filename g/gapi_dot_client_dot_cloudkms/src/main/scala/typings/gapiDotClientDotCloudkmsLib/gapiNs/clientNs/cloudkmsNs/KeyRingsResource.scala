package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyRingsResource extends js.Object {
  var cryptoKeys: CryptoKeysResource
  /** Create a new KeyRing in a given Project and Location. */
  def create(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[KeyRing]
  /** Returns metadata for a given KeyRing. */
  def get(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[KeyRing]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Lists KeyRings. */
  def list(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListKeyRingsResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
}

object KeyRingsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[KeyRing]
    ],
    cryptoKeys: CryptoKeysResource,
    get: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[KeyRing]
    ],
    getIamPolicy: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    list: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListKeyRingsResponse]
    ],
    setIamPolicy: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    testIamPermissions: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
    ]
  ): KeyRingsResource = {
    val __obj = js.Dynamic.literal(create = create, cryptoKeys = cryptoKeys, get = get, getIamPolicy = getIamPolicy, list = list, setIamPolicy = setIamPolicy, testIamPermissions = testIamPermissions)
  
    __obj.asInstanceOf[KeyRingsResource]
  }
}

