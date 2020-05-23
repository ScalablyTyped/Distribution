package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudkms.anon.Alt
import typings.gapiClientCloudkms.anon.Bearertoken
import typings.gapiClientCloudkms.anon.Callback
import typings.gapiClientCloudkms.anon.CryptoKeyId
import typings.gapiClientCloudkms.anon.Fields
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
  def create(request: CryptoKeyId): Request[CryptoKey]
  /** Decrypts data that was protected by Encrypt. */
  def decrypt(request: Alt): Request[DecryptResponse]
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. */
  def encrypt(request: Alt): Request[EncryptResponse]
  /**
    * Returns metadata for a given CryptoKey, as well as its
    * primary CryptoKeyVersion.
    */
  def get(request: Alt): Request[CryptoKey]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Fields): Request[Policy]
  /** Lists CryptoKeys. */
  def list(request: Bearertoken): Request[ListCryptoKeysResponse]
  /** Update a CryptoKey. */
  def patch(request: Callback): Request[CryptoKey]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Fields): Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Fields): Request[TestIamPermissionsResponse]
  /** Update the version of a CryptoKey that will be used in Encrypt */
  def updatePrimaryVersion(request: Alt): Request[CryptoKey]
}

object CryptoKeysResource {
  @scala.inline
  def apply(
    create: CryptoKeyId => Request[CryptoKey],
    cryptoKeyVersions: CryptoKeyVersionsResource,
    decrypt: Alt => Request[DecryptResponse],
    encrypt: Alt => Request[EncryptResponse],
    get: Alt => Request[CryptoKey],
    getIamPolicy: Fields => Request[Policy],
    list: Bearertoken => Request[ListCryptoKeysResponse],
    patch: Callback => Request[CryptoKey],
    setIamPolicy: Fields => Request[Policy],
    testIamPermissions: Fields => Request[TestIamPermissionsResponse],
    updatePrimaryVersion: Alt => Request[CryptoKey]
  ): CryptoKeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeyVersions = cryptoKeyVersions.asInstanceOf[js.Any], decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), updatePrimaryVersion = js.Any.fromFunction1(updatePrimaryVersion))
    __obj.asInstanceOf[CryptoKeysResource]
  }
}

