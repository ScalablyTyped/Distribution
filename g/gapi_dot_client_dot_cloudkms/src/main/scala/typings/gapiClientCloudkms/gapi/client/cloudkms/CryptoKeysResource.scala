package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudkms.AnonAlt
import typings.gapiClientCloudkms.AnonBearertoken
import typings.gapiClientCloudkms.AnonCallback
import typings.gapiClientCloudkms.AnonCryptoKeyId
import typings.gapiClientCloudkms.AnonFields
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
  def create(request: AnonCryptoKeyId): Request_[CryptoKey]
  /** Decrypts data that was protected by Encrypt. */
  def decrypt(request: AnonAlt): Request_[DecryptResponse]
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. */
  def encrypt(request: AnonAlt): Request_[EncryptResponse]
  /**
    * Returns metadata for a given CryptoKey, as well as its
    * primary CryptoKeyVersion.
    */
  def get(request: AnonAlt): Request_[CryptoKey]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonFields): Request_[Policy]
  /** Lists CryptoKeys. */
  def list(request: AnonBearertoken): Request_[ListCryptoKeysResponse]
  /** Update a CryptoKey. */
  def patch(request: AnonCallback): Request_[CryptoKey]
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
  /** Update the version of a CryptoKey that will be used in Encrypt */
  def updatePrimaryVersion(request: AnonAlt): Request_[CryptoKey]
}

object CryptoKeysResource {
  @scala.inline
  def apply(
    create: AnonCryptoKeyId => Request_[CryptoKey],
    cryptoKeyVersions: CryptoKeyVersionsResource,
    decrypt: AnonAlt => Request_[DecryptResponse],
    encrypt: AnonAlt => Request_[EncryptResponse],
    get: AnonAlt => Request_[CryptoKey],
    getIamPolicy: AnonFields => Request_[Policy],
    list: AnonBearertoken => Request_[ListCryptoKeysResponse],
    patch: AnonCallback => Request_[CryptoKey],
    setIamPolicy: AnonFields => Request_[Policy],
    testIamPermissions: AnonFields => Request_[TestIamPermissionsResponse],
    updatePrimaryVersion: AnonAlt => Request_[CryptoKey]
  ): CryptoKeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeyVersions = cryptoKeyVersions.asInstanceOf[js.Any], decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), updatePrimaryVersion = js.Any.fromFunction1(updatePrimaryVersion))
  
    __obj.asInstanceOf[CryptoKeysResource]
  }
}

