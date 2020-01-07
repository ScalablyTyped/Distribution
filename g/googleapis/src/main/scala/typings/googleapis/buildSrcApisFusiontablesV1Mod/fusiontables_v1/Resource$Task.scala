package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v1", "fusiontables_v1.Resource$Task")
@js.native
class Resource$Task protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.task.delete
    * @desc Deletes the task, unless already started.
    * @alias fusiontables.task.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table from which the task is being deleted.
    * @param {string} params.taskId
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTaskDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarTaskDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTaskDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTaskDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTaskDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * fusiontables.task.get
    * @desc Retrieves a specific task by its id.
    * @alias fusiontables.task.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table to which the task belongs.
    * @param {string} params.taskId
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Task] = js.native
  def get(callback: BodyResponseCallback[Schema$Task]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTaskDollarGet): GaxiosPromise[Schema$Task] = js.native
  def get(params: ParamsDollarResourceDollarTaskDollarGet, callback: BodyResponseCallback[Schema$Task]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTaskDollarGet,
    options: BodyResponseCallback[Schema$Task],
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTaskDollarGet, options: MethodOptions): GaxiosPromise[Schema$Task] = js.native
  def get(
    params: ParamsDollarResourceDollarTaskDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  /**
    * fusiontables.task.list
    * @desc Retrieves a list of tasks.
    * @alias fusiontables.task.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of columns to return. Optional. Default is 5.
    * @param {string=} params.pageToken
    * @param {integer=} params.startIndex
    * @param {string} params.tableId Table whose tasks are being listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TaskList] = js.native
  def list(callback: BodyResponseCallback[Schema$TaskList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTaskDollarList): GaxiosPromise[Schema$TaskList] = js.native
  def list(params: ParamsDollarResourceDollarTaskDollarList, callback: BodyResponseCallback[Schema$TaskList]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTaskDollarList,
    options: BodyResponseCallback[Schema$TaskList],
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTaskDollarList, options: MethodOptions): GaxiosPromise[Schema$TaskList] = js.native
  def list(
    params: ParamsDollarResourceDollarTaskDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
}

