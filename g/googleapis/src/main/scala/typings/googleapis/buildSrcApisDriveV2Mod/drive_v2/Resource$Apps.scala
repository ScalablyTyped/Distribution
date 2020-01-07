package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Apps")
@js.native
class Resource$Apps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.apps.get
    * @desc Gets a specific app.
    * @alias drive.apps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appId The ID of the app.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$App] = js.native
  def get(callback: BodyResponseCallback[Schema$App]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarGet): GaxiosPromise[Schema$App] = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarGet, callback: BodyResponseCallback[Schema$App]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarGet,
    options: BodyResponseCallback[Schema$App],
    callback: BodyResponseCallback[Schema$App]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarGet, options: MethodOptions): GaxiosPromise[Schema$App] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$App]
  ): Unit = js.native
  /**
    * drive.apps.list
    * @desc Lists a user's installed apps.
    * @alias drive.apps.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.appFilterExtensions A comma-separated list of file extensions for open with filtering. All apps within the given app query scope which can open any of the given file extensions will be included in the response. If appFilterMimeTypes are provided as well, the result is a union of the two resulting app lists.
    * @param {string=} params.appFilterMimeTypes A comma-separated list of MIME types for open with filtering. All apps within the given app query scope which can open any of the given MIME types will be included in the response. If appFilterExtensions are provided as well, the result is a union of the two resulting app lists.
    * @param {string=} params.languageCode A language or locale code, as defined by BCP 47, with some extensions from Unicode's LDML format (http://www.unicode.org/reports/tr35/).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AppList] = js.native
  def list(callback: BodyResponseCallback[Schema$AppList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarList): GaxiosPromise[Schema$AppList] = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarList, callback: BodyResponseCallback[Schema$AppList]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarList,
    options: BodyResponseCallback[Schema$AppList],
    callback: BodyResponseCallback[Schema$AppList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarList, options: MethodOptions): GaxiosPromise[Schema$AppList] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppList]
  ): Unit = js.native
}

