package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudkms.AnonAccesstokenAlt
import typings.gapiClientCloudkms.AnonAccesstokenAltBearertoken
import typings.gapiClientCloudkms.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientCloudkms.AnonAccesstokenAltBearertokenCallbackCryptoKeyId
import typings.gapiClientCloudkms.AnonAccesstokenAltBearertokenCallbackFields
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
  def create(request: AnonAccesstokenAltBearertokenCallbackCryptoKeyId): Request_[CryptoKey]
  /** Decrypts data that was protected by Encrypt. */
  def decrypt(request: AnonAccesstokenAlt): Request_[DecryptResponse]
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. */
  def encrypt(request: AnonAccesstokenAlt): Request_[EncryptResponse]
  /**
    * Returns metadata for a given CryptoKey, as well as its
    * primary CryptoKeyVersion.
    */
  def get(request: AnonAccesstokenAlt): Request_[CryptoKey]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Policy]
  /** Lists CryptoKeys. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListCryptoKeysResponse]
  /** Update a CryptoKey. */
  def patch(request: AnonAccesstokenAltBearertokenCallback): Request_[CryptoKey]
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
  /** Update the version of a CryptoKey that will be used in Encrypt */
  def updatePrimaryVersion(request: AnonAccesstokenAlt): Request_[CryptoKey]
}

object CryptoKeysResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertokenCallbackCryptoKeyId => Request_[CryptoKey],
    cryptoKeyVersions: CryptoKeyVersionsResource,
    decrypt: AnonAccesstokenAlt => Request_[DecryptResponse],
    encrypt: AnonAccesstokenAlt => Request_[EncryptResponse],
    get: AnonAccesstokenAlt => Request_[CryptoKey],
    getIamPolicy: AnonAccesstokenAltBearertokenCallbackFields => Request_[Policy],
    list: AnonAccesstokenAltBearertoken => Request_[ListCryptoKeysResponse],
    patch: AnonAccesstokenAltBearertokenCallback => Request_[CryptoKey],
    setIamPolicy: AnonAccesstokenAltBearertokenCallbackFields => Request_[Policy],
    testIamPermissions: AnonAccesstokenAltBearertokenCallbackFields => Request_[TestIamPermissionsResponse],
    updatePrimaryVersion: AnonAccesstokenAlt => Request_[CryptoKey]
  ): CryptoKeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), cryptoKeyVersions = cryptoKeyVersions.asInstanceOf[js.Any], decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), updatePrimaryVersion = js.Any.fromFunction1(updatePrimaryVersion))
  
    __obj.asInstanceOf[CryptoKeysResource]
  }
}

