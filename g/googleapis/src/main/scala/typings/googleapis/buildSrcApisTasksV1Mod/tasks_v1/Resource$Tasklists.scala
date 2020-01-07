package typings.googleapis.buildSrcApisTasksV1Mod.tasks_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tasks/v1", "tasks_v1.Resource$Tasklists")
@js.native
class Resource$Tasklists protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tasks.tasklists.delete
    * @desc Deletes the authenticated user's specified task list.
    * @alias tasks.tasklists.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tasklist Task list identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTasklistsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarTasklistsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTasklistsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTasklistsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTasklistsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tasks.tasklists.get
    * @desc Returns the authenticated user's specified task list.
    * @alias tasks.tasklists.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tasklist Task list identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TaskList] = js.native
  def get(callback: BodyResponseCallback[Schema$TaskList]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTasklistsDollarGet): GaxiosPromise[Schema$TaskList] = js.native
  def get(
    params: ParamsDollarResourceDollarTasklistsDollarGet,
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTasklistsDollarGet,
    options: BodyResponseCallback[Schema$TaskList],
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTasklistsDollarGet, options: MethodOptions): GaxiosPromise[Schema$TaskList] = js.native
  def get(
    params: ParamsDollarResourceDollarTasklistsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  /**
    * tasks.tasklists.insert
    * @desc Creates a new task list and adds it to the authenticated user's
    * task lists.
    * @alias tasks.tasklists.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().TaskList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$TaskList] = js.native
  def insert(callback: BodyResponseCallback[Schema$TaskList]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTasklistsDollarInsert): GaxiosPromise[Schema$TaskList] = js.native
  def insert(
    params: ParamsDollarResourceDollarTasklistsDollarInsert,
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTasklistsDollarInsert,
    options: BodyResponseCallback[Schema$TaskList],
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTasklistsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$TaskList] = js.native
  def insert(
    params: ParamsDollarResourceDollarTasklistsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  /**
    * tasks.tasklists.list
    * @desc Returns all the authenticated user's task lists.
    * @alias tasks.tasklists.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.maxResults Maximum number of task lists returned on one page. Optional. The default is 20 (max allowed: 100).
    * @param {string=} params.pageToken Token specifying the result page to return. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TaskLists] = js.native
  def list(callback: BodyResponseCallback[Schema$TaskLists]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTasklistsDollarList): GaxiosPromise[Schema$TaskLists] = js.native
  def list(
    params: ParamsDollarResourceDollarTasklistsDollarList,
    callback: BodyResponseCallback[Schema$TaskLists]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTasklistsDollarList,
    options: BodyResponseCallback[Schema$TaskLists],
    callback: BodyResponseCallback[Schema$TaskLists]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTasklistsDollarList, options: MethodOptions): GaxiosPromise[Schema$TaskLists] = js.native
  def list(
    params: ParamsDollarResourceDollarTasklistsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TaskLists]
  ): Unit = js.native
  /**
    * tasks.tasklists.patch
    * @desc Updates the authenticated user's specified task list. This method
    * supports patch semantics.
    * @alias tasks.tasklists.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tasklist Task list identifier.
    * @param {().TaskList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$TaskList] = js.native
  def patch(callback: BodyResponseCallback[Schema$TaskList]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTasklistsDollarPatch): GaxiosPromise[Schema$TaskList] = js.native
  def patch(
    params: ParamsDollarResourceDollarTasklistsDollarPatch,
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarTasklistsDollarPatch,
    options: BodyResponseCallback[Schema$TaskList],
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTasklistsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$TaskList] = js.native
  def patch(
    params: ParamsDollarResourceDollarTasklistsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  /**
    * tasks.tasklists.update
    * @desc Updates the authenticated user's specified task list.
    * @alias tasks.tasklists.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tasklist Task list identifier.
    * @param {().TaskList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$TaskList] = js.native
  def update(callback: BodyResponseCallback[Schema$TaskList]): Unit = js.native
  def update(params: ParamsDollarResourceDollarTasklistsDollarUpdate): GaxiosPromise[Schema$TaskList] = js.native
  def update(
    params: ParamsDollarResourceDollarTasklistsDollarUpdate,
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarTasklistsDollarUpdate,
    options: BodyResponseCallback[Schema$TaskList],
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarTasklistsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$TaskList] = js.native
  def update(
    params: ParamsDollarResourceDollarTasklistsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TaskList]
  ): Unit = js.native
}

