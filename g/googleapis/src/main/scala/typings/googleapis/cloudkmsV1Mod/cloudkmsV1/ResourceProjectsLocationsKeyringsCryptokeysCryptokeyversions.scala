package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Resource$Projects$Locations$Keyrings$Cryptokeys$Cryptokeyversions")
@js.native
class ResourceProjectsLocationsKeyringsCryptokeysCryptokeyversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.asymmetricDecrypt
    * @desc Decrypts data that was encrypted with a public key retrieved from
    * GetPublicKey corresponding to a CryptoKeyVersion with CryptoKey.purpose
    * ASYMMETRIC_DECRYPT.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.asymmetricDecrypt
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the CryptoKeyVersion to use for decryption.
    * @param {().AsymmetricDecryptRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaAsymmetricDecryptResponse],
    callback: BodyResponseCallback[SchemaAsymmetricDecryptResponse]
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
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.asymmetricSign
    * @desc Signs data using a CryptoKeyVersion with CryptoKey.purpose
    * ASYMMETRIC_SIGN, producing a signature that can be verified with the
    * public key retrieved from GetPublicKey.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.asymmetricSign
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the CryptoKeyVersion to use for signing.
    * @param {().AsymmetricSignRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaAsymmetricSignResponse],
    callback: BodyResponseCallback[SchemaAsymmetricSignResponse]
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
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.create
    * @desc Create a new CryptoKeyVersion in a CryptoKey.  The server will
    * assign the next sequential id. If unset, state will be set to ENABLED.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the CryptoKey associated with the CryptoKeyVersions.
    * @param {().CryptoKeyVersion} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
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
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.destroy
    * @desc Schedule a CryptoKeyVersion for destruction.  Upon calling this
    * method, CryptoKeyVersion.state will be set to DESTROY_SCHEDULED and
    * destroy_time will be set to a time 24 hours in the future, at which point
    * the state will be changed to DESTROYED, and the key material will be
    * irrevocably destroyed.  Before the destroy_time is reached,
    * RestoreCryptoKeyVersion may be called to reverse the process.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.destroy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the CryptoKeyVersion to destroy.
    * @param {().DestroyCryptoKeyVersionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
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
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.get
    * @desc Returns metadata for a given CryptoKeyVersion.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the CryptoKeyVersion to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
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
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.getPublicKey
    * @desc Returns the public key for the given CryptoKeyVersion. The
    * CryptoKey.purpose must be ASYMMETRIC_SIGN or ASYMMETRIC_DECRYPT.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.getPublicKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the CryptoKeyVersion public key to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaPublicKey],
    callback: BodyResponseCallback[SchemaPublicKey]
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
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.list
    * @desc Lists CryptoKeyVersions.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional limit on the number of CryptoKeyVersions to include in the response. Further CryptoKeyVersions can subsequently be obtained by including the ListCryptoKeyVersionsResponse.next_page_token in a subsequent request. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken Optional pagination token, returned earlier via ListCryptoKeyVersionsResponse.next_page_token.
    * @param {string} params.parent Required. The resource name of the CryptoKey to list, in the format `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    * @param {string=} params.view The fields to include in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaListCryptoKeyVersionsResponse],
    callback: BodyResponseCallback[SchemaListCryptoKeyVersionsResponse]
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
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.patch
    * @desc Update a CryptoKeyVersion's metadata.  state may be changed between
    * ENABLED and DISABLED using this method. See DestroyCryptoKeyVersion and
    * RestoreCryptoKeyVersion to move between other states.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The resource name for this CryptoKeyVersion in the format `projects/x/locations/x/keyRings/x/cryptoKeys/x/cryptoKeyVersions/x`.
    * @param {string=} params.updateMask Required list of fields to be updated in this request.
    * @param {().CryptoKeyVersion} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
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
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.restore
    * @desc Restore a CryptoKeyVersion in the DESTROY_SCHEDULED state.  Upon
    * restoration of the CryptoKeyVersion, state will be set to DISABLED, and
    * destroy_time will be cleared.
    * @alias
    * cloudkms.projects.locations.keyRings.cryptoKeys.cryptoKeyVersions.restore
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the CryptoKeyVersion to restore.
    * @param {().RestoreCryptoKeyVersionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaCryptoKeyVersion],
    callback: BodyResponseCallback[SchemaCryptoKeyVersion]
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
}
