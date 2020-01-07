package typings.googleapis.buildSrcApisCloudfunctionsV1beta2Mod.cloudfunctions_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudfunctions/v1beta2", "cloudfunctions_v1beta2.Resource$Projects$Locations$Functions")
@js.native
class ResourceDollarProjectsDollarLocationsDollarFunctions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudfunctions.projects.locations.functions.call
    * @desc Synchronously invokes a deployed Cloud Function. To be used for
    * testing purposes as very limited traffic is allowed. For more information
    * on the actual limits refer to [API Calls](
    * https://cloud.google.com/functions/quotas#rate_limits).
    * @alias cloudfunctions.projects.locations.functions.call
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the function to be called.
    * @param {().CallFunctionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def call(): GaxiosPromise[Schema$CallFunctionResponse] = js.native
  def call(callback: BodyResponseCallback[Schema$CallFunctionResponse]): Unit = js.native
  def call(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCall): GaxiosPromise[Schema$CallFunctionResponse] = js.native
  def call(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCall,
    callback: BodyResponseCallback[Schema$CallFunctionResponse]
  ): Unit = js.native
  def call(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCall,
    options: BodyResponseCallback[Schema$CallFunctionResponse],
    callback: BodyResponseCallback[Schema$CallFunctionResponse]
  ): Unit = js.native
  def call(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCall,
    options: MethodOptions
  ): GaxiosPromise[Schema$CallFunctionResponse] = js.native
  def call(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCall,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CallFunctionResponse]
  ): Unit = js.native
  /**
    * cloudfunctions.projects.locations.functions.create
    * @desc Creates a new function. If a function with the given name already
    * exists in the specified project, the long running operation will return
    * `ALREADY_EXISTS` error.
    * @alias cloudfunctions.projects.locations.functions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.location The project and location in which the function should be created, specified in the format `projects/x/locations/x`
    * @param {().CloudFunction} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudfunctions.projects.locations.functions.delete
    * @desc Deletes a function with the given name from the specified project.
    * If the given function is used by some trigger, the trigger will be
    * updated to remove this function.
    * @alias cloudfunctions.projects.locations.functions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the function which should be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudfunctions.projects.locations.functions.generateDownloadUrl
    * @desc Returns a signed URL for downloading deployed function source code.
    * The URL is only valid for a limited period and should be used within
    * minutes after generation. For more information about the signed URL usage
    * see: https://cloud.google.com/storage/docs/access-control/signed-urls
    * @alias cloudfunctions.projects.locations.functions.generateDownloadUrl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of function for which source code Google Cloud Storage signed URL should be generated.
    * @param {().GenerateDownloadUrlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateDownloadUrl(): GaxiosPromise[Schema$GenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(callback: BodyResponseCallback[Schema$GenerateDownloadUrlResponse]): Unit = js.native
  def generateDownloadUrl(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGeneratedownloadurl): GaxiosPromise[Schema$GenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGeneratedownloadurl,
    callback: BodyResponseCallback[Schema$GenerateDownloadUrlResponse]
  ): Unit = js.native
  def generateDownloadUrl(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGeneratedownloadurl,
    options: BodyResponseCallback[Schema$GenerateDownloadUrlResponse],
    callback: BodyResponseCallback[Schema$GenerateDownloadUrlResponse]
  ): Unit = js.native
  def generateDownloadUrl(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGeneratedownloadurl,
    options: MethodOptions
  ): GaxiosPromise[Schema$GenerateDownloadUrlResponse] = js.native
  def generateDownloadUrl(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGeneratedownloadurl,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GenerateDownloadUrlResponse]
  ): Unit = js.native
  /**
    * cloudfunctions.projects.locations.functions.generateUploadUrl
    * @desc Returns a signed URL for uploading a function source code. For more
    * information about the signed URL usage see:
    * https://cloud.google.com/storage/docs/access-control/signed-urls Once the
    * function source code upload is complete, the used signed URL should be
    * provided in CreateFunction or UpdateFunction request as a reference to
    * the function source code.  When uploading source code to the generated
    * signed URL, please follow these restrictions:  * Source file type should
    * be a zip file. * Source file size should not exceed 100MB limit. * No
    * credentials should be attached - the signed URLs provide access to the
    * target bucket using internal service identity; if credentials were
    * attached, the identity from the credentials would be used, but that
    * identity does not have permissions to upload files to the URL.  When
    * making a HTTP PUT request, these two headers need to be specified:  *
    * `content-type: application/zip` * `x-goog-content-length-range:
    * 0,104857600`  And this header SHOULD NOT be specified:  * `Authorization:
    * Bearer YOUR_TOKEN`
    * @alias cloudfunctions.projects.locations.functions.generateUploadUrl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project and location in which the Google Cloud Storage signed URL should be generated, specified in the format `projects/x/locations/x`.
    * @param {().GenerateUploadUrlRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateUploadUrl(): GaxiosPromise[Schema$GenerateUploadUrlResponse] = js.native
  def generateUploadUrl(callback: BodyResponseCallback[Schema$GenerateUploadUrlResponse]): Unit = js.native
  def generateUploadUrl(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGenerateuploadurl): GaxiosPromise[Schema$GenerateUploadUrlResponse] = js.native
  def generateUploadUrl(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGenerateuploadurl,
    callback: BodyResponseCallback[Schema$GenerateUploadUrlResponse]
  ): Unit = js.native
  def generateUploadUrl(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGenerateuploadurl,
    options: BodyResponseCallback[Schema$GenerateUploadUrlResponse],
    callback: BodyResponseCallback[Schema$GenerateUploadUrlResponse]
  ): Unit = js.native
  def generateUploadUrl(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGenerateuploadurl,
    options: MethodOptions
  ): GaxiosPromise[Schema$GenerateUploadUrlResponse] = js.native
  def generateUploadUrl(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGenerateuploadurl,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GenerateUploadUrlResponse]
  ): Unit = js.native
  /**
    * cloudfunctions.projects.locations.functions.get
    * @desc Returns a function with the given name from the requested project.
    * @alias cloudfunctions.projects.locations.functions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the function which details should be obtained.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CloudFunction] = js.native
  def get(callback: BodyResponseCallback[Schema$CloudFunction]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGet): GaxiosPromise[Schema$CloudFunction] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGet,
    callback: BodyResponseCallback[Schema$CloudFunction]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGet,
    options: BodyResponseCallback[Schema$CloudFunction],
    callback: BodyResponseCallback[Schema$CloudFunction]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$CloudFunction] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CloudFunction]
  ): Unit = js.native
  /**
    * cloudfunctions.projects.locations.functions.list
    * @desc Returns a list of functions that belong to the requested project.
    * @alias cloudfunctions.projects.locations.functions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.location The project and location from which the function should be listed, specified in the format `projects/x/locations/x` If you want to list functions in all locations, use "-" in place of a location.
    * @param {integer=} params.pageSize Maximum number of functions to return per call.
    * @param {string=} params.pageToken The value returned by the last `ListFunctionsResponse`; indicates that this is a continuation of a prior `ListFunctions` call, and that the system should return the next page of data.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFunctionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFunctionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarList): GaxiosPromise[Schema$ListFunctionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarList,
    callback: BodyResponseCallback[Schema$ListFunctionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarList,
    options: BodyResponseCallback[Schema$ListFunctionsResponse],
    callback: BodyResponseCallback[Schema$ListFunctionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFunctionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFunctionsResponse]
  ): Unit = js.native
  /**
    * cloudfunctions.projects.locations.functions.update
    * @desc Updates existing function.
    * @alias cloudfunctions.projects.locations.functions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the function to be updated.
    * @param {().CloudFunction} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarFunctionsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

