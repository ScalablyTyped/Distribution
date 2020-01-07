package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Testers")
@js.native
class ResourceDollarEditsDollarTesters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.testers.get
    * @alias androidpublisher.edits.testers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {string} params.track The track to read or modify. Acceptable values are: "alpha", "beta", "production", "rollout" or "internal".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Testers] = js.native
  def get(callback: BodyResponseCallback[Schema$Testers]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarTestersDollarGet): GaxiosPromise[Schema$Testers] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarTestersDollarGet,
    callback: BodyResponseCallback[Schema$Testers]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarTestersDollarGet,
    options: BodyResponseCallback[Schema$Testers],
    callback: BodyResponseCallback[Schema$Testers]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarTestersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Testers] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarTestersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Testers]
  ): Unit = js.native
  /**
    * androidpublisher.edits.testers.patch
    * @alias androidpublisher.edits.testers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {string} params.track The track to read or modify. Acceptable values are: "alpha", "beta", "production", "rollout" or "internal".
    * @param {().Testers} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Testers] = js.native
  def patch(callback: BodyResponseCallback[Schema$Testers]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarTestersDollarPatch): GaxiosPromise[Schema$Testers] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarTestersDollarPatch,
    callback: BodyResponseCallback[Schema$Testers]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarTestersDollarPatch,
    options: BodyResponseCallback[Schema$Testers],
    callback: BodyResponseCallback[Schema$Testers]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarTestersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Testers] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarTestersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Testers]
  ): Unit = js.native
  /**
    * androidpublisher.edits.testers.update
    * @alias androidpublisher.edits.testers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {string} params.track The track to read or modify. Acceptable values are: "alpha", "beta", "production", "rollout" or "internal".
    * @param {().Testers} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Testers] = js.native
  def update(callback: BodyResponseCallback[Schema$Testers]): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarTestersDollarUpdate): GaxiosPromise[Schema$Testers] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarTestersDollarUpdate,
    callback: BodyResponseCallback[Schema$Testers]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarTestersDollarUpdate,
    options: BodyResponseCallback[Schema$Testers],
    callback: BodyResponseCallback[Schema$Testers]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarTestersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Testers] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarTestersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Testers]
  ): Unit = js.native
}

