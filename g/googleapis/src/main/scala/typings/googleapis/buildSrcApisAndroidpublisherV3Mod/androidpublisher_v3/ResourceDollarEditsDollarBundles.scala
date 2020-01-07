package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Bundles")
@js.native
class ResourceDollarEditsDollarBundles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.bundles.list
    * @alias androidpublisher.edits.bundles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$BundlesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$BundlesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarBundlesDollarList): GaxiosPromise[Schema$BundlesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarBundlesDollarList,
    callback: BodyResponseCallback[Schema$BundlesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarBundlesDollarList,
    options: BodyResponseCallback[Schema$BundlesListResponse],
    callback: BodyResponseCallback[Schema$BundlesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEditsDollarBundlesDollarList, options: MethodOptions): GaxiosPromise[Schema$BundlesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEditsDollarBundlesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BundlesListResponse]
  ): Unit = js.native
  /**
    * androidpublisher.edits.bundles.upload
    * @desc Uploads a new Android App Bundle to this edit. If you are using the
    * Google API client libraries, please increase the timeout of the http
    * request before calling this endpoint (a timeout of 2 minutes is
    * recommended). See:
    * https://developers.google.com/api-client-library/java/google-api-java-client/errors
    * for an example in java.
    * @alias androidpublisher.edits.bundles.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.ackBundleInstallationWarning Must be set to true if the bundle installation may trigger a warning on user devices (for example, if installation size may be over a threshold, typically 100 MB).
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[Schema$Bundle] = js.native
  def upload(callback: BodyResponseCallback[Schema$Bundle]): Unit = js.native
  def upload(params: ParamsDollarResourceDollarEditsDollarBundlesDollarUpload): GaxiosPromise[Schema$Bundle] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarBundlesDollarUpload,
    callback: BodyResponseCallback[Schema$Bundle]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarBundlesDollarUpload,
    options: BodyResponseCallback[Schema$Bundle],
    callback: BodyResponseCallback[Schema$Bundle]
  ): Unit = js.native
  def upload(params: ParamsDollarResourceDollarEditsDollarBundlesDollarUpload, options: MethodOptions): GaxiosPromise[Schema$Bundle] = js.native
  def upload(
    params: ParamsDollarResourceDollarEditsDollarBundlesDollarUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Bundle]
  ): Unit = js.native
}

