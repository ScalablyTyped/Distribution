package typings.googleapis.buildSrcApisCloudtasksV2Mod.cloudtasks_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudtasks/v2", "cloudtasks_v2.Resource$Projects$Locations$Queues$Tasks")
@js.native
class ResourceDollarProjectsDollarLocationsDollarQueuesDollarTasks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudtasks.projects.locations.queues.tasks.create
    * @desc Creates a task and adds it to a queue.  Tasks cannot be updated
    * after creation; there is no UpdateTask command.  * For App Engine queues,
    * the maximum task size is   100KB.
    * @alias cloudtasks.projects.locations.queues.tasks.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`  The queue must already exist.
    * @param {().CreateTaskRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Task] = js.native
  def create(callback: BodyResponseCallback[Schema$Task]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarCreate): GaxiosPromise[Schema$Task] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarCreate,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarCreate,
    options: BodyResponseCallback[Schema$Task],
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Task] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  /**
    * cloudtasks.projects.locations.queues.tasks.delete
    * @desc Deletes a task.  A task can be deleted if it is scheduled or
    * dispatched. A task cannot be deleted if it has executed successfully or
    * permanently failed.
    * @alias cloudtasks.projects.locations.queues.tasks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * cloudtasks.projects.locations.queues.tasks.get
    * @desc Gets a task.
    * @alias cloudtasks.projects.locations.queues.tasks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param {string=} params.responseView The response_view specifies which subset of the Task will be returned.  By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains.  Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Task] = js.native
  def get(callback: BodyResponseCallback[Schema$Task]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarGet): GaxiosPromise[Schema$Task] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarGet,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarGet,
    options: BodyResponseCallback[Schema$Task],
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Task] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  /**
    * cloudtasks.projects.locations.queues.tasks.list
    * @desc Lists the tasks in a queue.  By default, only the BASIC view is
    * retrieved due to performance considerations; response_view controls the
    * subset of information which is returned.  The tasks may be returned in
    * any order. The ordering may change at any time.
    * @alias cloudtasks.projects.locations.queues.tasks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size. Fewer tasks than requested might be returned.  The maximum page size is 1000. If unspecified, the page size will be the maximum. Fewer tasks than requested might be returned, even if more tasks exist; use next_page_token in the response to determine if more tasks exist.
    * @param {string=} params.pageToken A token identifying the page of results to return.  To request the first page results, page_token must be empty. To request the next page of results, page_token must be the value of next_page_token returned from the previous call to ListTasks method.  The page token is valid for only 2 hours.
    * @param {string} params.parent Required.  The queue name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param {string=} params.responseView The response_view specifies which subset of the Task will be returned.  By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains.  Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTasksResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTasksResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarList): GaxiosPromise[Schema$ListTasksResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarList,
    callback: BodyResponseCallback[Schema$ListTasksResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarList,
    options: BodyResponseCallback[Schema$ListTasksResponse],
    callback: BodyResponseCallback[Schema$ListTasksResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTasksResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTasksResponse]
  ): Unit = js.native
  /**
    * cloudtasks.projects.locations.queues.tasks.run
    * @desc Forces a task to run now.  When this method is called, Cloud Tasks
    * will dispatch the task, even if the task is already running, the queue
    * has reached its RateLimits or is PAUSED.  This command is meant to be
    * used for manual debugging. For example, RunTask can be used to retry a
    * failed task after a fix has been made or to manually force a task to be
    * dispatched now.  The dispatched task is returned. That is, the task that
    * is returned contains the status after the task is dispatched but before
    * the task is received by its target.  If Cloud Tasks receives a successful
    * response from the task's target, then the task will be deleted; otherwise
    * the task's schedule_time will be reset to the time that RunTask was
    * called plus the retry delay specified in the queue's RetryConfig. RunTask
    * returns NOT_FOUND when it is called on a task that has already succeeded
    * or permanently failed.
    * @alias cloudtasks.projects.locations.queues.tasks.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param {().RunTaskRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[Schema$Task] = js.native
  def run(callback: BodyResponseCallback[Schema$Task]): Unit = js.native
  def run(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarRun): GaxiosPromise[Schema$Task] = js.native
  def run(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarRun,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def run(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarRun,
    options: BodyResponseCallback[Schema$Task],
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def run(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarRun,
    options: MethodOptions
  ): GaxiosPromise[Schema$Task] = js.native
  def run(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarQueuesDollarTasksDollarRun,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
}

