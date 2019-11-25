package typings.gapiDotClientDotCloudkms.gapi.client.cloudkms

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAlt
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAltBearertokenCallbackCryptoKeyId
import typings.gapiDotClientDotCloudkms.Anon_AccesstokenAltBearertokenCallbackFields
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
  def create(request: Anon_AccesstokenAltBearertokenCallbackCryptoKeyId): Request[CryptoKey]
  /** Decrypts data that was protected by Encrypt. */
  def decrypt(request: Anon_AccesstokenAlt): Request[DecryptResponse]
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. */
  def encrypt(request: Anon_AccesstokenAlt): Request[EncryptResponse]
  /**
    * Returns metadata for a given CryptoKey, as well as its
    * primary CryptoKeyVersion.
    */
  def get(request: Anon_AccesstokenAlt): Request[CryptoKey]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Policy]
  /** Lists CryptoKeys. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListCryptoKeysResponse]
  /** Update a CryptoKey. */
  def patch(request: Anon_AccesstokenAltBearertokenCallback): Request[CryptoKey]
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
  /** Update the version of a CryptoKey that will be used in Encrypt */
  def updatePrimaryVersion(request: Anon_AccesstokenAlt): Request[CryptoKey]
}

object CryptoKeysResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertokenCallbackCryptoKeyId => Request[CryptoKey],
    cryptoKeyVersions: CryptoKeyVersionsResource,
    decrypt: Anon_AccesstokenAlt => Request[DecryptResponse],
    encrypt: Anon_AccesstokenAlt => Request[EncryptResponse],
    get: Anon_AccesstokenAlt => Request[CryptoKey],
    getIamPolicy: Anon_AccesstokenAltBearertokenCallbackFields => Request[Policy],
    list: Anon_AccesstokenAltBearertoken => Request[ListCryptoKeysResponse],
    patch: Anon_AccesstokenAltBearertokenCallback => Request[CryptoKey],
    setIamPolicy: Anon_AccesstokenAltBearertokenCallbackFields => Request[Policy],
    testIamPermissions: Anon_AccesstokenAltBearertokenCallbackFields => Request[TestIamPermissionsResponse],
    updatePrimaryVersion: Anon_AccesstokenAlt => Request[CryptoKey]
  ): CryptoKeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeyVersions = cryptoKeyVersions.asInstanceOf[js.Any], decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), updatePrimaryVersion = js.Any.fromFunction1(updatePrimaryVersion))
  
    __obj.asInstanceOf[CryptoKeysResource]
  }
}

