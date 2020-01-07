package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Projects$Versions")
@js.native
class ResourceDollarProjectsDollarVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * script.projects.versions.create
    * @desc Creates a new immutable version using the current code, with a
    * unique version number.
    * @alias script.projects.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {().Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Version] = js.native
  def create(callback: BodyResponseCallback[Schema$Version]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarVersionsDollarCreate): GaxiosPromise[Schema$Version] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarCreate,
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarCreate,
    options: BodyResponseCallback[Schema$Version],
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarVersionsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Version] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  /**
    * script.projects.versions.get
    * @desc Gets a version of a script project.
    * @alias script.projects.versions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {integer} params.versionNumber The version number.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Version] = js.native
  def get(callback: BodyResponseCallback[Schema$Version]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarVersionsDollarGet): GaxiosPromise[Schema$Version] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarGet,
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarGet,
    options: BodyResponseCallback[Schema$Version],
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarVersionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Version] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Version]
  ): Unit = js.native
  /**
    * script.projects.versions.list
    * @desc List the versions of a script project.
    * @alias script.projects.versions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of versions on each returned page. Defaults to 50.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListVersionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarVersionsDollarList): GaxiosPromise[Schema$ListVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarList,
    callback: BodyResponseCallback[Schema$ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarList,
    options: BodyResponseCallback[Schema$ListVersionsResponse],
    callback: BodyResponseCallback[Schema$ListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarVersionsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListVersionsResponse]
  ): Unit = js.native
}

