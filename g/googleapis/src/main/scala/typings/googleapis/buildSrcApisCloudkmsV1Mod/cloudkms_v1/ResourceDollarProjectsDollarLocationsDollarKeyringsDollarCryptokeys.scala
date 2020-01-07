package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Resource$Projects$Locations$Keyrings$Cryptokeys")
@js.native
class ResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var cryptoKeyVersions: ResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversions = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.create
    * @desc Create a new CryptoKey within a KeyRing.  CryptoKey.purpose and
    * CryptoKey.version_template.algorithm are required.
    * @alias cloudkms.projects.locations.keyRings.cryptoKeys.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.cryptoKeyId Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}`
    * @param {string} params.parent Required. The name of the KeyRing associated with the CryptoKeys.
    * @param {().CryptoKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$CryptoKey] = js.native
  def create(callback: BodyResponseCallback[Schema$CryptoKey]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCreate
  ): GaxiosPromise[Schema$CryptoKey] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCreate,
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCreate,
    options: BodyResponseCallback[Schema$CryptoKey],
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$CryptoKey] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.decrypt
    * @desc Decrypts data that was protected by Encrypt. The CryptoKey.purpose
    * must be ENCRYPT_DECRYPT.
    * @alias cloudkms.projects.locations.keyRings.cryptoKeys.decrypt
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the CryptoKey to use for decryption. The server will choose the appropriate version.
    * @param {().DecryptRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def decrypt(): GaxiosPromise[Schema$DecryptResponse] = js.native
  def decrypt(callback: BodyResponseCallback[Schema$DecryptResponse]): Unit = js.native
  def decrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarDecrypt
  ): GaxiosPromise[Schema$DecryptResponse] = js.native
  def decrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarDecrypt,
    callback: BodyResponseCallback[Schema$DecryptResponse]
  ): Unit = js.native
  def decrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarDecrypt,
    options: BodyResponseCallback[Schema$DecryptResponse],
    callback: BodyResponseCallback[Schema$DecryptResponse]
  ): Unit = js.native
  def decrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarDecrypt,
    options: MethodOptions
  ): GaxiosPromise[Schema$DecryptResponse] = js.native
  def decrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarDecrypt,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DecryptResponse]
  ): Unit = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.encrypt
    * @desc Encrypts data, so that it can only be recovered by a call to
    * Decrypt. The CryptoKey.purpose must be ENCRYPT_DECRYPT.
    * @alias cloudkms.projects.locations.keyRings.cryptoKeys.encrypt
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the CryptoKey or CryptoKeyVersion to use for encryption.  If a CryptoKey is specified, the server will use its primary version.
    * @param {().EncryptRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def encrypt(): GaxiosPromise[Schema$EncryptResponse] = js.native
  def encrypt(callback: BodyResponseCallback[Schema$EncryptResponse]): Unit = js.native
  def encrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarEncrypt
  ): GaxiosPromise[Schema$EncryptResponse] = js.native
  def encrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarEncrypt,
    callback: BodyResponseCallback[Schema$EncryptResponse]
  ): Unit = js.native
  def encrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarEncrypt,
    options: BodyResponseCallback[Schema$EncryptResponse],
    callback: BodyResponseCallback[Schema$EncryptResponse]
  ): Unit = js.native
  def encrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarEncrypt,
    options: MethodOptions
  ): GaxiosPromise[Schema$EncryptResponse] = js.native
  def encrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarEncrypt,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EncryptResponse]
  ): Unit = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.get
    * @desc Returns metadata for a given CryptoKey, as well as its primary
    * CryptoKeyVersion.
    * @alias cloudkms.projects.locations.keyRings.cryptoKeys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the CryptoKey to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CryptoKey] = js.native
  def get(callback: BodyResponseCallback[Schema$CryptoKey]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGet): GaxiosPromise[Schema$CryptoKey] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGet,
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGet,
    options: BodyResponseCallback[Schema$CryptoKey],
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$CryptoKey] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias cloudkms.projects.locations.keyRings.cryptoKeys.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.list
    * @desc Lists CryptoKeys.
    * @alias cloudkms.projects.locations.keyRings.cryptoKeys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional limit on the number of CryptoKeys to include in the response.  Further CryptoKeys can subsequently be obtained by including the ListCryptoKeysResponse.next_page_token in a subsequent request.  If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken Optional pagination token, returned earlier via ListCryptoKeysResponse.next_page_token.
    * @param {string} params.parent Required. The resource name of the KeyRing to list, in the format `projects/x/locations/x/keyRings/x`.
    * @param {string=} params.versionView The fields of the primary version to include in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListCryptoKeysResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListCryptoKeysResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarList): GaxiosPromise[Schema$ListCryptoKeysResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarList,
    callback: BodyResponseCallback[Schema$ListCryptoKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarList,
    options: BodyResponseCallback[Schema$ListCryptoKeysResponse],
    callback: BodyResponseCallback[Schema$ListCryptoKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListCryptoKeysResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListCryptoKeysResponse]
  ): Unit = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.patch
    * @desc Update a CryptoKey.
    * @alias cloudkms.projects.locations.keyRings.cryptoKeys.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The resource name for this CryptoKey in the format `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    * @param {string=} params.updateMask Required list of fields to be updated in this request.
    * @param {().CryptoKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CryptoKey] = js.native
  def patch(callback: BodyResponseCallback[Schema$CryptoKey]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarPatch): GaxiosPromise[Schema$CryptoKey] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarPatch,
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarPatch,
    options: BodyResponseCallback[Schema$CryptoKey],
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$CryptoKey] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias cloudkms.projects.locations.keyRings.cryptoKeys.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarSetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias cloudkms.projects.locations.keyRings.cryptoKeys.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarTestiampermissions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.updatePrimaryVersion
    * @desc Update the version of a CryptoKey that will be used in Encrypt.
    * Returns an error if called on an asymmetric key.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.updatePrimaryVersion
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the CryptoKey to update.
    * @param {().UpdateCryptoKeyPrimaryVersionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatePrimaryVersion(): GaxiosPromise[Schema$CryptoKey] = js.native
  def updatePrimaryVersion(callback: BodyResponseCallback[Schema$CryptoKey]): Unit = js.native
  def updatePrimaryVersion(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarUpdateprimaryversion
  ): GaxiosPromise[Schema$CryptoKey] = js.native
  def updatePrimaryVersion(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarUpdateprimaryversion,
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  def updatePrimaryVersion(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarUpdateprimaryversion,
    options: BodyResponseCallback[Schema$CryptoKey],
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
  def updatePrimaryVersion(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarUpdateprimaryversion,
    options: MethodOptions
  ): GaxiosPromise[Schema$CryptoKey] = js.native
  def updatePrimaryVersion(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarUpdateprimaryversion,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CryptoKey]
  ): Unit = js.native
}

