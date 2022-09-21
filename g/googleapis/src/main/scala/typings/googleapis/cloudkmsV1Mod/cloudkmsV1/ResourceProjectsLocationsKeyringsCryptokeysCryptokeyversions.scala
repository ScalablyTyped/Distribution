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

@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Resource$Projects$Locations$Keyrings$Cryptokeys$Cryptokeyversions")
@js.native
open class ResourceProjectsLocationsKeyringsCryptokeysCryptokeyversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def asymmetricDecrypt(): GaxiosPromise[SchemaAsymmetricDecryptResponse] = js.native
  def asymmetricDecrypt(callback: BodyResponseCallback[SchemaAsymmetricDecryptResponse]): Unit = js.native
  def asymmetricDecrypt(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAsymmetricDecryptResponse] = js.native
  def asymmetricDecrypt(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricdecrypt): GaxiosPromise[SchemaAsymmetricDecryptResponse] = js.native
  def asymmetricDecrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricdecrypt,
    callback: BodyResponseCallback[SchemaAsymmetricDecryptResponse]
  ): Unit = js.native
  def asymmetricDecrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricdecrypt,
    options: BodyResponseCallback[Readable | SchemaAsymmetricDecryptResponse],
    callback: BodyResponseCallback[Readable | SchemaAsymmetricDecryptResponse]
  ): Unit = js.native
  def asymmetricDecrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricdecrypt,
    options: MethodOptions
  ): GaxiosPromise[SchemaAsymmetricDecryptResponse] = js.native
  def asymmetricDecrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricdecrypt,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAsymmetricDecryptResponse]
  ): Unit = js.native
  /**
    * Decrypts data that was encrypted with a public key retrieved from GetPublicKey corresponding to a CryptoKeyVersion with CryptoKey.purpose ASYMMETRIC_DECRYPT.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.asymmetricDecrypt(
    *       {
    *         // Required. The resource name of the CryptoKeyVersion to use for decryption.
    *         name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey/cryptoKeyVersions/my-cryptoKeyVersion',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "ciphertext": "my_ciphertext",
    *           //   "ciphertextCrc32c": "my_ciphertextCrc32c"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "plaintext": "my_plaintext",
    *   //   "plaintextCrc32c": "my_plaintextCrc32c",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "verifiedCiphertextCrc32c": false
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
  def asymmetricDecrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricdecrypt,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def asymmetricDecrypt(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricdecrypt,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def asymmetricSign(): GaxiosPromise[SchemaAsymmetricSignResponse] = js.native
  def asymmetricSign(callback: BodyResponseCallback[SchemaAsymmetricSignResponse]): Unit = js.native
  def asymmetricSign(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAsymmetricSignResponse] = js.native
  def asymmetricSign(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricsign): GaxiosPromise[SchemaAsymmetricSignResponse] = js.native
  def asymmetricSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricsign,
    callback: BodyResponseCallback[SchemaAsymmetricSignResponse]
  ): Unit = js.native
  def asymmetricSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricsign,
    options: BodyResponseCallback[Readable | SchemaAsymmetricSignResponse],
    callback: BodyResponseCallback[Readable | SchemaAsymmetricSignResponse]
  ): Unit = js.native
  def asymmetricSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricsign,
    options: MethodOptions
  ): GaxiosPromise[SchemaAsymmetricSignResponse] = js.native
  def asymmetricSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricsign,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAsymmetricSignResponse]
  ): Unit = js.native
  /**
    * Signs data using a CryptoKeyVersion with CryptoKey.purpose ASYMMETRIC_SIGN, producing a signature that can be verified with the public key retrieved from GetPublicKey.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.asymmetricSign(
    *       {
    *         // Required. The resource name of the CryptoKeyVersion to use for signing.
    *         name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey/cryptoKeyVersions/my-cryptoKeyVersion',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "data": "my_data",
    *           //   "dataCrc32c": "my_dataCrc32c",
    *           //   "digest": {},
    *           //   "digestCrc32c": "my_digestCrc32c"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "signature": "my_signature",
    *   //   "signatureCrc32c": "my_signatureCrc32c",
    *   //   "verifiedDataCrc32c": false,
    *   //   "verifiedDigestCrc32c": false
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
  def asymmetricSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricsign,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def asymmetricSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsAsymmetricsign,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def create(callback: BodyResponseCallback[SchemaCryptoKeyVersion]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def create(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsCreate): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsCreate,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsCreate,
    options: BodyResponseCallback[Readable | SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[Readable | SchemaCryptoKeyVersion]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  /**
    * Create a new CryptoKeyVersion in a CryptoKey. The server will assign the next sequential id. If unset, state will be set to ENABLED.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.create(
    *       {
    *         // Required. The name of the CryptoKey associated with the CryptoKeyVersions.
    *         parent:
    *           'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "algorithm": "my_algorithm",
    *           //   "attestation": {},
    *           //   "createTime": "my_createTime",
    *           //   "destroyEventTime": "my_destroyEventTime",
    *           //   "destroyTime": "my_destroyTime",
    *           //   "externalProtectionLevelOptions": {},
    *           //   "generateTime": "my_generateTime",
    *           //   "importFailureReason": "my_importFailureReason",
    *           //   "importJob": "my_importJob",
    *           //   "importTime": "my_importTime",
    *           //   "name": "my_name",
    *           //   "protectionLevel": "my_protectionLevel",
    *           //   "reimportEligible": false,
    *           //   "state": "my_state"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "algorithm": "my_algorithm",
    *   //   "attestation": {},
    *   //   "createTime": "my_createTime",
    *   //   "destroyEventTime": "my_destroyEventTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "externalProtectionLevelOptions": {},
    *   //   "generateTime": "my_generateTime",
    *   //   "importFailureReason": "my_importFailureReason",
    *   //   "importJob": "my_importJob",
    *   //   "importTime": "my_importTime",
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "reimportEligible": false,
    *   //   "state": "my_state"
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
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def destroy(): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def destroy(callback: BodyResponseCallback[SchemaCryptoKeyVersion]): Unit = js.native
  def destroy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def destroy(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def destroy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  def destroy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy,
    options: BodyResponseCallback[Readable | SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[Readable | SchemaCryptoKeyVersion]
  ): Unit = js.native
  def destroy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy,
    options: MethodOptions
  ): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def destroy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  /**
    * Schedule a CryptoKeyVersion for destruction. Upon calling this method, CryptoKeyVersion.state will be set to DESTROY_SCHEDULED, and destroy_time will be set to the time destroy_scheduled_duration in the future. At that time, the state will automatically change to DESTROYED, and the key material will be irrevocably destroyed. Before the destroy_time is reached, RestoreCryptoKeyVersion may be called to reverse the process.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.destroy(
    *       {
    *         // Required. The resource name of the CryptoKeyVersion to destroy.
    *         name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey/cryptoKeyVersions/my-cryptoKeyVersion',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {}
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "algorithm": "my_algorithm",
    *   //   "attestation": {},
    *   //   "createTime": "my_createTime",
    *   //   "destroyEventTime": "my_destroyEventTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "externalProtectionLevelOptions": {},
    *   //   "generateTime": "my_generateTime",
    *   //   "importFailureReason": "my_importFailureReason",
    *   //   "importJob": "my_importJob",
    *   //   "importTime": "my_importTime",
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "reimportEligible": false,
    *   //   "state": "my_state"
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
  def destroy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def destroy(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsDestroy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaCryptoKeyVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def get(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGet): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGet,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGet,
    options: BodyResponseCallback[Readable | SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[Readable | SchemaCryptoKeyVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  /**
    * Returns metadata for a given CryptoKeyVersion.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.get(
    *       {
    *         // Required. The name of the CryptoKeyVersion to get.
    *         name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey/cryptoKeyVersions/my-cryptoKeyVersion',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "algorithm": "my_algorithm",
    *   //   "attestation": {},
    *   //   "createTime": "my_createTime",
    *   //   "destroyEventTime": "my_destroyEventTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "externalProtectionLevelOptions": {},
    *   //   "generateTime": "my_generateTime",
    *   //   "importFailureReason": "my_importFailureReason",
    *   //   "importJob": "my_importJob",
    *   //   "importTime": "my_importTime",
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "reimportEligible": false,
    *   //   "state": "my_state"
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
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getPublicKey(): GaxiosPromise[SchemaPublicKey] = js.native
  def getPublicKey(callback: BodyResponseCallback[SchemaPublicKey]): Unit = js.native
  def getPublicKey(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPublicKey] = js.native
  def getPublicKey(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGetpublickey): GaxiosPromise[SchemaPublicKey] = js.native
  def getPublicKey(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGetpublickey,
    callback: BodyResponseCallback[SchemaPublicKey]
  ): Unit = js.native
  def getPublicKey(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGetpublickey,
    options: BodyResponseCallback[Readable | SchemaPublicKey],
    callback: BodyResponseCallback[Readable | SchemaPublicKey]
  ): Unit = js.native
  def getPublicKey(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGetpublickey,
    options: MethodOptions
  ): GaxiosPromise[SchemaPublicKey] = js.native
  def getPublicKey(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGetpublickey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublicKey]
  ): Unit = js.native
  /**
    * Returns the public key for the given CryptoKeyVersion. The CryptoKey.purpose must be ASYMMETRIC_SIGN or ASYMMETRIC_DECRYPT.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.getPublicKey(
    *       {
    *         // Required. The name of the CryptoKeyVersion public key to get.
    *         name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey/cryptoKeyVersions/my-cryptoKeyVersion',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "algorithm": "my_algorithm",
    *   //   "name": "my_name",
    *   //   "pem": "my_pem",
    *   //   "pemCrc32c": "my_pemCrc32c",
    *   //   "protectionLevel": "my_protectionLevel"
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
  def getPublicKey(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGetpublickey,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getPublicKey(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsGetpublickey,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def `import`(callback: BodyResponseCallback[SchemaCryptoKeyVersion]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def `import`(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsImport): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsImport,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsImport,
    options: BodyResponseCallback[Readable | SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[Readable | SchemaCryptoKeyVersion]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsImport,
    options: MethodOptions
  ): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  /**
    * Import wrapped key material into a CryptoKeyVersion. All requests must specify a CryptoKey. If a CryptoKeyVersion is additionally specified in the request, key material will be reimported into that version. Otherwise, a new version will be created, and will be assigned the next sequential id within the CryptoKey.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.import(
    *       {
    *         // Required. The name of the CryptoKey to be imported into. The create permission is only required on this key when creating a new CryptoKeyVersion.
    *         parent:
    *           'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "algorithm": "my_algorithm",
    *           //   "cryptoKeyVersion": "my_cryptoKeyVersion",
    *           //   "importJob": "my_importJob",
    *           //   "rsaAesWrappedKey": "my_rsaAesWrappedKey",
    *           //   "wrappedKey": "my_wrappedKey"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "algorithm": "my_algorithm",
    *   //   "attestation": {},
    *   //   "createTime": "my_createTime",
    *   //   "destroyEventTime": "my_destroyEventTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "externalProtectionLevelOptions": {},
    *   //   "generateTime": "my_generateTime",
    *   //   "importFailureReason": "my_importFailureReason",
    *   //   "importJob": "my_importJob",
    *   //   "importTime": "my_importTime",
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "reimportEligible": false,
    *   //   "state": "my_state"
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
  def `import`(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsImport,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCryptoKeyVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCryptoKeyVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCryptoKeyVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList): GaxiosPromise[SchemaListCryptoKeyVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList,
    callback: BodyResponseCallback[SchemaListCryptoKeyVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList,
    options: BodyResponseCallback[Readable | SchemaListCryptoKeyVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCryptoKeyVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListCryptoKeyVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCryptoKeyVersionsResponse]
  ): Unit = js.native
  /**
    * Lists CryptoKeyVersions.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.list(
    *       {
    *         // Optional. Only include resources that match the filter in the response. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
    *         filter: 'placeholder-value',
    *         // Optional. Specify how the results should be sorted. If not specified, the results will be sorted in the default order. For more information, see [Sorting and filtering list results](https://cloud.google.com/kms/docs/sorting-and-filtering).
    *         orderBy: 'placeholder-value',
    *         // Optional. Optional limit on the number of CryptoKeyVersions to include in the response. Further CryptoKeyVersions can subsequently be obtained by including the ListCryptoKeyVersionsResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
    *         pageSize: 'placeholder-value',
    *         // Optional. Optional pagination token, returned earlier via ListCryptoKeyVersionsResponse.next_page_token.
    *         pageToken: 'placeholder-value',
    *         // Required. The resource name of the CryptoKey to list, in the format `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    *         parent:
    *           'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey',
    *         // The fields to include in the response.
    *         view: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cryptoKeyVersions": [],
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
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def macSign(): GaxiosPromise[SchemaMacSignResponse] = js.native
  def macSign(callback: BodyResponseCallback[SchemaMacSignResponse]): Unit = js.native
  def macSign(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMacSignResponse] = js.native
  def macSign(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign): GaxiosPromise[SchemaMacSignResponse] = js.native
  def macSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign,
    callback: BodyResponseCallback[SchemaMacSignResponse]
  ): Unit = js.native
  def macSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign,
    options: BodyResponseCallback[Readable | SchemaMacSignResponse],
    callback: BodyResponseCallback[Readable | SchemaMacSignResponse]
  ): Unit = js.native
  def macSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign,
    options: MethodOptions
  ): GaxiosPromise[SchemaMacSignResponse] = js.native
  def macSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMacSignResponse]
  ): Unit = js.native
  /**
    * Signs data using a CryptoKeyVersion with CryptoKey.purpose MAC, producing a tag that can be verified by another source with the same key.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.macSign(
    *       {
    *         // Required. The resource name of the CryptoKeyVersion to use for signing.
    *         name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey/cryptoKeyVersions/my-cryptoKeyVersion',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "data": "my_data",
    *           //   "dataCrc32c": "my_dataCrc32c"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "mac": "my_mac",
    *   //   "macCrc32c": "my_macCrc32c",
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "verifiedDataCrc32c": false
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
  def macSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def macSign(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacsign,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def macVerify(): GaxiosPromise[SchemaMacVerifyResponse] = js.native
  def macVerify(callback: BodyResponseCallback[SchemaMacVerifyResponse]): Unit = js.native
  def macVerify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMacVerifyResponse] = js.native
  def macVerify(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacverify): GaxiosPromise[SchemaMacVerifyResponse] = js.native
  def macVerify(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacverify,
    callback: BodyResponseCallback[SchemaMacVerifyResponse]
  ): Unit = js.native
  def macVerify(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacverify,
    options: BodyResponseCallback[Readable | SchemaMacVerifyResponse],
    callback: BodyResponseCallback[Readable | SchemaMacVerifyResponse]
  ): Unit = js.native
  def macVerify(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacverify,
    options: MethodOptions
  ): GaxiosPromise[SchemaMacVerifyResponse] = js.native
  def macVerify(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacverify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMacVerifyResponse]
  ): Unit = js.native
  /**
    * Verifies MAC tag using a CryptoKeyVersion with CryptoKey.purpose MAC, and returns a response that indicates whether or not the verification was successful.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.macVerify(
    *       {
    *         // Required. The resource name of the CryptoKeyVersion to use for verification.
    *         name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey/cryptoKeyVersions/my-cryptoKeyVersion',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "data": "my_data",
    *           //   "dataCrc32c": "my_dataCrc32c",
    *           //   "mac": "my_mac",
    *           //   "macCrc32c": "my_macCrc32c"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "success": false,
    *   //   "verifiedDataCrc32c": false,
    *   //   "verifiedMacCrc32c": false,
    *   //   "verifiedSuccessIntegrity": false
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
  def macVerify(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacverify,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def macVerify(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsMacverify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def patch(callback: BodyResponseCallback[SchemaCryptoKeyVersion]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def patch(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsPatch): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsPatch,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsPatch,
    options: BodyResponseCallback[Readable | SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[Readable | SchemaCryptoKeyVersion]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  /**
    * Update a CryptoKeyVersion's metadata. state may be changed between ENABLED and DISABLED using this method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to move between other states.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.patch(
    *       {
    *         // Output only. The resource name for this CryptoKeyVersion in the format `projects/x/locations/x/keyRings/x/cryptoKeys/x/cryptoKeyVersions/x`.
    *         name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey/cryptoKeyVersions/my-cryptoKeyVersion',
    *         // Required. List of fields to be updated in this request.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "algorithm": "my_algorithm",
    *           //   "attestation": {},
    *           //   "createTime": "my_createTime",
    *           //   "destroyEventTime": "my_destroyEventTime",
    *           //   "destroyTime": "my_destroyTime",
    *           //   "externalProtectionLevelOptions": {},
    *           //   "generateTime": "my_generateTime",
    *           //   "importFailureReason": "my_importFailureReason",
    *           //   "importJob": "my_importJob",
    *           //   "importTime": "my_importTime",
    *           //   "name": "my_name",
    *           //   "protectionLevel": "my_protectionLevel",
    *           //   "reimportEligible": false,
    *           //   "state": "my_state"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "algorithm": "my_algorithm",
    *   //   "attestation": {},
    *   //   "createTime": "my_createTime",
    *   //   "destroyEventTime": "my_destroyEventTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "externalProtectionLevelOptions": {},
    *   //   "generateTime": "my_generateTime",
    *   //   "importFailureReason": "my_importFailureReason",
    *   //   "importJob": "my_importJob",
    *   //   "importTime": "my_importTime",
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "reimportEligible": false,
    *   //   "state": "my_state"
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
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restore(): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def restore(callback: BodyResponseCallback[SchemaCryptoKeyVersion]): Unit = js.native
  def restore(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def restore(params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsRestore): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsRestore,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  def restore(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsRestore,
    options: BodyResponseCallback[Readable | SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[Readable | SchemaCryptoKeyVersion]
  ): Unit = js.native
  def restore(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsRestore,
    options: MethodOptions
  ): GaxiosPromise[SchemaCryptoKeyVersion] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
  ): Unit = js.native
  /**
    * Restore a CryptoKeyVersion in the DESTROY_SCHEDULED state. Upon restoration of the CryptoKeyVersion, state will be set to DISABLED, and destroy_time will be cleared.
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
    *     await cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.restore(
    *       {
    *         // Required. The resource name of the CryptoKeyVersion to restore.
    *         name: 'projects/my-project/locations/my-location/keyRings/my-keyRing/cryptoKeys/my-cryptoKey/cryptoKeyVersions/my-cryptoKeyVersion',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {}
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "algorithm": "my_algorithm",
    *   //   "attestation": {},
    *   //   "createTime": "my_createTime",
    *   //   "destroyEventTime": "my_destroyEventTime",
    *   //   "destroyTime": "my_destroyTime",
    *   //   "externalProtectionLevelOptions": {},
    *   //   "generateTime": "my_generateTime",
    *   //   "importFailureReason": "my_importFailureReason",
    *   //   "importJob": "my_importJob",
    *   //   "importTime": "my_importTime",
    *   //   "name": "my_name",
    *   //   "protectionLevel": "my_protectionLevel",
    *   //   "reimportEligible": false,
    *   //   "state": "my_state"
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
  def restore(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsRestore,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsRestore,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
