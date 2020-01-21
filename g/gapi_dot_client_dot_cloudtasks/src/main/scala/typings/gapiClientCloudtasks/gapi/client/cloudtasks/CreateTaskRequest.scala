package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTaskRequest extends js.Object {
  /**
    * The response_view specifies which subset of the Task will be
    * returned.
    *
    * By default response_view is Task.View.BASIC; not all
    * information is retrieved by default because some data, such as
    * payloads, might be desirable to return only when needed because
    * of its large size or because of the sensitivity of data that it
    * contains.
    *
    * Authorization for Task.View.FULL requires `cloudtasks.tasks.fullView`
    * [Google IAM](/iam/) permission on the
    * Task.name resource.
    */
  var responseView: js.UndefOr[String] = js.undefined
  /**
    * Required.
    *
    * The task to add.
    *
    * Task names have the following format:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
    * The user can optionally specify a name for the task in
    * Task.name. If a name is not specified then the system will
    * generate a random unique task id, which will be returned in the
    * response's Task.name.
    *
    * If Task.schedule_time is not set or is in the past then Cloud
    * Tasks will set it to the current time.
    *
    * Task De-duplication:
    *
    * Explicitly specifying a task ID enables task de-duplication.  If
    * a task's ID is identical to that of an existing task or a task
    * that was deleted or completed recently then the call will fail
    * with google.rpc.Code.ALREADY_EXISTS. If the task's queue was
    * created using Cloud Tasks, then another task with the same name
    * can't be created for ~1hour after the original task was deleted
    * or completed. If the task's queue was created using queue.yaml or
    * queue.xml, then another task with the same name can't be created
    * for ~9days after the original task was deleted or completed.
    *
    * Because there is an extra lookup cost to identify duplicate task
    * names, these CloudTasks.CreateTask calls have significantly
    * increased latency. Using hashed strings for the task id or for
    * the prefix of the task id is recommended. Choosing task ids that
    * are sequential or have sequential prefixes, for example using a
    * timestamp, causes an increase in latency and error rates in all
    * task commands. The infrastructure relies on an approximately
    * uniform distribution of task ids to store and serve tasks
    * efficiently.
    */
  var task: js.UndefOr[Task] = js.undefined
}

object CreateTaskRequest {
  @scala.inline
  def apply(responseView: String = null, task: Task = null): CreateTaskRequest = {
    val __obj = js.Dynamic.literal()
    if (responseView != null) __obj.updateDynamic("responseView")(responseView.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskRequest]
  }
}

