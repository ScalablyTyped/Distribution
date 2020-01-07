package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits")
@js.native
class Resource$Edits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var apks: ResourceDollarEditsDollarApks = js.native
  var bundles: ResourceDollarEditsDollarBundles = js.native
  var context: APIRequestContext = js.native
  var deobfuscationfiles: ResourceDollarEditsDollarDeobfuscationfiles = js.native
  var details: ResourceDollarEditsDollarDetails = js.native
  var expansionfiles: ResourceDollarEditsDollarExpansionfiles = js.native
  var images: ResourceDollarEditsDollarImages = js.native
  var listings: ResourceDollarEditsDollarListings = js.native
  var testers: ResourceDollarEditsDollarTesters = js.native
  var tracks: ResourceDollarEditsDollarTracks = js.native
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
  def commit(): GaxiosPromise[Schema$AppEdit] = js.native
  def commit(callback: BodyResponseCallback[Schema$AppEdit]): Unit = js.native
  def commit(params: ParamsDollarResourceDollarEditsDollarCommit): GaxiosPromise[Schema$AppEdit] = js.native
  def commit(
    params: ParamsDollarResourceDollarEditsDollarCommit,
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
  def commit(
    params: ParamsDollarResourceDollarEditsDollarCommit,
    options: BodyResponseCallback[Schema$AppEdit],
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
  def commit(params: ParamsDollarResourceDollarEditsDollarCommit, options: MethodOptions): GaxiosPromise[Schema$AppEdit] = js.native
  def commit(
    params: ParamsDollarResourceDollarEditsDollarCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
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
  def delete(params: ParamsDollarResourceDollarEditsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarEditsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEditsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
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
  def get(): GaxiosPromise[Schema$AppEdit] = js.native
  def get(callback: BodyResponseCallback[Schema$AppEdit]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarGet): GaxiosPromise[Schema$AppEdit] = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarGet, callback: BodyResponseCallback[Schema$AppEdit]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarGet,
    options: BodyResponseCallback[Schema$AppEdit],
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarGet, options: MethodOptions): GaxiosPromise[Schema$AppEdit] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
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
  def insert(): GaxiosPromise[Schema$AppEdit] = js.native
  def insert(callback: BodyResponseCallback[Schema$AppEdit]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarEditsDollarInsert): GaxiosPromise[Schema$AppEdit] = js.native
  def insert(
    params: ParamsDollarResourceDollarEditsDollarInsert,
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarEditsDollarInsert,
    options: BodyResponseCallback[Schema$AppEdit],
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarEditsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$AppEdit] = js.native
  def insert(
    params: ParamsDollarResourceDollarEditsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
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
  def validate(): GaxiosPromise[Schema$AppEdit] = js.native
  def validate(callback: BodyResponseCallback[Schema$AppEdit]): Unit = js.native
  def validate(params: ParamsDollarResourceDollarEditsDollarValidate): GaxiosPromise[Schema$AppEdit] = js.native
  def validate(
    params: ParamsDollarResourceDollarEditsDollarValidate,
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
  def validate(
    params: ParamsDollarResourceDollarEditsDollarValidate,
    options: BodyResponseCallback[Schema$AppEdit],
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
  def validate(params: ParamsDollarResourceDollarEditsDollarValidate, options: MethodOptions): GaxiosPromise[Schema$AppEdit] = js.native
  def validate(
    params: ParamsDollarResourceDollarEditsDollarValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppEdit]
  ): Unit = js.native
}

