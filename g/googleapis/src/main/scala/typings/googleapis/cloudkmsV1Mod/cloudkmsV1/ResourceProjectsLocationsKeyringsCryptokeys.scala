package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Resource$Projects$Locations$Keyrings$Cryptokeys")
@js.native
class ResourceProjectsLocationsKeyringsCryptokeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def create(): GaxiosPromise[SchemaCryptoKey] = js.native
  def create(callback: BodyResponseCallback[SchemaCryptoKey]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def create(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate): GaxiosPromise[SchemaCryptoKey] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate,
    options: BodyResponseCallback[SchemaCryptoKey],
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  
  var cryptoKeyVersions: ResourceProjectsLocationsKeyringsCryptokeysCryptokeyversions = js.native
  
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
  def decrypt(): GaxiosPromise[SchemaDecryptResponse] = js.native
  def decrypt(callback: BodyResponseCallback[SchemaDecryptResponse]): Unit = js.native
  def decrypt(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDecryptResponse] = js.native
  def decrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt): GaxiosPromise[SchemaDecryptResponse] = js.native
  def decrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt,
    callback: BodyResponseCallback[SchemaDecryptResponse]
  ): Unit = js.native
  def decrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt,
    options: BodyResponseCallback[SchemaDecryptResponse],
    callback: BodyResponseCallback[SchemaDecryptResponse]
  ): Unit = js.native
  def decrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt, options: MethodOptions): GaxiosPromise[SchemaDecryptResponse] = js.native
  def decrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDecryptResponse]
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
  def encrypt(): GaxiosPromise[SchemaEncryptResponse] = js.native
  def encrypt(callback: BodyResponseCallback[SchemaEncryptResponse]): Unit = js.native
  def encrypt(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEncryptResponse] = js.native
  def encrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt): GaxiosPromise[SchemaEncryptResponse] = js.native
  def encrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt,
    callback: BodyResponseCallback[SchemaEncryptResponse]
  ): Unit = js.native
  def encrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt,
    options: BodyResponseCallback[SchemaEncryptResponse],
    callback: BodyResponseCallback[SchemaEncryptResponse]
  ): Unit = js.native
  def encrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt, options: MethodOptions): GaxiosPromise[SchemaEncryptResponse] = js.native
  def encrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEncryptResponse]
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
  def get(): GaxiosPromise[SchemaCryptoKey] = js.native
  def get(callback: BodyResponseCallback[SchemaCryptoKey]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def get(params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet): GaxiosPromise[SchemaCryptoKey] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet,
    options: BodyResponseCallback[SchemaCryptoKey],
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKey]
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
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def list(): GaxiosPromise[SchemaListCryptoKeysResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCryptoKeysResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCryptoKeysResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsKeyringsCryptokeysList): GaxiosPromise[SchemaListCryptoKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysList,
    callback: BodyResponseCallback[SchemaListCryptoKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysList,
    options: BodyResponseCallback[SchemaListCryptoKeysResponse],
    callback: BodyResponseCallback[SchemaListCryptoKeysResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsKeyringsCryptokeysList, options: MethodOptions): GaxiosPromise[SchemaListCryptoKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCryptoKeysResponse]
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
  def patch(): GaxiosPromise[SchemaCryptoKey] = js.native
  def patch(callback: BodyResponseCallback[SchemaCryptoKey]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def patch(params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch): GaxiosPromise[SchemaCryptoKey] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch,
    options: BodyResponseCallback[SchemaCryptoKey],
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKey]
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
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
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
  def updatePrimaryVersion(): GaxiosPromise[SchemaCryptoKey] = js.native
  def updatePrimaryVersion(callback: BodyResponseCallback[SchemaCryptoKey]): Unit = js.native
  def updatePrimaryVersion(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def updatePrimaryVersion(params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion): GaxiosPromise[SchemaCryptoKey] = js.native
  def updatePrimaryVersion(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def updatePrimaryVersion(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion,
    options: BodyResponseCallback[SchemaCryptoKey],
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def updatePrimaryVersion(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion,
    options: MethodOptions
  ): GaxiosPromise[SchemaCryptoKey] = js.native
  def updatePrimaryVersion(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
}
