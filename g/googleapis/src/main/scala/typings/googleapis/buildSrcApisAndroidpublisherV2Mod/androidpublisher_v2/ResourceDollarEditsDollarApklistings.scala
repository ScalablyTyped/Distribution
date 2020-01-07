package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Edits$Apklistings")
@js.native
class ResourceDollarEditsDollarApklistings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.apklistings.delete
    * @desc Deletes the APK-specific localized listing for a specified APK and
    * language code.
    * @alias androidpublisher.edits.apklistings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the APK-specific localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidpublisher.edits.apklistings.deleteall
    * @desc Deletes all the APK-specific localized listings for a specified
    * APK.
    * @alias androidpublisher.edits.apklistings.deleteall
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteall(): GaxiosPromise[Unit] = js.native
  def deleteall(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteall(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDeleteall): GaxiosPromise[Unit] = js.native
  def deleteall(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDeleteall,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteall(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDeleteall,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteall(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDeleteall, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteall(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarDeleteall,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidpublisher.edits.apklistings.get
    * @desc Fetches the APK-specific localized listing for a specified APK and
    * language code.
    * @alias androidpublisher.edits.apklistings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the APK-specific localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ApkListing] = js.native
  def get(callback: BodyResponseCallback[Schema$ApkListing]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarGet): GaxiosPromise[Schema$ApkListing] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarGet,
    callback: BodyResponseCallback[Schema$ApkListing]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarGet,
    options: BodyResponseCallback[Schema$ApkListing],
    callback: BodyResponseCallback[Schema$ApkListing]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ApkListing] = js.native
  def get(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ApkListing]
  ): Unit = js.native
  /**
    * androidpublisher.edits.apklistings.list
    * @desc Lists all the APK-specific localized listings for a specified APK.
    * @alias androidpublisher.edits.apklistings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ApkListingsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ApkListingsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarList): GaxiosPromise[Schema$ApkListingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarList,
    callback: BodyResponseCallback[Schema$ApkListingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarList,
    options: BodyResponseCallback[Schema$ApkListingsListResponse],
    callback: BodyResponseCallback[Schema$ApkListingsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarList, options: MethodOptions): GaxiosPromise[Schema$ApkListingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ApkListingsListResponse]
  ): Unit = js.native
  /**
    * androidpublisher.edits.apklistings.patch
    * @desc Updates or creates the APK-specific localized listing for a
    * specified APK and language code. This method supports patch semantics.
    * @alias androidpublisher.edits.apklistings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the APK-specific localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().ApkListing} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ApkListing] = js.native
  def patch(callback: BodyResponseCallback[Schema$ApkListing]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarPatch): GaxiosPromise[Schema$ApkListing] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarPatch,
    callback: BodyResponseCallback[Schema$ApkListing]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarPatch,
    options: BodyResponseCallback[Schema$ApkListing],
    callback: BodyResponseCallback[Schema$ApkListing]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ApkListing] = js.native
  def patch(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ApkListing]
  ): Unit = js.native
  /**
    * androidpublisher.edits.apklistings.update
    * @desc Updates or creates the APK-specific localized listing for a
    * specified APK and language code.
    * @alias androidpublisher.edits.apklistings.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the APK-specific localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().ApkListing} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ApkListing] = js.native
  def update(callback: BodyResponseCallback[Schema$ApkListing]): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarUpdate): GaxiosPromise[Schema$ApkListing] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarUpdate,
    callback: BodyResponseCallback[Schema$ApkListing]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarUpdate,
    options: BodyResponseCallback[Schema$ApkListing],
    callback: BodyResponseCallback[Schema$ApkListing]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarEditsDollarApklistingsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ApkListing] = js.native
  def update(
    params: ParamsDollarResourceDollarEditsDollarApklistingsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ApkListing]
  ): Unit = js.native
}

