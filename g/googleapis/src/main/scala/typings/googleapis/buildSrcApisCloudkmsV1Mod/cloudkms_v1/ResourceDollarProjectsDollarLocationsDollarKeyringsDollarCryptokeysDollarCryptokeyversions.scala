package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Resource$Projects$Locations$Keyrings$Cryptokeys$Cryptokeyversions")
@js.native
class ResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
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
  def asymmetricDecrypt(): GaxiosPromise[Schema$AsymmetricDecryptResponse] = js.native
  def asymmetricDecrypt(callback: BodyResponseCallback[Schema$AsymmetricDecryptResponse]): Unit = js.native
  def asymmetricDecrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricdecrypt
  ): GaxiosPromise[Schema$AsymmetricDecryptResponse] = js.native
  def asymmetricDecrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricdecrypt,
    callback: BodyResponseCallback[Schema$AsymmetricDecryptResponse]
  ): Unit = js.native
  def asymmetricDecrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricdecrypt,
    options: BodyResponseCallback[Schema$AsymmetricDecryptResponse],
    callback: BodyResponseCallback[Schema$AsymmetricDecryptResponse]
  ): Unit = js.native
  def asymmetricDecrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricdecrypt,
    options: MethodOptions
  ): GaxiosPromise[Schema$AsymmetricDecryptResponse] = js.native
  def asymmetricDecrypt(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricdecrypt,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AsymmetricDecryptResponse]
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
  def asymmetricSign(): GaxiosPromise[Schema$AsymmetricSignResponse] = js.native
  def asymmetricSign(callback: BodyResponseCallback[Schema$AsymmetricSignResponse]): Unit = js.native
  def asymmetricSign(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricsign
  ): GaxiosPromise[Schema$AsymmetricSignResponse] = js.native
  def asymmetricSign(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricsign,
    callback: BodyResponseCallback[Schema$AsymmetricSignResponse]
  ): Unit = js.native
  def asymmetricSign(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricsign,
    options: BodyResponseCallback[Schema$AsymmetricSignResponse],
    callback: BodyResponseCallback[Schema$AsymmetricSignResponse]
  ): Unit = js.native
  def asymmetricSign(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricsign,
    options: MethodOptions
  ): GaxiosPromise[Schema$AsymmetricSignResponse] = js.native
  def asymmetricSign(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarAsymmetricsign,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AsymmetricSignResponse]
  ): Unit = js.native
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
  def create(): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def create(callback: BodyResponseCallback[Schema$CryptoKeyVersion]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarCreate
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarCreate,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarCreate,
    options: BodyResponseCallback[Schema$CryptoKeyVersion],
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
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
  def destroy(): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def destroy(callback: BodyResponseCallback[Schema$CryptoKeyVersion]): Unit = js.native
  def destroy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarDestroy
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def destroy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarDestroy,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def destroy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarDestroy,
    options: BodyResponseCallback[Schema$CryptoKeyVersion],
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def destroy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarDestroy,
    options: MethodOptions
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def destroy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarDestroy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
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
  def get(): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def get(callback: BodyResponseCallback[Schema$CryptoKeyVersion]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGet
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGet,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGet,
    options: BodyResponseCallback[Schema$CryptoKeyVersion],
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
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
  def getPublicKey(): GaxiosPromise[Schema$PublicKey] = js.native
  def getPublicKey(callback: BodyResponseCallback[Schema$PublicKey]): Unit = js.native
  def getPublicKey(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGetpublickey
  ): GaxiosPromise[Schema$PublicKey] = js.native
  def getPublicKey(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGetpublickey,
    callback: BodyResponseCallback[Schema$PublicKey]
  ): Unit = js.native
  def getPublicKey(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGetpublickey,
    options: BodyResponseCallback[Schema$PublicKey],
    callback: BodyResponseCallback[Schema$PublicKey]
  ): Unit = js.native
  def getPublicKey(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGetpublickey,
    options: MethodOptions
  ): GaxiosPromise[Schema$PublicKey] = js.native
  def getPublicKey(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarGetpublickey,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PublicKey]
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
  def list(): GaxiosPromise[Schema$ListCryptoKeyVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListCryptoKeyVersionsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarList
  ): GaxiosPromise[Schema$ListCryptoKeyVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarList,
    callback: BodyResponseCallback[Schema$ListCryptoKeyVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarList,
    options: BodyResponseCallback[Schema$ListCryptoKeyVersionsResponse],
    callback: BodyResponseCallback[Schema$ListCryptoKeyVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListCryptoKeyVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListCryptoKeyVersionsResponse]
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
  def patch(): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def patch(callback: BodyResponseCallback[Schema$CryptoKeyVersion]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarPatch
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarPatch,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarPatch,
    options: BodyResponseCallback[Schema$CryptoKeyVersion],
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
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
  def restore(): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def restore(callback: BodyResponseCallback[Schema$CryptoKeyVersion]): Unit = js.native
  def restore(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarRestore
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def restore(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarRestore,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def restore(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarRestore,
    options: BodyResponseCallback[Schema$CryptoKeyVersion],
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
  def restore(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarRestore,
    options: MethodOptions
  ): GaxiosPromise[Schema$CryptoKeyVersion] = js.native
  def restore(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeysDollarCryptokeyversionsDollarRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CryptoKeyVersion]
  ): Unit = js.native
}

