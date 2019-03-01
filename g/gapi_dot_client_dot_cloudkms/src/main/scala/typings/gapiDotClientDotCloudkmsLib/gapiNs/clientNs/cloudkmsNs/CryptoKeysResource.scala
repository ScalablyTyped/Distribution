package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKeysResource extends js.Object {
  var cryptoKeyVersions: CryptoKeyVersionsResource
  /**
    * Create a new CryptoKey within a KeyRing.
    *
    * CryptoKey.purpose is required.
    */
  def create(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackCryptoKeyId): gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey]
  /** Decrypts data that was protected by Encrypt. */
  def decrypt(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[DecryptResponse]
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. */
  def encrypt(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[EncryptResponse]
  /**
    * Returns metadata for a given CryptoKey, as well as its
    * primary CryptoKeyVersion.
    */
  def get(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Lists CryptoKeys. */
  def list(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListCryptoKeysResponse]
  /** Update a CryptoKey. */
  def patch(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey]
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
  /** Update the version of a CryptoKey that will be used in Encrypt */
  def updatePrimaryVersion(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey]
}

object CryptoKeysResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackCryptoKeyId, 
      gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey]
    ],
    cryptoKeyVersions: CryptoKeyVersionsResource,
    decrypt: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[DecryptResponse]
    ],
    encrypt: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[EncryptResponse]
    ],
    get: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey]
    ],
    getIamPolicy: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    list: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListCryptoKeysResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey]
    ],
    setIamPolicy: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    testIamPermissions: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
    ],
    updatePrimaryVersion: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey]
    ]
  ): CryptoKeysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("cryptoKeyVersions")(cryptoKeyVersions)
    __obj.updateDynamic("decrypt")(decrypt)
    __obj.updateDynamic("encrypt")(encrypt)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getIamPolicy")(getIamPolicy)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("setIamPolicy")(setIamPolicy)
    __obj.updateDynamic("testIamPermissions")(testIamPermissions)
    __obj.updateDynamic("updatePrimaryVersion")(updatePrimaryVersion)
    __obj.asInstanceOf[CryptoKeysResource]
  }
}

