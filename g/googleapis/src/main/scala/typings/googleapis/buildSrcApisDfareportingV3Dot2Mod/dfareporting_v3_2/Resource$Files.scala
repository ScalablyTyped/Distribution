package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Files")
@js.native
class Resource$Files protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.files.get
    * @desc Retrieves a report file by its report ID and file ID. This method
    * supports media download.
    * @alias dfareporting.files.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the report file.
    * @param {string} params.reportId The ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$File] = js.native
  def get(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def get(params: ParamsDollarResourceDollarFilesDollarGet): GaxiosPromise[Schema$File] = js.native
  def get(params: ParamsDollarResourceDollarFilesDollarGet, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarFilesDollarGet,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarFilesDollarGet, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def get(
    params: ParamsDollarResourceDollarFilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * dfareporting.files.list
    * @desc Lists files for a user profile.
    * @alias dfareporting.files.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken The value of the nextToken from the previous result page.
    * @param {string} params.profileId The DFA profile ID.
    * @param {string=} params.scope The scope that defines which results are returned.
    * @param {string=} params.sortField The field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$FileList] = js.native
  def list(callback: BodyResponseCallback[Schema$FileList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarFilesDollarList): GaxiosPromise[Schema$FileList] = js.native
  def list(params: ParamsDollarResourceDollarFilesDollarList, callback: BodyResponseCallback[Schema$FileList]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarFilesDollarList,
    options: BodyResponseCallback[Schema$FileList],
    callback: BodyResponseCallback[Schema$FileList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarFilesDollarList, options: MethodOptions): GaxiosPromise[Schema$FileList] = js.native
  def list(
    params: ParamsDollarResourceDollarFilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FileList]
  ): Unit = js.native
}

