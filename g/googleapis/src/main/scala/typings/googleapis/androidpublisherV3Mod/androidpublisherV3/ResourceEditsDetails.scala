package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Details")
@js.native
class ResourceEditsDetails protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaAppDetails] = js.native
  def get(callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def get(params: ParamsResourceEditsDetailsGet): GaxiosPromise[SchemaAppDetails] = js.native
  def get(params: ParamsResourceEditsDetailsGet, callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def get(
    params: ParamsResourceEditsDetailsGet,
    options: BodyResponseCallback[SchemaAppDetails],
    callback: BodyResponseCallback[SchemaAppDetails]
  ): Unit = js.native
  def get(params: ParamsResourceEditsDetailsGet, options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def get(
    params: ParamsResourceEditsDetailsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppDetails]
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
  def patch(): GaxiosPromise[SchemaAppDetails] = js.native
  def patch(callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def patch(params: ParamsResourceEditsDetailsPatch): GaxiosPromise[SchemaAppDetails] = js.native
  def patch(params: ParamsResourceEditsDetailsPatch, callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def patch(
    params: ParamsResourceEditsDetailsPatch,
    options: BodyResponseCallback[SchemaAppDetails],
    callback: BodyResponseCallback[SchemaAppDetails]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsDetailsPatch, options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def patch(
    params: ParamsResourceEditsDetailsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppDetails]
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
  def update(): GaxiosPromise[SchemaAppDetails] = js.native
  def update(callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def update(params: ParamsResourceEditsDetailsUpdate): GaxiosPromise[SchemaAppDetails] = js.native
  def update(params: ParamsResourceEditsDetailsUpdate, callback: BodyResponseCallback[SchemaAppDetails]): Unit = js.native
  def update(
    params: ParamsResourceEditsDetailsUpdate,
    options: BodyResponseCallback[SchemaAppDetails],
    callback: BodyResponseCallback[SchemaAppDetails]
  ): Unit = js.native
  def update(params: ParamsResourceEditsDetailsUpdate, options: MethodOptions): GaxiosPromise[SchemaAppDetails] = js.native
  def update(
    params: ParamsResourceEditsDetailsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppDetails]
  ): Unit = js.native
}
