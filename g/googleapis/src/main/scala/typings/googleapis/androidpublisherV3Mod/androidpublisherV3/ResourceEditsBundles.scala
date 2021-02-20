package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Bundles")
@js.native
class ResourceEditsBundles protected () extends StObject {
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
  def list(): GaxiosPromise[SchemaBundlesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaBundlesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBundlesListResponse] = js.native
  def list(params: ParamsResourceEditsBundlesList): GaxiosPromise[SchemaBundlesListResponse] = js.native
  def list(params: ParamsResourceEditsBundlesList, callback: BodyResponseCallback[SchemaBundlesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEditsBundlesList,
    options: BodyResponseCallback[SchemaBundlesListResponse],
    callback: BodyResponseCallback[SchemaBundlesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsBundlesList, options: MethodOptions): GaxiosPromise[SchemaBundlesListResponse] = js.native
  def list(
    params: ParamsResourceEditsBundlesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBundlesListResponse]
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
  def upload(): GaxiosPromise[SchemaBundle] = js.native
  def upload(callback: BodyResponseCallback[SchemaBundle]): Unit = js.native
  def upload(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBundle] = js.native
  def upload(params: ParamsResourceEditsBundlesUpload): GaxiosPromise[SchemaBundle] = js.native
  def upload(params: ParamsResourceEditsBundlesUpload, callback: BodyResponseCallback[SchemaBundle]): Unit = js.native
  def upload(
    params: ParamsResourceEditsBundlesUpload,
    options: BodyResponseCallback[SchemaBundle],
    callback: BodyResponseCallback[SchemaBundle]
  ): Unit = js.native
  def upload(params: ParamsResourceEditsBundlesUpload, options: MethodOptions): GaxiosPromise[SchemaBundle] = js.native
  def upload(
    params: ParamsResourceEditsBundlesUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBundle]
  ): Unit = js.native
}
