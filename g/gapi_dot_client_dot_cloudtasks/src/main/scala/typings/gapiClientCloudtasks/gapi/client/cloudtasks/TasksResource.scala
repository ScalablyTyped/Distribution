package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudtasks.AnonAccesstoken
import typings.gapiClientCloudtasks.AnonAlt
import typings.gapiClientCloudtasks.AnonBearertoken
import typings.gapiClientCloudtasks.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksResource extends js.Object {
  /**
    * Acknowledges a pull task.
    *
    * The lease holder, that is, the entity that received this task in
    * a PullTasksResponse, must call this method to indicate that
    * the work associated with the task has finished.
    *
    * The lease holder must acknowledge a task within the
    * PullTasksRequest.lease_duration or the lease will expire and
    * the task will become ready to be returned in a different
    * PullTasksResponse. After the task is acknowledged, it will
    * not be returned by a later CloudTasks.PullTasks,
    * CloudTasks.GetTask, or CloudTasks.ListTasks.
    */
  def acknowledge(request: AnonAccesstoken): Request_[js.Object]
  /**
    * Cancel a pull task's lease.
    *
    * The lease holder can use this method to cancel a task's lease
    * by setting Task.schedule_time to now. This will make the task
    * available to be leased to the next caller of CloudTasks.PullTasks.
    */
  def cancelLease(request: AnonAccesstoken): Request_[Task]
  /**
    * Creates a task and adds it to a queue.
    *
    * To add multiple tasks at the same time, use
    * [HTTP batching](/storage/docs/json_api/v1/how-tos/batch)
    * or the batching documentation for your client library, for example
    * https://developers.google.com/api-client-library/python/guide/batch.
    *
    * Tasks cannot be updated after creation; there is no UpdateTask command.
    *
    * &#42; For [App Engine queues](google.cloud.tasks.v2beta2.AppEngineHttpTarget),
    * the maximum task size is 100KB.
    * &#42; For [pull queues](google.cloud.tasks.v2beta2.PullTarget), this
    * the maximum task size is 1MB.
    */
  def create(request: AnonAlt): Request_[Task]
  /**
    * Deletes a task.
    *
    * A task can be deleted if it is scheduled or dispatched. A task
    * cannot be deleted if it has completed successfully or permanently
    * failed.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets a task. */
  def get(request: AnonBearertoken): Request_[Task]
  /**
    * Lists the tasks in a queue.
    *
    * By default response_view is Task.View.BASIC; not all
    * information is retrieved by default due to performance
    * considerations; ListTasksRequest.response_view controls the
    * subset of information which is returned.
    */
  def list(request: AnonCallback): Request_[ListTasksResponse]
  /**
    * Pulls tasks from a pull queue and acquires a lease on them for a
    * specified PullTasksRequest.lease_duration.
    *
    * This method is invoked by the lease holder to obtain the
    * lease. The lease holder must acknowledge the task via
    * CloudTasks.AcknowledgeTask after they have performed the work
    * associated with the task.
    *
    * The payload is intended to store data that the lease holder needs
    * to perform the work associated with the task. To return the
    * payloads in the PullTasksResponse, set
    * PullTasksRequest.response_view to Task.View.FULL.
    *
    * A maximum of 10 qps of CloudTasks.PullTasks requests are allowed per
    * queue. google.rpc.Code.RESOURCE_EXHAUSTED is returned when this limit
    * is exceeded. google.rpc.Code.RESOURCE_EXHAUSTED is also returned when
    * RateLimits.max_tasks_dispatched_per_second is exceeded.
    */
  def pull(request: AnonAccesstoken): Request_[PullTasksResponse]
  /**
    * Renew the current lease of a pull task.
    *
    * The lease holder can use this method to extend the lease by a new
    * duration, starting from now. The new task lease will be
    * returned in Task.schedule_time.
    */
  def renewLease(request: AnonAccesstoken): Request_[Task]
  /**
    * Forces a task to run now.
    *
    * This command is meant to be used for manual debugging. For
    * example, CloudTasks.RunTask can be used to retry a failed
    * task after a fix has been made or to manually force a task to be
    * dispatched now.
    *
    * When this method is called, Cloud Tasks will dispatch the task to its
    * target, even if the queue is Queue.QueueState.PAUSED.
    *
    * The dispatched task is returned. That is, the task that is returned
    * contains the Task.task_status after the task is dispatched but
    * before the task is received by its target.
    *
    * If Cloud Tasks receives a successful response from the task's
    * handler, then the task will be deleted; otherwise the task's
    * Task.schedule_time will be reset to the time that
    * CloudTasks.RunTask was called plus the retry delay specified
    * in the queue and task's RetryConfig.
    *
    * CloudTasks.RunTask returns google.rpc.Code.NOT_FOUND when
    * it is called on a task that has already succeeded or permanently
    * failed. google.rpc.Code.FAILED_PRECONDITION is returned when
    * CloudTasks.RunTask is called on task that is dispatched or
    * already running.
    */
  def run(request: AnonAccesstoken): Request_[Task]
}

object TasksResource {
  @scala.inline
  def apply(
    acknowledge: AnonAccesstoken => Request_[js.Object],
    cancelLease: AnonAccesstoken => Request_[Task],
    create: AnonAlt => Request_[Task],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonBearertoken => Request_[Task],
    list: AnonCallback => Request_[ListTasksResponse],
    pull: AnonAccesstoken => Request_[PullTasksResponse],
    renewLease: AnonAccesstoken => Request_[Task],
    run: AnonAccesstoken => Request_[Task]
  ): TasksResource = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction1(acknowledge), cancelLease = js.Any.fromFunction1(cancelLease), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), pull = js.Any.fromFunction1(pull), renewLease = js.Any.fromFunction1(renewLease), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[TasksResource]
  }
}

