package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits")
@js.native
class ResourceEdits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var apks: ResourceEditsApks = js.native
  
  var bundles: ResourceEditsBundles = js.native
  
  /**
    * androidpublisher.edits.commit
    * @desc Commits/applies the changes made in this edit back to the app.
    * @alias androidpublisher.edits.commit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def commit(): GaxiosPromise[SchemaAppEdit] = js.native
  def commit(callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def commit(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def commit(params: ParamsResourceEditsCommit): GaxiosPromise[SchemaAppEdit] = js.native
  def commit(params: ParamsResourceEditsCommit, callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def commit(
    params: ParamsResourceEditsCommit,
    options: BodyResponseCallback[SchemaAppEdit],
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  def commit(params: ParamsResourceEditsCommit, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def commit(
    params: ParamsResourceEditsCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * androidpublisher.edits.delete
    * @desc Deletes an edit for an app. Creating a new edit will automatically
    * delete any of your previous edits so this method need only be called if
    * you want to preemptively abandon an edit.
    * @alias androidpublisher.edits.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEditsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEditsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  var deobfuscationfiles: ResourceEditsDeobfuscationfiles = js.native
  
  var details: ResourceEditsDetails = js.native
  
  var expansionfiles: ResourceEditsExpansionfiles = js.native
  
  /**
    * androidpublisher.edits.get
    * @desc Returns information about the edit specified. Calls will fail if
    * the edit is no long active (e.g. has been deleted, superseded or
    * expired).
    * @alias androidpublisher.edits.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAppEdit] = js.native
  def get(callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def get(params: ParamsResourceEditsGet): GaxiosPromise[SchemaAppEdit] = js.native
  def get(params: ParamsResourceEditsGet, callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def get(
    params: ParamsResourceEditsGet,
    options: BodyResponseCallback[SchemaAppEdit],
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  def get(params: ParamsResourceEditsGet, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def get(
    params: ParamsResourceEditsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  
  var images: ResourceEditsImages = js.native
  
  /**
    * androidpublisher.edits.insert
    * @desc Creates a new edit for an app, populated with the app's current
    * state.
    * @alias androidpublisher.edits.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().AppEdit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAppEdit] = js.native
  def insert(callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def insert(params: ParamsResourceEditsInsert): GaxiosPromise[SchemaAppEdit] = js.native
  def insert(params: ParamsResourceEditsInsert, callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def insert(
    params: ParamsResourceEditsInsert,
    options: BodyResponseCallback[SchemaAppEdit],
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  def insert(params: ParamsResourceEditsInsert, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def insert(
    params: ParamsResourceEditsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  
  var listings: ResourceEditsListings = js.native
  
  var testers: ResourceEditsTesters = js.native
  
  var tracks: ResourceEditsTracks = js.native
  
  /**
    * androidpublisher.edits.validate
    * @desc Checks that the edit can be successfully committed. The edit's
    * changes are not applied to the live app.
    * @alias androidpublisher.edits.validate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def validate(): GaxiosPromise[SchemaAppEdit] = js.native
  def validate(callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def validate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def validate(params: ParamsResourceEditsValidate): GaxiosPromise[SchemaAppEdit] = js.native
  def validate(params: ParamsResourceEditsValidate, callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def validate(
    params: ParamsResourceEditsValidate,
    options: BodyResponseCallback[SchemaAppEdit],
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  def validate(params: ParamsResourceEditsValidate, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def validate(
    params: ParamsResourceEditsValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
}
