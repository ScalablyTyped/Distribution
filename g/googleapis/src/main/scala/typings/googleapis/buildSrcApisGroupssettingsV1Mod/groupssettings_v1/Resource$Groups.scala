package typings.googleapis.buildSrcApisGroupssettingsV1Mod.groupssettings_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/groupssettings/v1", "groupssettings_v1.Resource$Groups")
@js.native
class Resource$Groups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * groupsSettings.groups.get
    * @desc Gets one resource by id.
    * @alias groupsSettings.groups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupUniqueId The resource ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Groups] = js.native
  def get(callback: BodyResponseCallback[Schema$Groups]): Unit = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarGet): GaxiosPromise[Schema$Groups] = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarGet, callback: BodyResponseCallback[Schema$Groups]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarGroupsDollarGet,
    options: BodyResponseCallback[Schema$Groups],
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Groups] = js.native
  def get(
    params: ParamsDollarResourceDollarGroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  /**
    * groupsSettings.groups.patch
    * @desc Updates an existing resource. This method supports patch semantics.
    * @alias groupsSettings.groups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupUniqueId The resource ID
    * @param {().Groups} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Groups] = js.native
  def patch(callback: BodyResponseCallback[Schema$Groups]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarGroupsDollarPatch): GaxiosPromise[Schema$Groups] = js.native
  def patch(params: ParamsDollarResourceDollarGroupsDollarPatch, callback: BodyResponseCallback[Schema$Groups]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarGroupsDollarPatch,
    options: BodyResponseCallback[Schema$Groups],
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarGroupsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Groups] = js.native
  def patch(
    params: ParamsDollarResourceDollarGroupsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  /**
    * groupsSettings.groups.update
    * @desc Updates an existing resource.
    * @alias groupsSettings.groups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupUniqueId The resource ID
    * @param {().Groups} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Groups] = js.native
  def update(callback: BodyResponseCallback[Schema$Groups]): Unit = js.native
  def update(params: ParamsDollarResourceDollarGroupsDollarUpdate): GaxiosPromise[Schema$Groups] = js.native
  def update(
    params: ParamsDollarResourceDollarGroupsDollarUpdate,
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarGroupsDollarUpdate,
    options: BodyResponseCallback[Schema$Groups],
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarGroupsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Groups] = js.native
  def update(
    params: ParamsDollarResourceDollarGroupsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
}

