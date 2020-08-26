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

@js.native
trait CryptoKeysResource extends js.Object {
  var cryptoKeyVersions: CryptoKeyVersionsResource = js.native
  /**
    * Create a new CryptoKey within a KeyRing.
    *
    * CryptoKey.purpose is required.
    */
  def create(request: CryptoKeyId): Request[CryptoKey] = js.native
  /** Decrypts data that was protected by Encrypt. */
  def decrypt(request: Alt): Request[DecryptResponse] = js.native
  /** Encrypts data, so that it can only be recovered by a call to Decrypt. */
  def encrypt(request: Alt): Request[EncryptResponse] = js.native
  /**
    * Returns metadata for a given CryptoKey, as well as its
    * primary CryptoKeyVersion.
    */
  def get(request: Alt): Request[CryptoKey] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  /** Lists CryptoKeys. */
  def list(request: Bearertoken): Request[ListCryptoKeysResponse] = js.native
  /** Update a CryptoKey. */
  def patch(request: Callback): Request[CryptoKey] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Fields): Request[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Fields): Request[TestIamPermissionsResponse] = js.native
  /** Update the version of a CryptoKey that will be used in Encrypt */
  def updatePrimaryVersion(request: Alt): Request[CryptoKey] = js.native
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
  @scala.inline
  implicit class CryptoKeysResourceOps[Self <: CryptoKeysResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: CryptoKeyId => Request[CryptoKey]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setCryptoKeyVersions(value: CryptoKeyVersionsResource): Self = this.set("cryptoKeyVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecrypt(value: Alt => Request[DecryptResponse]): Self = this.set("decrypt", js.Any.fromFunction1(value))
    @scala.inline
    def setEncrypt(value: Alt => Request[EncryptResponse]): Self = this.set("encrypt", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[CryptoKey]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Fields => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[ListCryptoKeysResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Callback => Request[CryptoKey]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Fields => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Fields => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdatePrimaryVersion(value: Alt => Request[CryptoKey]): Self = this.set("updatePrimaryVersion", js.Any.fromFunction1(value))
  }
  
}

