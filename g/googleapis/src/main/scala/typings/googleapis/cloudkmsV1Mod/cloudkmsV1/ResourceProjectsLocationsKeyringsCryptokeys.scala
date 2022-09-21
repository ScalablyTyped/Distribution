package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Resource$Projects$Locations$Keyrings$Cryptokeys")
@js.native
open class ResourceProjectsLocationsKeyringsCryptokeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCryptoKey] = js.native
  def create(callback: BodyResponseCallback[SchemaCryptoKey]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def create(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate): GaxiosPromise[SchemaCryptoKey] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate,
    options: BodyResponseCallback[Readable | SchemaCryptoKey],
    callback: BodyResponseCallback[Readable | SchemaCryptoKey]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  /**
    * Create a new CryptoKey within a KeyRing. CryptoKey.purpose and CryptoKey.version_template.algorithm are required.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.keyRings.cryptoKeys.create({
    *     // Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63\}`
    *     cryptoKeyId: 'placeholder-value',
    *     // Required. The name of the KeyRing associated with the CryptoKeys.
    *     parent: 'projects/my-project/locations/my-location/keyRings/my-keyRing',
    *     // If set to true, the request will create a CryptoKey without any CryptoKeyVersions. You must manually call CreateCryptoKeyVersion or ImportCryptoKeyVersion before you can use this CryptoKey.
    *     skipInitialVersionCreation: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "cryptoKeyBackend": "my_cryptoKeyBackend",
    *       //   "destroyScheduledDuration": "my_destroyScheduledDuration",
    *       //   "importOnly": false,
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "nextRotationTime": "my_nextRotationTime",
    *       //   "primary": {},
    *       //   "purpose": "my_purpose",
    *       //   "rotationPeriod": "my_rotationPeriod",
    *       //   "versionTemplate": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "cryptoKeyBackend": "my_cryptoKeyBackend",
    *   //   "destroyScheduledDuration": "my_destroyScheduledDuration",
    *   //   "importOnly": false,
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "nextRotationTime": "my_nextRotationTime",
    *   //   "primary": {},
    *   //   "purpose": "my_purpose",
    *   //   "rotationPeriod": "my_rotationPeriod",
    *   //   "versionTemplate": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var cryptoKeyVersions: ResourceProjectsLocationsKeyringsCryptokeysCryptokeyversions = js.native
  
  def decrypt(): GaxiosPromise[SchemaDecryptResponse] = js.native
  def decrypt(callback: BodyResponseCallback[SchemaDecryptResponse]): Unit = js.native
  def decrypt(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDecryptResponse] = js.native
  def decrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt): GaxiosPromise[SchemaDecryptResponse] = js.native
  def decrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt,
    callback: BodyResponseCallback[SchemaDecryptResponse]
  ): Unit = js.native
  def decrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt,
    options: BodyResponseCallback[Readable | SchemaDecryptResponse],
    callback: BodyResponseCallback[Readable | SchemaDecryptResponse]
  ): Unit = js.native
  def decrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt, options: MethodOptions): GaxiosPromise[SchemaDecryptResponse] = js.native
  def decrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDecryptResponse]
  ): Unit = js.native
  /**
    * Decrypts data that was protected by Encrypt. The CryptoKey.purpose must be ENCRYPT_DECRYPT.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.keyRings.cryptoKeys.decrypt({
    *     // Required. The resource name of the CryptoKey to use for decryption. The server will choose the appropriate version.
    *     name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalAuthenticatedData": "my_additionalAuthenticatedData",
    *       //   "additionalAuthenticatedDataCrc32c": "my_additionalAuthenticatedDataCrc32c",
    *       //   "ciphertext": "my_ciphertext",
    *       //   "ciphertextCrc32c": "my_ciphertextCrc32c"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "plaintext": "my_plaintext",
    *   //   "plaintextCrc32c": "my_plaintextCrc32c",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "usedPrimary": false
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def decrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def decrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysDecrypt,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def encrypt(): GaxiosPromise[SchemaEncryptResponse] = js.native
  def encrypt(callback: BodyResponseCallback[SchemaEncryptResponse]): Unit = js.native
  def encrypt(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEncryptResponse] = js.native
  def encrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt): GaxiosPromise[SchemaEncryptResponse] = js.native
  def encrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt,
    callback: BodyResponseCallback[SchemaEncryptResponse]
  ): Unit = js.native
  def encrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt,
    options: BodyResponseCallback[Readable | SchemaEncryptResponse],
    callback: BodyResponseCallback[Readable | SchemaEncryptResponse]
  ): Unit = js.native
  def encrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt, options: MethodOptions): GaxiosPromise[SchemaEncryptResponse] = js.native
  def encrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEncryptResponse]
  ): Unit = js.native
  /**
    * Encrypts data, so that it can only be recovered by a call to Decrypt. The CryptoKey.purpose must be ENCRYPT_DECRYPT.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.keyRings.cryptoKeys.encrypt({
    *     // Required. The resource name of the CryptoKey or CryptoKeyVersion to use for encryption. If a CryptoKey is specified, the server will use its primary version.
    *     name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalAuthenticatedData": "my_additionalAuthenticatedData",
    *       //   "additionalAuthenticatedDataCrc32c": "my_additionalAuthenticatedDataCrc32c",
    *       //   "plaintext": "my_plaintext",
    *       //   "plaintextCrc32c": "my_plaintextCrc32c"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ciphertext": "my_ciphertext",
    *   //   "ciphertextCrc32c": "my_ciphertextCrc32c",
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "verifiedAdditionalAuthenticatedDataCrc32c": false,
    *   //   "verifiedPlaintextCrc32c": false
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def encrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def encrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysEncrypt,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCryptoKey] = js.native
  def get(callback: BodyResponseCallback[SchemaCryptoKey]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def get(params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet): GaxiosPromise[SchemaCryptoKey] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet,
    options: BodyResponseCallback[Readable | SchemaCryptoKey],
    callback: BodyResponseCallback[Readable | SchemaCryptoKey]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  /**
    * Returns metadata for a given CryptoKey, as well as its primary CryptoKeyVersion.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.keyRings.cryptoKeys.get({
    *     // Required. The name of the CryptoKey to get.
    *     name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "cryptoKeyBackend": "my_cryptoKeyBackend",
    *   //   "destroyScheduledDuration": "my_destroyScheduledDuration",
    *   //   "importOnly": false,
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "nextRotationTime": "my_nextRotationTime",
    *   //   "primary": {},
    *   //   "purpose": "my_purpose",
    *   //   "rotationPeriod": "my_rotationPeriod",
    *   //   "versionTemplate": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.getIamPolicy({
    *       // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *       'options.requestedPolicyVersion': 'placeholder-value',
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCryptoKeysResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCryptoKeysResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCryptoKeysResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsKeyringsCryptokeysList): GaxiosPromise[SchemaListCryptoKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysList,
    callback: BodyResponseCallback[SchemaListCryptoKeysResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysList,
    options: BodyResponseCallback[Readable | SchemaListCryptoKeysResponse],
    callback: BodyResponseCallback[Readable | SchemaListCryptoKeysResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsKeyringsCryptokeysList, options: MethodOptions): GaxiosPromise[SchemaListCryptoKeysResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCryptoKeysResponse]
  ): Unit = js.native
  /**
    * Lists CryptoKeys.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.keyRings.cryptoKeys.list({
    *     // Optional. Only include resources that match the filter in the response. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
    *     filter: 'placeholder-value',
    *     // Optional. Specify how the results should be sorted. If not specified, the results will be sorted in the default order. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
    *     orderBy: 'placeholder-value',
    *     // Optional. Optional limit on the number of CryptoKeys to include in the response. Further CryptoKeys can subsequently be obtained by including the ListCryptoKeysResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // Optional. Optional pagination token, returned earlier via ListCryptoKeysResponse.next_page_token.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the KeyRing to list, in the format `projects/x/locations/x/keyRings/x`.
    *     parent: 'projects/my-project/locations/my-location/keyRings/my-keyRing',
    *     // The fields of the primary version to include in the response.
    *     versionView: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cryptoKeys": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceProjectsLocationsKeyringsCryptokeysList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCryptoKey] = js.native
  def patch(callback: BodyResponseCallback[SchemaCryptoKey]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def patch(params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch): GaxiosPromise[SchemaCryptoKey] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch,
    options: BodyResponseCallback[Readable | SchemaCryptoKey],
    callback: BodyResponseCallback[Readable | SchemaCryptoKey]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  /**
    * Update a CryptoKey.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudkms.projects.locations.keyRings.cryptoKeys.patch({
    *     // Output only. The resource name for this CryptoKey in the format `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    *     name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *     // Required. List of fields to be updated in this request.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "cryptoKeyBackend": "my_cryptoKeyBackend",
    *       //   "destroyScheduledDuration": "my_destroyScheduledDuration",
    *       //   "importOnly": false,
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "nextRotationTime": "my_nextRotationTime",
    *       //   "primary": {},
    *       //   "purpose": "my_purpose",
    *       //   "rotationPeriod": "my_rotationPeriod",
    *       //   "versionTemplate": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "cryptoKeyBackend": "my_cryptoKeyBackend",
    *   //   "destroyScheduledDuration": "my_destroyScheduledDuration",
    *   //   "importOnly": false,
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "nextRotationTime": "my_nextRotationTime",
    *   //   "primary": {},
    *   //   "purpose": "my_purpose",
    *   //   "rotationPeriod": "my_rotationPeriod",
    *   //   "versionTemplate": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {},
    *         //   "updateMask": "my_updateMask"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
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
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.testIamPermissions({
    *       // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "permissions": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updatePrimaryVersion(): GaxiosPromise[SchemaCryptoKey] = js.native
  def updatePrimaryVersion(callback: BodyResponseCallback[SchemaCryptoKey]): Unit = js.native
  def updatePrimaryVersion(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKey] = js.native
  def updatePrimaryVersion(params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion): GaxiosPromise[SchemaCryptoKey] = js.native
  def updatePrimaryVersion(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion,
    callback: BodyResponseCallback[SchemaCryptoKey]
  ): Unit = js.native
  def updatePrimaryVersion(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion,
    options: BodyResponseCallback[Readable | SchemaCryptoKey],
    callback: BodyResponseCallback[Readable | SchemaCryptoKey]
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
  /**
    * Update the version of a CryptoKey that will be used in Encrypt. Returns an error if called on a key whose purpose is not ENCRYPT_DECRYPT.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudkms.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudkms = google.cloudkms('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudkms',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.updatePrimaryVersion({
    *       // Required. The resource name of the CryptoKey to update.
    *       name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "cryptoKeyVersionId": "my_cryptoKeyVersionId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "cryptoKeyBackend": "my_cryptoKeyBackend",
    *   //   "destroyScheduledDuration": "my_destroyScheduledDuration",
    *   //   "importOnly": false,
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "nextRotationTime": "my_nextRotationTime",
    *   //   "primary": {},
    *   //   "purpose": "my_purpose",
    *   //   "rotationPeriod": "my_rotationPeriod",
    *   //   "versionTemplate": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def updatePrimaryVersion(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updatePrimaryVersion(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysUpdateprimaryversion,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
