package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Details")
@js.native
class ResourceDollarEditsDollarDetails protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.details.get
    * @desc Fetches app details for this edit. This includes the default
    * language and developer support contact information.
    * @alias androidpublisher.edits.details.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AppDetails] = js.native
  def get(callback: BodyResponseCallback[Schema$AppDetails]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarDetailsDollarGet): GaxiosPromise[Schema$AppDetails] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarDetailsDollarGet,
    callback: BodyResponseCallback[Schema$AppDetails]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarDetailsDollarGet,
    options: BodyResponseCallback[Schema$AppDetails],
    callback: BodyResponseCallback[Schema$AppDetails]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarDetailsDollarGet, options: MethodOptions): GaxiosPromise[Schema$AppDetails] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarDetailsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppDetails]
  ): Unit = js.native
  /**
    * androidpublisher.edits.details.patch
    * @desc Updates app details for this edit. This method supports patch
    * semantics.
    * @alias androidpublisher.edits.details.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().AppDetails} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$AppDetails] = js.native
  def patch(callback: BodyResponseCallback[Schema$AppDetails]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarDetailsDollarPatch): GaxiosPromise[Schema$AppDetails] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarDetailsDollarPatch,
    callback: BodyResponseCallback[Schema$AppDetails]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarDetailsDollarPatch,
    options: BodyResponseCallback[Schema$AppDetails],
    callback: BodyResponseCallback[Schema$AppDetails]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarDetailsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$AppDetails] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarDetailsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppDetails]
  ): Unit = js.native
  /**
    * androidpublisher.edits.details.update
    * @desc Updates app details for this edit.
    * @alias androidpublisher.edits.details.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().AppDetails} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$AppDetails] = js.native
  def update(callback: BodyResponseCallback[Schema$AppDetails]): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarDetailsDollarUpdate): GaxiosPromise[Schema$AppDetails] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarDetailsDollarUpdate,
    callback: BodyResponseCallback[Schema$AppDetails]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarDetailsDollarUpdate,
    options: BodyResponseCallback[Schema$AppDetails],
    callback: BodyResponseCallback[Schema$AppDetails]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarDetailsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$AppDetails] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarDetailsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppDetails]
  ): Unit = js.native
}

