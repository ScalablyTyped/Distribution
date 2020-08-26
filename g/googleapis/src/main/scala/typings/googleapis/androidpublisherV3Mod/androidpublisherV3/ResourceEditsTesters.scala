package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Testers")
@js.native
class ResourceEditsTesters protected () extends js.Object {
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
  def get(): GaxiosPromise[SchemaTesters] = js.native
  def get(callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def get(params: ParamsResourceEditsTestersGet): GaxiosPromise[SchemaTesters] = js.native
  def get(params: ParamsResourceEditsTestersGet, callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def get(
    params: ParamsResourceEditsTestersGet,
    options: BodyResponseCallback[SchemaTesters],
    callback: BodyResponseCallback[SchemaTesters]
  ): Unit = js.native
  def get(params: ParamsResourceEditsTestersGet, options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def get(
    params: ParamsResourceEditsTestersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTesters]
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
  def patch(): GaxiosPromise[SchemaTesters] = js.native
  def patch(callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def patch(params: ParamsResourceEditsTestersPatch): GaxiosPromise[SchemaTesters] = js.native
  def patch(params: ParamsResourceEditsTestersPatch, callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def patch(
    params: ParamsResourceEditsTestersPatch,
    options: BodyResponseCallback[SchemaTesters],
    callback: BodyResponseCallback[SchemaTesters]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsTestersPatch, options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def patch(
    params: ParamsResourceEditsTestersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTesters]
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
  def update(): GaxiosPromise[SchemaTesters] = js.native
  def update(callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def update(params: ParamsResourceEditsTestersUpdate): GaxiosPromise[SchemaTesters] = js.native
  def update(params: ParamsResourceEditsTestersUpdate, callback: BodyResponseCallback[SchemaTesters]): Unit = js.native
  def update(
    params: ParamsResourceEditsTestersUpdate,
    options: BodyResponseCallback[SchemaTesters],
    callback: BodyResponseCallback[SchemaTesters]
  ): Unit = js.native
  def update(params: ParamsResourceEditsTestersUpdate, options: MethodOptions): GaxiosPromise[SchemaTesters] = js.native
  def update(
    params: ParamsResourceEditsTestersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTesters]
  ): Unit = js.native
}

