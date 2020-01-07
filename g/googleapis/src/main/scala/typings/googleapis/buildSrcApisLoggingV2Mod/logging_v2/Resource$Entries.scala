package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Entries")
@js.native
class Resource$Entries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * logging.entries.list
    * @desc Lists log entries. Use this method to retrieve log entries that
    * originated from a project/folder/organization/billing account. For ways
    * to export log entries, see Exporting Logs.
    * @alias logging.entries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ListLogEntriesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListLogEntriesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListLogEntriesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEntriesDollarList): GaxiosPromise[Schema$ListLogEntriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEntriesDollarList,
    callback: BodyResponseCallback[Schema$ListLogEntriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEntriesDollarList,
    options: BodyResponseCallback[Schema$ListLogEntriesResponse],
    callback: BodyResponseCallback[Schema$ListLogEntriesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEntriesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListLogEntriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEntriesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListLogEntriesResponse]
  ): Unit = js.native
  /**
    * logging.entries.write
    * @desc Writes log entries to Logging. This API method is the only way to
    * send log entries to Logging. This method is used, directly or indirectly,
    * by the Logging agent (fluentd) and all logging libraries configured to
    * use Logging. A single request may contain log entries for a maximum of
    * 1000 different resources (projects, organizations, billing accounts or
    * folders)
    * @alias logging.entries.write
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().WriteLogEntriesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def write(): GaxiosPromise[Schema$WriteLogEntriesResponse] = js.native
  def write(callback: BodyResponseCallback[Schema$WriteLogEntriesResponse]): Unit = js.native
  def write(params: ParamsDollarResourceDollarEntriesDollarWrite): GaxiosPromise[Schema$WriteLogEntriesResponse] = js.native
  def write(
    params: ParamsDollarResourceDollarEntriesDollarWrite,
    callback: BodyResponseCallback[Schema$WriteLogEntriesResponse]
  ): Unit = js.native
  def write(
    params: ParamsDollarResourceDollarEntriesDollarWrite,
    options: BodyResponseCallback[Schema$WriteLogEntriesResponse],
    callback: BodyResponseCallback[Schema$WriteLogEntriesResponse]
  ): Unit = js.native
  def write(params: ParamsDollarResourceDollarEntriesDollarWrite, options: MethodOptions): GaxiosPromise[Schema$WriteLogEntriesResponse] = js.native
  def write(
    params: ParamsDollarResourceDollarEntriesDollarWrite,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WriteLogEntriesResponse]
  ): Unit = js.native
}

