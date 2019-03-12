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
    create: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackCryptoKeyId => gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey],
    cryptoKeyVersions: CryptoKeyVersionsResource,
    decrypt: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[DecryptResponse],
    encrypt: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[EncryptResponse],
    get: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey],
    getIamPolicy: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[Policy],
    list: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[ListCryptoKeysResponse],
    patch: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey],
    setIamPolicy: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[Policy],
    testIamPermissions: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse],
    updatePrimaryVersion: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[CryptoKey]
  ): CryptoKeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeyVersions = cryptoKeyVersions, decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), updatePrimaryVersion = js.Any.fromFunction1(updatePrimaryVersion))
  
    __obj.asInstanceOf[CryptoKeysResource]
  }
}

