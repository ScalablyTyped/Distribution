package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/driveactivity/v2", "driveactivity_v2.Resource$Activity")
@js.native
class Resource$Activity protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * driveactivity.activity.query
    * @desc Query past activity in Google Drive.
    * @alias driveactivity.activity.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().QueryDriveActivityRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[Schema$QueryDriveActivityResponse] = js.native
  def query(callback: BodyResponseCallback[Schema$QueryDriveActivityResponse]): Unit = js.native
  def query(params: ParamsDollarResourceDollarActivityDollarQuery): GaxiosPromise[Schema$QueryDriveActivityResponse] = js.native
  def query(
    params: ParamsDollarResourceDollarActivityDollarQuery,
    callback: BodyResponseCallback[Schema$QueryDriveActivityResponse]
  ): Unit = js.native
  def query(
    params: ParamsDollarResourceDollarActivityDollarQuery,
    options: BodyResponseCallback[Schema$QueryDriveActivityResponse],
    callback: BodyResponseCallback[Schema$QueryDriveActivityResponse]
  ): Unit = js.native
  def query(params: ParamsDollarResourceDollarActivityDollarQuery, options: MethodOptions): GaxiosPromise[Schema$QueryDriveActivityResponse] = js.native
  def query(
    params: ParamsDollarResourceDollarActivityDollarQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$QueryDriveActivityResponse]
  ): Unit = js.native
}

