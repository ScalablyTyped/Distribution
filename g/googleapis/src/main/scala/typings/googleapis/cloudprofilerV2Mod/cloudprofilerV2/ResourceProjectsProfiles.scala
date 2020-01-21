package typings.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprofiler/v2", "cloudprofiler_v2.Resource$Projects$Profiles")
@js.native
class ResourceProjectsProfiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudprofiler.projects.profiles.create
    * @desc CreateProfile creates a new profile resource in the online mode.
    * The server ensures that the new profiles are created at a constant rate
    * per deployment, so the creation request may hang for some time until the
    * next profile session is available.  The request may fail with ABORTED
    * error if the creation is not available within ~1m, the response will
    * indicate the duration of the backoff the client should take before
    * attempting creating a profile again. The backoff duration is returned in
    * google.rpc.RetryInfo extension on the response status. To a gRPC client,
    * the extension will be return as a binary-serialized proto in the trailing
    * metadata item named "google.rpc.retryinfo-bin".
    * @alias cloudprofiler.projects.profiles.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Parent project to create the profile in.
    * @param {().CreateProfileRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaProfile] = js.native
  def create(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def create(params: ParamsResourceProjectsProfilesCreate): GaxiosPromise[SchemaProfile] = js.native
  def create(params: ParamsResourceProjectsProfilesCreate, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def create(
    params: ParamsResourceProjectsProfilesCreate,
    options: BodyResponseCallback[SchemaProfile],
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsProfilesCreate, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def create(
    params: ParamsResourceProjectsProfilesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  /**
    * cloudprofiler.projects.profiles.createOffline
    * @desc CreateOfflineProfile creates a new profile resource in the offline
    * mode. The client provides the profile to create along with the profile
    * bytes, the server records it.
    * @alias cloudprofiler.projects.profiles.createOffline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Parent project to create the profile in.
    * @param {().Profile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createOffline(): GaxiosPromise[SchemaProfile] = js.native
  def createOffline(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def createOffline(params: ParamsResourceProjectsProfilesCreateoffline): GaxiosPromise[SchemaProfile] = js.native
  def createOffline(params: ParamsResourceProjectsProfilesCreateoffline, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def createOffline(
    params: ParamsResourceProjectsProfilesCreateoffline,
    options: BodyResponseCallback[SchemaProfile],
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  def createOffline(params: ParamsResourceProjectsProfilesCreateoffline, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def createOffline(
    params: ParamsResourceProjectsProfilesCreateoffline,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  /**
    * cloudprofiler.projects.profiles.patch
    * @desc UpdateProfile updates the profile bytes and labels on the profile
    * resource created in the online mode. Updating the bytes for profiles
    * created in the offline mode is currently not supported: the profile
    * content must be provided at the time of the profile creation.
    * @alias cloudprofiler.projects.profiles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Opaque, server-assigned, unique ID for this profile.
    * @param {string=} params.updateMask Field mask used to specify the fields to be overwritten. Currently only profile_bytes and labels fields are supported by UpdateProfile, so only those fields can be specified in the mask. When no mask is provided, all fields are overwritten.
    * @param {().Profile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaProfile] = js.native
  def patch(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def patch(params: ParamsResourceProjectsProfilesPatch): GaxiosPromise[SchemaProfile] = js.native
  def patch(params: ParamsResourceProjectsProfilesPatch, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsProfilesPatch,
    options: BodyResponseCallback[SchemaProfile],
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsProfilesPatch, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
  def patch(
    params: ParamsResourceProjectsProfilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProfile]
  ): Unit = js.native
}

