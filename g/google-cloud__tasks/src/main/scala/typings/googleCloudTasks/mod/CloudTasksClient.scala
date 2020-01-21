package typings.googleCloudTasks.mod

import typings.googleCloudTasks.googleCloudTasksStrings.appEngineHttpQueue
import typings.googleCloudTasks.googleCloudTasksStrings.name
import typings.googleCloudTasks.googleCloudTasksStrings.queue
import typings.googleCloudTasks.googleCloudTasksStrings.rateLimits
import typings.googleCloudTasks.googleCloudTasksStrings.retryConfig
import typings.node.streamMod.Transform
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudTasksClient extends js.Object {
  var auth: GoogleAuth = js.native
  /**
    * Creates a queue.
    *
    * Queues created with this method allow tasks to live for a maximum of 31
    * days. After a task is 31 days old, the task will be deleted regardless of whether
    * it was dispatched or not.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name in which the queue will be created.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    *
    *   The list of allowed locations can be obtained by calling Cloud
    *   Tasks' implementation of
    *   ListLocations.
    * @param request.queue
    *   Required.
    *
    *   The queue to create.
    *
    *   Queue's name cannot be the same as an existing queue.
    *
    *   This object should have the same structure as [Queue]{@link google.cloud.tasks.v2beta3.Queue}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    * const queue = {};
    * const request = {
    *   parent: formattedParent,
    *   queue: queue,
    * };
    * client.createQueue(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("createQueue")
  var createQueue_Original: MethodOverload[CreateNamedRequest[queue, Partial[Queue]], Queue] = js.native
  /**
    * Creates a task and adds it to a queue.
    *
    * Tasks cannot be updated after creation; there is no UpdateTask command.
    *
    * * For App Engine queues, the maximum task size is
    *   100KB.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    *
    *   The queue must already exist.
    * @param request.task
    *   Required.
    *
    *   The task to add.
    *
    *   Task names have the following format:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
    *   The user can optionally specify a task name. If a
    *   name is not specified then the system will generate a random
    *   unique task id, which will be set in the task returned in the
    *   response.
    *
    *   If schedule_time is not set or is in the
    *   past then Cloud Tasks will set it to the current time.
    *
    *   Task De-duplication:
    *
    *   Explicitly specifying a task ID enables task de-duplication.  If
    *   a task's ID is identical to that of an existing task or a task
    *   that was deleted or executed recently then the call will fail
    *   with ALREADY_EXISTS.
    *   If the task's queue was created using Cloud Tasks, then another task with
    *   the same name can't be created for ~1hour after the original task was
    *   deleted or executed. If the task's queue was created using queue.yaml or
    *   queue.xml, then another task with the same name can't be created
    *   for ~9days after the original task was deleted or executed.
    *
    *   Because there is an extra lookup cost to identify duplicate task
    *   names, these CreateTask calls have significantly
    *   increased latency. Using hashed strings for the task id or for
    *   the prefix of the task id is recommended. Choosing task ids that
    *   are sequential or have sequential prefixes, for example using a
    *   timestamp, causes an increase in latency and error rates in all
    *   task commands. The infrastructure relies on an approximately
    *   uniform distribution of task ids to store and serve tasks
    *   efficiently.
    *
    *   This object should have the same structure as [Task]{@link google.cloud.tasks.v2beta3.Task}
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const task = {};
    * const request = {
    *   parent: formattedParent,
    *   task: task,
    * };
    * client.createTask(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("createTask")
  var createTask_Original: MethodOverload[CreateTaskRequest, Task] = js.native
  /**
    * Deletes a queue.
    *
    * This command will delete the queue even if it has tasks in it.
    *
    * Note: If you delete a queue, a queue with the same name can't be created
    * for 7 days.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.deleteQueue({name: formattedName}).catch(err => {
    *   console.error(err);
    * });
    */
  @JSName("deleteQueue")
  var deleteQueue_Original: MethodOverload[NamedRequest, Unit] = js.native
  /**
    * Deletes a task.
    *
    * A task can be deleted if it is scheduled or dispatched. A task
    * cannot be deleted if it has executed successfully or permanently
    * failed.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.deleteTask({name: formattedName}).catch(err => {
    *   console.error(err);
    * });
    */
  @JSName("deleteTask")
  var deleteTask_Original: MethodOverload[NamedRequest, Unit] = js.native
  /**
    * Gets the access control policy for a Queue.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    *
    * Authorization requires the following
    * [Google IAM](https://cloud.google.com/iam) permission on the specified
    * resource parent:
    *
    * * `cloudtasks.queues.getIamPolicy`
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy is being requested.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.getIamPolicy({resource: formattedResource})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("getIamPolicy")
  var getIamPolicy_Original: MethodOverload[ResourceRequest, Policy] = js.native
  /**
    * Gets a queue.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The resource name of the queue. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.getQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("getQueue")
  var getQueue_Original: MethodOverload[NamedRequest, Queue] = js.native
  /**
    * Gets a task.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.getTask({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("getTask")
  var getTask_Original: MethodOverload[NamedRequest with RunTaskRequest, Task] = js.native
  // -------------------
  // -- Service calls --
  // -------------------
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    * @param [request.filter]
    *   `filter` can be used to specify a subset of queues. Any Queue
    *   field can be used as a filter and several operators as supported.
    *   For example: `<=, <, >=, >, !=, =, :`. The filter syntax is the same as
    *   described in
    *   [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
    *
    *   Sample filter "state: PAUSED".
    *
    *   Note that using filters might cause fewer queues than the
    *   requested page_size to be returned.
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *   The first element of the array is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    * client.listQueues({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listQueues(nextRequest, options).then(callback);
    *   }
    * }
    * client.listQueues({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("listQueues")
  var listQueues_Original: PaginatedMethodOverload[ListRequestObject, js.Array[Queue], ListQueuesResponse, ListRequestObject] = js.native
  /**
    * Lists the tasks in a queue.
    *
    * By default, only the BASIC view is retrieved
    * due to performance considerations;
    * response_view controls the
    * subset of information which is returned.
    *
    * The tasks may be returned in any order. The ordering may change at any
    * time.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *   The first element of the array is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Task]{@link google.cloud.tasks.v2beta3.Task} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    * client.listTasks({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listTasks(nextRequest, options).then(callback);
    *   }
    * }
    * client.listTasks({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("listTasks")
  var listTasks_Original: PaginatedMethodOverload[
    ListRequestObject with RunTaskRequest, 
    js.Array[Task], 
    ListTasksResponse, 
    ListRequestObject with RunTaskRequest
  ] = js.native
  /**
    * Pauses the queue.
    *
    * If a queue is paused then the system will stop dispatching tasks
    * until the queue is resumed via
    * ResumeQueue. Tasks can still be added
    * when the queue is paused. A queue is paused if its
    * state is PAUSED.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.pauseQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("pauseQueue")
  var pauseQueue_Original: MethodOverload[NamedRequest, Queue] = js.native
  /**
    * Purges a queue by deleting all of its tasks.
    *
    * All tasks created before this method is called are permanently deleted.
    *
    * Purge operations can take up to one minute to take effect. Tasks
    * might be dispatched before the purge takes effect. A purge is irreversible.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.purgeQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("purgeQueue")
  var purgeQueue_Original: MethodOverload[NamedRequest, Queue] = js.native
  /**
    * Resume a queue.
    *
    * This method resumes a queue after it has been
    * PAUSED or
    * DISABLED. The state of a queue is stored
    * in the queue's state; after calling this method it
    * will be set to RUNNING.
    *
    * WARNING: Resuming many high-QPS queues at the same time can
    * lead to target overloading. If you are resuming high-QPS
    * queues, follow the 500/50/5 pattern described in
    * [Managing Cloud Tasks Scaling Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.resumeQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("resumeQueue")
  var resumeQueue_Original: MethodOverload[NamedRequest, Queue] = js.native
  /**
    * Forces a task to run now.
    *
    * When this method is called, Cloud Tasks will dispatch the task, even if
    * the task is already running, the queue has reached its RateLimits or
    * is PAUSED.
    *
    * This command is meant to be used for manual debugging. For
    * example, RunTask can be used to retry a failed
    * task after a fix has been made or to manually force a task to be
    * dispatched now.
    *
    * The dispatched task is returned. That is, the task that is returned
    * contains the status after the task is dispatched but
    * before the task is received by its target.
    *
    * If Cloud Tasks receives a successful response from the task's
    * target, then the task will be deleted; otherwise the task's
    * schedule_time will be reset to the time that
    * RunTask was called plus the retry delay specified
    * in the queue's RetryConfig.
    *
    * RunTask returns
    * NOT_FOUND when it is called on a
    * task that has already succeeded or permanently failed.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.runTask({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("runTask")
  var runTask_Original: MethodOverload[NamedRequest with RunTaskRequest, Task] = js.native
  /**
    * Sets the access control policy for a Queue. Replaces any existing
    * policy.
    *
    * Note: The Cloud Console does not check queue-level IAM permissions yet.
    * Project-level permissions are required to use the Cloud Console.
    *
    * Authorization requires the following
    * [Google IAM](https://cloud.google.com/iam) permission on the specified
    * resource parent:
    *
    * * `cloudtasks.queues.setIamPolicy`
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy is being specified.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param request.policy
    *   REQUIRED: The complete policy to be applied to the `resource`. The size of
    *   the policy is limited to a few 10s of KB. An empty policy is a
    *   valid policy but certain Cloud Platform services (such as Projects)
    *   might reject them.
    *
    *   This object should have the same structure as [Policy]{@link google.iam.v1.Policy}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const policy = {};
    * const request = {
    *   resource: formattedResource,
    *   policy: policy,
    * };
    * client.setIamPolicy(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("setIamPolicy")
  var setIamPolicy_Original: MethodOverload[ResourceRequest with SetIamPolicyRequest, Policy] = js.native
  /**
    * Returns permissions that a caller has on a Queue.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy detail is being requested.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param request.permissions
    *   The set of permissions to check for the `resource`. Permissions with
    *   wildcards (such as '*' or 'storage.*') are not allowed. For more
    *   information see
    *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
    *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const permissions = [];
    * const request = {
    *   resource: formattedResource,
    *   permissions: permissions,
    * };
    * client.testIamPermissions(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("testIamPermissions")
  var testIamPermissions_Original: MethodOverload[ResourceRequest with TestIamPermissionsRequest, TestIamPermissionsResponse] = js.native
  /**
    * Updates a queue.
    *
    * This method creates the queue if it does not exist and updates
    * the queue if it does exist.
    *
    * Queues created with this method allow tasks to live for a maximum of 31
    * days. After a task is 31 days old, the task will be deleted regardless of whether
    * it was dispatched or not.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.queue
    *   Required.
    *
    *   The queue to create or update.
    *
    *   The queue's name must be specified.
    *
    *   Output only fields cannot be modified using UpdateQueue.
    *   Any value specified for an output only field will be ignored.
    *   The queue's name cannot be changed.
    *
    *   This object should have the same structure as [Queue]{@link google.cloud.tasks.v2beta3.Queue}
    * @param [request.updateMask]
    *   A mask used to specify which fields of the queue are being updated.
    *
    *   If empty, then all fields will be updated.
    *
    *   This object should have the same structure as [FieldMask]{@link google.protobuf.FieldMask}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const queue = {};
    * client.updateQueue({queue: queue})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("updateQueue")
  var updateQueue_Original: MethodOverload[
    UpdateNamedRequest[queue, EnhancedPick[Queue, name, appEngineHttpQueue | rateLimits | retryConfig]], 
    Queue
  ] = js.native
  /**
    * Creates a queue.
    *
    * Queues created with this method allow tasks to live for a maximum of 31
    * days. After a task is 31 days old, the task will be deleted regardless of whether
    * it was dispatched or not.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name in which the queue will be created.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    *
    *   The list of allowed locations can be obtained by calling Cloud
    *   Tasks' implementation of
    *   ListLocations.
    * @param request.queue
    *   Required.
    *
    *   The queue to create.
    *
    *   Queue's name cannot be the same as an existing queue.
    *
    *   This object should have the same structure as [Queue]{@link google.cloud.tasks.v2beta3.Queue}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    * const queue = {};
    * const request = {
    *   parent: formattedParent,
    *   queue: queue,
    * };
    * client.createQueue(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("createQueue")
  def createQueue_queue(data: CreateNamedRequest[queue, Partial[Queue]]): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Creates a queue.
    *
    * Queues created with this method allow tasks to live for a maximum of 31
    * days. After a task is 31 days old, the task will be deleted regardless of whether
    * it was dispatched or not.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name in which the queue will be created.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    *
    *   The list of allowed locations can be obtained by calling Cloud
    *   Tasks' implementation of
    *   ListLocations.
    * @param request.queue
    *   Required.
    *
    *   The queue to create.
    *
    *   Queue's name cannot be the same as an existing queue.
    *
    *   This object should have the same structure as [Queue]{@link google.cloud.tasks.v2beta3.Queue}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    * const queue = {};
    * const request = {
    *   parent: formattedParent,
    *   queue: queue,
    * };
    * client.createQueue(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("createQueue")
  def createQueue_queue(data: CreateNamedRequest[queue, Partial[Queue]], callback: APICallback[Queue]): Unit = js.native
  @JSName("createQueue")
  def createQueue_queue(data: CreateNamedRequest[queue, Partial[Queue]], options: CallOptions): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Creates a queue.
    *
    * Queues created with this method allow tasks to live for a maximum of 31
    * days. After a task is 31 days old, the task will be deleted regardless of whether
    * it was dispatched or not.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name in which the queue will be created.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    *
    *   The list of allowed locations can be obtained by calling Cloud
    *   Tasks' implementation of
    *   ListLocations.
    * @param request.queue
    *   Required.
    *
    *   The queue to create.
    *
    *   Queue's name cannot be the same as an existing queue.
    *
    *   This object should have the same structure as [Queue]{@link google.cloud.tasks.v2beta3.Queue}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    * const queue = {};
    * const request = {
    *   parent: formattedParent,
    *   queue: queue,
    * };
    * client.createQueue(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  @JSName("createQueue")
  def createQueue_queue(
    data: CreateNamedRequest[queue, Partial[Queue]],
    options: CallOptions,
    callback: APICallback[Queue]
  ): Unit = js.native
  /**
    * Creates a task and adds it to a queue.
    *
    * Tasks cannot be updated after creation; there is no UpdateTask command.
    *
    * * For App Engine queues, the maximum task size is
    *   100KB.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    *
    *   The queue must already exist.
    * @param request.task
    *   Required.
    *
    *   The task to add.
    *
    *   Task names have the following format:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
    *   The user can optionally specify a task name. If a
    *   name is not specified then the system will generate a random
    *   unique task id, which will be set in the task returned in the
    *   response.
    *
    *   If schedule_time is not set or is in the
    *   past then Cloud Tasks will set it to the current time.
    *
    *   Task De-duplication:
    *
    *   Explicitly specifying a task ID enables task de-duplication.  If
    *   a task's ID is identical to that of an existing task or a task
    *   that was deleted or executed recently then the call will fail
    *   with ALREADY_EXISTS.
    *   If the task's queue was created using Cloud Tasks, then another task with
    *   the same name can't be created for ~1hour after the original task was
    *   deleted or executed. If the task's queue was created using queue.yaml or
    *   queue.xml, then another task with the same name can't be created
    *   for ~9days after the original task was deleted or executed.
    *
    *   Because there is an extra lookup cost to identify duplicate task
    *   names, these CreateTask calls have significantly
    *   increased latency. Using hashed strings for the task id or for
    *   the prefix of the task id is recommended. Choosing task ids that
    *   are sequential or have sequential prefixes, for example using a
    *   timestamp, causes an increase in latency and error rates in all
    *   task commands. The infrastructure relies on an approximately
    *   uniform distribution of task ids to store and serve tasks
    *   efficiently.
    *
    *   This object should have the same structure as [Task]{@link google.cloud.tasks.v2beta3.Task}
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const task = {};
    * const request = {
    *   parent: formattedParent,
    *   task: task,
    * };
    * client.createTask(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def createTask(data: CreateTaskRequest): PromiseLike[js.Array[Task]] = js.native
  /**
    * Creates a task and adds it to a queue.
    *
    * Tasks cannot be updated after creation; there is no UpdateTask command.
    *
    * * For App Engine queues, the maximum task size is
    *   100KB.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    *
    *   The queue must already exist.
    * @param request.task
    *   Required.
    *
    *   The task to add.
    *
    *   Task names have the following format:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
    *   The user can optionally specify a task name. If a
    *   name is not specified then the system will generate a random
    *   unique task id, which will be set in the task returned in the
    *   response.
    *
    *   If schedule_time is not set or is in the
    *   past then Cloud Tasks will set it to the current time.
    *
    *   Task De-duplication:
    *
    *   Explicitly specifying a task ID enables task de-duplication.  If
    *   a task's ID is identical to that of an existing task or a task
    *   that was deleted or executed recently then the call will fail
    *   with ALREADY_EXISTS.
    *   If the task's queue was created using Cloud Tasks, then another task with
    *   the same name can't be created for ~1hour after the original task was
    *   deleted or executed. If the task's queue was created using queue.yaml or
    *   queue.xml, then another task with the same name can't be created
    *   for ~9days after the original task was deleted or executed.
    *
    *   Because there is an extra lookup cost to identify duplicate task
    *   names, these CreateTask calls have significantly
    *   increased latency. Using hashed strings for the task id or for
    *   the prefix of the task id is recommended. Choosing task ids that
    *   are sequential or have sequential prefixes, for example using a
    *   timestamp, causes an increase in latency and error rates in all
    *   task commands. The infrastructure relies on an approximately
    *   uniform distribution of task ids to store and serve tasks
    *   efficiently.
    *
    *   This object should have the same structure as [Task]{@link google.cloud.tasks.v2beta3.Task}
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const task = {};
    * const request = {
    *   parent: formattedParent,
    *   task: task,
    * };
    * client.createTask(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def createTask(data: CreateTaskRequest, callback: APICallback[Task]): Unit = js.native
  def createTask(data: CreateTaskRequest, options: CallOptions): PromiseLike[js.Array[Task]] = js.native
  /**
    * Creates a task and adds it to a queue.
    *
    * Tasks cannot be updated after creation; there is no UpdateTask command.
    *
    * * For App Engine queues, the maximum task size is
    *   100KB.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    *
    *   The queue must already exist.
    * @param request.task
    *   Required.
    *
    *   The task to add.
    *
    *   Task names have the following format:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`.
    *   The user can optionally specify a task name. If a
    *   name is not specified then the system will generate a random
    *   unique task id, which will be set in the task returned in the
    *   response.
    *
    *   If schedule_time is not set or is in the
    *   past then Cloud Tasks will set it to the current time.
    *
    *   Task De-duplication:
    *
    *   Explicitly specifying a task ID enables task de-duplication.  If
    *   a task's ID is identical to that of an existing task or a task
    *   that was deleted or executed recently then the call will fail
    *   with ALREADY_EXISTS.
    *   If the task's queue was created using Cloud Tasks, then another task with
    *   the same name can't be created for ~1hour after the original task was
    *   deleted or executed. If the task's queue was created using queue.yaml or
    *   queue.xml, then another task with the same name can't be created
    *   for ~9days after the original task was deleted or executed.
    *
    *   Because there is an extra lookup cost to identify duplicate task
    *   names, these CreateTask calls have significantly
    *   increased latency. Using hashed strings for the task id or for
    *   the prefix of the task id is recommended. Choosing task ids that
    *   are sequential or have sequential prefixes, for example using a
    *   timestamp, causes an increase in latency and error rates in all
    *   task commands. The infrastructure relies on an approximately
    *   uniform distribution of task ids to store and serve tasks
    *   efficiently.
    *
    *   This object should have the same structure as [Task]{@link google.cloud.tasks.v2beta3.Task}
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const task = {};
    * const request = {
    *   parent: formattedParent,
    *   task: task,
    * };
    * client.createTask(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def createTask(data: CreateTaskRequest, options: CallOptions, callback: APICallback[Task]): Unit = js.native
  /**
    * Deletes a queue.
    *
    * This command will delete the queue even if it has tasks in it.
    *
    * Note: If you delete a queue, a queue with the same name can't be created
    * for 7 days.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.deleteQueue({name: formattedName}).catch(err => {
    *   console.error(err);
    * });
    */
  def deleteQueue(data: NamedRequest): PromiseLike[js.Array[Unit]] = js.native
  /**
    * Deletes a queue.
    *
    * This command will delete the queue even if it has tasks in it.
    *
    * Note: If you delete a queue, a queue with the same name can't be created
    * for 7 days.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.deleteQueue({name: formattedName}).catch(err => {
    *   console.error(err);
    * });
    */
  def deleteQueue(data: NamedRequest, callback: APICallback[Unit]): Unit = js.native
  def deleteQueue(data: NamedRequest, options: CallOptions): PromiseLike[js.Array[Unit]] = js.native
  /**
    * Deletes a queue.
    *
    * This command will delete the queue even if it has tasks in it.
    *
    * Note: If you delete a queue, a queue with the same name can't be created
    * for 7 days.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.deleteQueue({name: formattedName}).catch(err => {
    *   console.error(err);
    * });
    */
  def deleteQueue(data: NamedRequest, options: CallOptions, callback: APICallback[Unit]): Unit = js.native
  /**
    * Deletes a task.
    *
    * A task can be deleted if it is scheduled or dispatched. A task
    * cannot be deleted if it has executed successfully or permanently
    * failed.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.deleteTask({name: formattedName}).catch(err => {
    *   console.error(err);
    * });
    */
  def deleteTask(data: NamedRequest): PromiseLike[js.Array[Unit]] = js.native
  /**
    * Deletes a task.
    *
    * A task can be deleted if it is scheduled or dispatched. A task
    * cannot be deleted if it has executed successfully or permanently
    * failed.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.deleteTask({name: formattedName}).catch(err => {
    *   console.error(err);
    * });
    */
  def deleteTask(data: NamedRequest, callback: APICallback[Unit]): Unit = js.native
  def deleteTask(data: NamedRequest, options: CallOptions): PromiseLike[js.Array[Unit]] = js.native
  /**
    * Deletes a task.
    *
    * A task can be deleted if it is scheduled or dispatched. A task
    * cannot be deleted if it has executed successfully or permanently
    * failed.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.deleteTask({name: formattedName}).catch(err => {
    *   console.error(err);
    * });
    */
  def deleteTask(data: NamedRequest, options: CallOptions, callback: APICallback[Unit]): Unit = js.native
  /**
    * Gets the access control policy for a Queue.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    *
    * Authorization requires the following
    * [Google IAM](https://cloud.google.com/iam) permission on the specified
    * resource parent:
    *
    * * `cloudtasks.queues.getIamPolicy`
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy is being requested.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.getIamPolicy({resource: formattedResource})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def getIamPolicy(data: ResourceRequest): PromiseLike[js.Array[Policy]] = js.native
  /**
    * Gets the access control policy for a Queue.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    *
    * Authorization requires the following
    * [Google IAM](https://cloud.google.com/iam) permission on the specified
    * resource parent:
    *
    * * `cloudtasks.queues.getIamPolicy`
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy is being requested.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.getIamPolicy({resource: formattedResource})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def getIamPolicy(data: ResourceRequest, callback: APICallback[Policy]): Unit = js.native
  def getIamPolicy(data: ResourceRequest, options: CallOptions): PromiseLike[js.Array[Policy]] = js.native
  /**
    * Gets the access control policy for a Queue.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    *
    * Authorization requires the following
    * [Google IAM](https://cloud.google.com/iam) permission on the specified
    * resource parent:
    *
    * * `cloudtasks.queues.getIamPolicy`
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy is being requested.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.getIamPolicy({resource: formattedResource})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def getIamPolicy(data: ResourceRequest, options: CallOptions, callback: APICallback[Policy]): Unit = js.native
  /**
    * Return the project ID used by this class.
    * @param callback - the callback to
    *   be called with the current project Id.
    */
  def getProjectId(): PromiseLike[String] = js.native
  def getProjectId(callback: ProjectIdCallback): Unit = js.native
  /**
    * Gets a queue.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The resource name of the queue. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.getQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def getQueue(data: NamedRequest): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Gets a queue.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The resource name of the queue. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.getQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def getQueue(data: NamedRequest, callback: APICallback[Queue]): Unit = js.native
  def getQueue(data: NamedRequest, options: CallOptions): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Gets a queue.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The resource name of the queue. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.getQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def getQueue(data: NamedRequest, options: CallOptions, callback: APICallback[Queue]): Unit = js.native
  /**
    * Gets a task.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.getTask({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def getTask(data: NamedRequest with RunTaskRequest): PromiseLike[js.Array[Task]] = js.native
  /**
    * Gets a task.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.getTask({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def getTask(data: NamedRequest with RunTaskRequest, callback: APICallback[Task]): Unit = js.native
  def getTask(data: NamedRequest with RunTaskRequest, options: CallOptions): PromiseLike[js.Array[Task]] = js.native
  /**
    * Gets a task.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.getTask({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def getTask(data: NamedRequest with RunTaskRequest, options: CallOptions, callback: APICallback[Task]): Unit = js.native
  // -------------------
  // -- Service calls --
  // -------------------
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    * @param [request.filter]
    *   `filter` can be used to specify a subset of queues. Any Queue
    *   field can be used as a filter and several operators as supported.
    *   For example: `<=, <, >=, >, !=, =, :`. The filter syntax is the same as
    *   described in
    *   [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
    *
    *   Sample filter "state: PAUSED".
    *
    *   Note that using filters might cause fewer queues than the
    *   requested page_size to be returned.
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *   The first element of the array is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    * client.listQueues({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listQueues(nextRequest, options).then(callback);
    *   }
    * }
    * client.listQueues({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listQueues(data: ListRequestObject): PromiseLike[js.Array[js.Array[Queue]]] = js.native
  // -------------------
  // -- Service calls --
  // -------------------
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    * @param [request.filter]
    *   `filter` can be used to specify a subset of queues. Any Queue
    *   field can be used as a filter and several operators as supported.
    *   For example: `<=, <, >=, >, !=, =, :`. The filter syntax is the same as
    *   described in
    *   [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
    *
    *   Sample filter "state: PAUSED".
    *
    *   Note that using filters might cause fewer queues than the
    *   requested page_size to be returned.
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *   The first element of the array is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    * client.listQueues({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listQueues(nextRequest, options).then(callback);
    *   }
    * }
    * client.listQueues({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listQueues(data: ListRequestObject, callback: APICallback[js.Array[Queue]]): Unit = js.native
  def listQueues(data: ListRequestObject, options: CallOptions): PromiseLike[js.Array[js.Array[Queue]]] = js.native
  // -------------------
  // -- Service calls --
  // -------------------
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    * @param [request.filter]
    *   `filter` can be used to specify a subset of queues. Any Queue
    *   field can be used as a filter and several operators as supported.
    *   For example: `<=, <, >=, >, !=, =, :`. The filter syntax is the same as
    *   described in
    *   [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
    *
    *   Sample filter "state: PAUSED".
    *
    *   Note that using filters might cause fewer queues than the
    *   requested page_size to be returned.
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *   The first element of the array is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    * client.listQueues({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listQueues(nextRequest, options).then(callback);
    *   }
    * }
    * client.listQueues({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listQueues(data: ListRequestObject, options: CallOptionsWithPagination): PromiseLike[js.Tuple3[js.Array[Queue], ListRequestObject, ListQueuesResponse]] = js.native
  // -------------------
  // -- Service calls --
  // -------------------
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    * @param [request.filter]
    *   `filter` can be used to specify a subset of queues. Any Queue
    *   field can be used as a filter and several operators as supported.
    *   For example: `<=, <, >=, >, !=, =, :`. The filter syntax is the same as
    *   described in
    *   [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
    *
    *   Sample filter "state: PAUSED".
    *
    *   Note that using filters might cause fewer queues than the
    *   requested page_size to be returned.
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *   The first element of the array is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    * client.listQueues({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listQueues(nextRequest, options).then(callback);
    *   }
    * }
    * client.listQueues({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listQueues(
    data: ListRequestObject,
    options: CallOptionsWithPagination,
    callback: APIPaginatedCallback[js.Array[Queue], ListRequestObject, ListQueuesResponse]
  ): Unit = js.native
  // -------------------
  // -- Service calls --
  // -------------------
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    * @param [request.filter]
    *   `filter` can be used to specify a subset of queues. Any Queue
    *   field can be used as a filter and several operators as supported.
    *   For example: `<=, <, >=, >, !=, =, :`. The filter syntax is the same as
    *   described in
    *   [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
    *
    *   Sample filter "state: PAUSED".
    *
    *   Note that using filters might cause fewer queues than the
    *   requested page_size to be returned.
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *   The first element of the array is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Queue]{@link google.cloud.tasks.v2beta3.Queue} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListQueuesResponse]{@link google.cloud.tasks.v2beta3.ListQueuesResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    * client.listQueues({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listQueues(nextRequest, options).then(callback);
    *   }
    * }
    * client.listQueues({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listQueues(data: ListRequestObject, options: CallOptions, callback: APICallback[js.Array[Queue]]): Unit = js.native
  /**
    * Equivalent to {@link listQueues}, but returns a NodeJS Stream object.
    *
    * This fetches the paged responses for {@link listQueues} continuously
    * and invokes the callback registered for 'data' event for each element in the
    * responses.
    *
    * The returned object has 'end' method when no more elements are required.
    *
    * autoPaginate option will be ignored.
    *
    * @see {@link https://nodejs.org/api/stream.html}
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The location name.
    *   For example: `projects/PROJECT_ID/locations/LOCATION_ID`
    * @param [request.filter]
    *   `filter` can be used to specify a subset of queues. Any Queue
    *   field can be used as a filter and several operators as supported.
    *   For example: `<=, <, >=, >, !=, =, :`. The filter syntax is the same as
    *   described in
    *   [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
    *
    *   Sample filter "state: PAUSED".
    *
    *   Note that using filters might cause fewer queues than the
    *   requested page_size to be returned.
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    *   An object stream which emits an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue} on 'data' event.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.locationPath('[PROJECT]', '[LOCATION]');
    * client.listQueuesStream({parent: formattedParent})
    *   .on('data', element => {
    *     // doThingsWith(element)
    *   }).on('error', err => {
    *     console.log(err);
    *   });
    */
  def listQueuesStream(request: ListRequestObject): Transform = js.native
  def listQueuesStream(request: ListRequestObject, options: CallOptions): Transform = js.native
  /**
    * Lists the tasks in a queue.
    *
    * By default, only the BASIC view is retrieved
    * due to performance considerations;
    * response_view controls the
    * subset of information which is returned.
    *
    * The tasks may be returned in any order. The ordering may change at any
    * time.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *   The first element of the array is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Task]{@link google.cloud.tasks.v2beta3.Task} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    * client.listTasks({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listTasks(nextRequest, options).then(callback);
    *   }
    * }
    * client.listTasks({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listTasks(data: ListRequestObject with RunTaskRequest): PromiseLike[js.Array[js.Array[Task]]] = js.native
  /**
    * Lists the tasks in a queue.
    *
    * By default, only the BASIC view is retrieved
    * due to performance considerations;
    * response_view controls the
    * subset of information which is returned.
    *
    * The tasks may be returned in any order. The ordering may change at any
    * time.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *   The first element of the array is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Task]{@link google.cloud.tasks.v2beta3.Task} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    * client.listTasks({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listTasks(nextRequest, options).then(callback);
    *   }
    * }
    * client.listTasks({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listTasks(data: ListRequestObject with RunTaskRequest, callback: APICallback[js.Array[Task]]): Unit = js.native
  def listTasks(data: ListRequestObject with RunTaskRequest, options: CallOptions): PromiseLike[js.Array[js.Array[Task]]] = js.native
  /**
    * Lists the tasks in a queue.
    *
    * By default, only the BASIC view is retrieved
    * due to performance considerations;
    * response_view controls the
    * subset of information which is returned.
    *
    * The tasks may be returned in any order. The ordering may change at any
    * time.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *   The first element of the array is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Task]{@link google.cloud.tasks.v2beta3.Task} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    * client.listTasks({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listTasks(nextRequest, options).then(callback);
    *   }
    * }
    * client.listTasks({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listTasks(data: ListRequestObject with RunTaskRequest, options: CallOptionsWithPagination): PromiseLike[
    js.Tuple3[js.Array[Task], ListRequestObject with RunTaskRequest, ListTasksResponse]
  ] = js.native
  /**
    * Lists the tasks in a queue.
    *
    * By default, only the BASIC view is retrieved
    * due to performance considerations;
    * response_view controls the
    * subset of information which is returned.
    *
    * The tasks may be returned in any order. The ordering may change at any
    * time.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *   The first element of the array is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Task]{@link google.cloud.tasks.v2beta3.Task} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    * client.listTasks({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listTasks(nextRequest, options).then(callback);
    *   }
    * }
    * client.listTasks({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listTasks(
    data: ListRequestObject with RunTaskRequest,
    options: CallOptionsWithPagination,
    callback: APIPaginatedCallback[js.Array[Task], ListRequestObject with RunTaskRequest, ListTasksResponse]
  ): Unit = js.native
  /**
    * Lists the tasks in a queue.
    *
    * By default, only the BASIC view is retrieved
    * due to performance considerations;
    * response_view controls the
    * subset of information which is returned.
    *
    * The tasks may be returned in any order. The ordering may change at any
    * time.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, it contains the result
    *   in a single response. If the response indicates the next page exists, the third
    *   parameter is set to be used for the next request object. The fourth parameter keeps
    *   the raw response object of an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *   The first element of the array is Array of [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *
    *   When autoPaginate: false is specified through options, the array has three elements.
    *   The first element is Array of [Task]{@link google.cloud.tasks.v2beta3.Task} in a single response.
    *   The second element is the next request object if the response
    *   indicates the next page exists, or null. The third element is
    *   an object representing [ListTasksResponse]{@link google.cloud.tasks.v2beta3.ListTasksResponse}.
    *
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * // Iterate over all elements.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    * client.listTasks({parent: formattedParent})
    *   .then(responses => {
    *     const resources = responses[0];
    *     for (let i = 0; i < resources.length; i += 1) {
    *       // doThingsWith(resources[i])
    *     }
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    *
    * // Or obtain the paged response.
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    *
    *
    * const options = {autoPaginate: false};
    * const callback = responses => {
    *   // The actual resources in a response.
    *   const resources = responses[0];
    *   // The next request if the response shows that there are more responses.
    *   const nextRequest = responses[1];
    *   // The actual response object, if necessary.
    *   // const rawResponse = responses[2];
    *   for (let i = 0; i < resources.length; i += 1) {
    *     // doThingsWith(resources[i]);
    *   }
    *   if (nextRequest) {
    *     // Fetch the next page.
    *     return client.listTasks(nextRequest, options).then(callback);
    *   }
    * }
    * client.listTasks({parent: formattedParent}, options)
    *   .then(callback)
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def listTasks(
    data: ListRequestObject with RunTaskRequest,
    options: CallOptions,
    callback: APICallback[js.Array[Task]]
  ): Unit = js.native
  /**
    * Equivalent to {@link listTasks}, but returns a NodeJS Stream object.
    *
    * This fetches the paged responses for {@link listTasks} continuously
    * and invokes the callback registered for 'data' event for each element in the
    * responses.
    *
    * The returned object has 'end' method when no more elements are required.
    *
    * autoPaginate option will be ignored.
    *
    * @see {@link https://nodejs.org/api/stream.html}
    *
    * @param request
    *   The request object that will be sent.
    * @param request.parent
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [request.pageSize]
    *   The maximum number of resources contained in the underlying API
    *   response. If page streaming is performed per-resource, this
    *   parameter does not affect the return value. If page streaming is
    *   performed per-page, this determines the maximum number of
    *   resources in a page.
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    *   An object stream which emits an object representing [Task]{@link google.cloud.tasks.v2beta3.Task} on 'data' event.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedParent = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.listTasksStream({parent: formattedParent})
    *   .on('data', element => {
    *     // doThingsWith(element)
    *   }).on('error', err => {
    *     console.log(err);
    *   });
    */
  def listTasksStream(request: ListRequestObject with RunTaskRequest): Transform = js.native
  def listTasksStream(request: ListRequestObject with RunTaskRequest, options: CallOptions): Transform = js.native
  /**
    * Return a fully-qualified location resource name string.
    *
    * @param project
    * @param location
    */
  def locationPath(project: String, location: String): String = js.native
  /**
    * Parse the locationName from a location resource.
    *
    * @param locationName
    *   A fully-qualified path representing a location resources.
    */
  def matchLocationFromLocationName(locationName: String): String = js.native
  /**
    * Parse the queueName from a queue resource.
    *
    * @param queueName
    *   A fully-qualified path representing a queue resources.
    */
  def matchLocationFromQueueName(queueName: String): String = js.native
  /**
    * Parse the taskName from a task resource.
    *
    * @param taskName
    *   A fully-qualified path representing a task resources.
    */
  def matchLocationFromTaskName(taskName: String): String = js.native
  /**
    * Parse the locationName from a location resource.
    *
    * @param locationName
    *   A fully-qualified path representing a location resources.
    */
  def matchProjectFromLocationName(locationName: String): String = js.native
  /**
    * Parse the projectName from a project resource.
    *
    * @param projectName
    *   A fully-qualified path representing a project resources.
    */
  def matchProjectFromProjectName(projectName: String): String = js.native
  /**
    * Parse the queueName from a queue resource.
    *
    * @param queueName
    *   A fully-qualified path representing a queue resources.
    */
  def matchProjectFromQueueName(queueName: String): String = js.native
  /**
    * Parse the taskName from a task resource.
    *
    * @param taskName
    *   A fully-qualified path representing a task resources.
    */
  def matchProjectFromTaskName(taskName: String): String = js.native
  /**
    * Parse the queueName from a queue resource.
    *
    * @param queueName
    *   A fully-qualified path representing a queue resources.
    */
  def matchQueueFromQueueName(queueName: String): String = js.native
  /**
    * Parse the taskName from a task resource.
    *
    * @param taskName
    *   A fully-qualified path representing a task resources.
    */
  def matchQueueFromTaskName(taskName: String): String = js.native
  /**
    * Parse the taskName from a task resource.
    *
    * @param taskName
    *   A fully-qualified path representing a task resources.
    */
  def matchTaskFromTaskName(taskName: String): String = js.native
  /**
    * Pauses the queue.
    *
    * If a queue is paused then the system will stop dispatching tasks
    * until the queue is resumed via
    * ResumeQueue. Tasks can still be added
    * when the queue is paused. A queue is paused if its
    * state is PAUSED.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.pauseQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def pauseQueue(data: NamedRequest): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Pauses the queue.
    *
    * If a queue is paused then the system will stop dispatching tasks
    * until the queue is resumed via
    * ResumeQueue. Tasks can still be added
    * when the queue is paused. A queue is paused if its
    * state is PAUSED.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.pauseQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def pauseQueue(data: NamedRequest, callback: APICallback[Queue]): Unit = js.native
  def pauseQueue(data: NamedRequest, options: CallOptions): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Pauses the queue.
    *
    * If a queue is paused then the system will stop dispatching tasks
    * until the queue is resumed via
    * ResumeQueue. Tasks can still be added
    * when the queue is paused. A queue is paused if its
    * state is PAUSED.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.pauseQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def pauseQueue(data: NamedRequest, options: CallOptions, callback: APICallback[Queue]): Unit = js.native
  // --------------------
  // -- Path templates --
  // --------------------
  /**
    * Return a fully-qualified project resource name string.
    *
    * @param project
    */
  def projectPath(project: String): String = js.native
  /**
    * Purges a queue by deleting all of its tasks.
    *
    * All tasks created before this method is called are permanently deleted.
    *
    * Purge operations can take up to one minute to take effect. Tasks
    * might be dispatched before the purge takes effect. A purge is irreversible.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.purgeQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def purgeQueue(data: NamedRequest): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Purges a queue by deleting all of its tasks.
    *
    * All tasks created before this method is called are permanently deleted.
    *
    * Purge operations can take up to one minute to take effect. Tasks
    * might be dispatched before the purge takes effect. A purge is irreversible.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.purgeQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def purgeQueue(data: NamedRequest, callback: APICallback[Queue]): Unit = js.native
  def purgeQueue(data: NamedRequest, options: CallOptions): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Purges a queue by deleting all of its tasks.
    *
    * All tasks created before this method is called are permanently deleted.
    *
    * Purge operations can take up to one minute to take effect. Tasks
    * might be dispatched before the purge takes effect. A purge is irreversible.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.purgeQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def purgeQueue(data: NamedRequest, options: CallOptions, callback: APICallback[Queue]): Unit = js.native
  /**
    * Return a fully-qualified queue resource name string.
    *
    * @param project
    * @param location
    * @param queue
    */
  def queuePath(project: String, location: String, queue: String): String = js.native
  /**
    * Resume a queue.
    *
    * This method resumes a queue after it has been
    * PAUSED or
    * DISABLED. The state of a queue is stored
    * in the queue's state; after calling this method it
    * will be set to RUNNING.
    *
    * WARNING: Resuming many high-QPS queues at the same time can
    * lead to target overloading. If you are resuming high-QPS
    * queues, follow the 500/50/5 pattern described in
    * [Managing Cloud Tasks Scaling Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.resumeQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def resumeQueue(data: NamedRequest): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Resume a queue.
    *
    * This method resumes a queue after it has been
    * PAUSED or
    * DISABLED. The state of a queue is stored
    * in the queue's state; after calling this method it
    * will be set to RUNNING.
    *
    * WARNING: Resuming many high-QPS queues at the same time can
    * lead to target overloading. If you are resuming high-QPS
    * queues, follow the 500/50/5 pattern described in
    * [Managing Cloud Tasks Scaling Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.resumeQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def resumeQueue(data: NamedRequest, callback: APICallback[Queue]): Unit = js.native
  def resumeQueue(data: NamedRequest, options: CallOptions): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Resume a queue.
    *
    * This method resumes a queue after it has been
    * PAUSED or
    * DISABLED. The state of a queue is stored
    * in the queue's state; after calling this method it
    * will be set to RUNNING.
    *
    * WARNING: Resuming many high-QPS queues at the same time can
    * lead to target overloading. If you are resuming high-QPS
    * queues, follow the 500/50/5 pattern described in
    * [Managing Cloud Tasks Scaling Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The queue name. For example:
    *   `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * client.resumeQueue({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def resumeQueue(data: NamedRequest, options: CallOptions, callback: APICallback[Queue]): Unit = js.native
  /**
    * Forces a task to run now.
    *
    * When this method is called, Cloud Tasks will dispatch the task, even if
    * the task is already running, the queue has reached its RateLimits or
    * is PAUSED.
    *
    * This command is meant to be used for manual debugging. For
    * example, RunTask can be used to retry a failed
    * task after a fix has been made or to manually force a task to be
    * dispatched now.
    *
    * The dispatched task is returned. That is, the task that is returned
    * contains the status after the task is dispatched but
    * before the task is received by its target.
    *
    * If Cloud Tasks receives a successful response from the task's
    * target, then the task will be deleted; otherwise the task's
    * schedule_time will be reset to the time that
    * RunTask was called plus the retry delay specified
    * in the queue's RetryConfig.
    *
    * RunTask returns
    * NOT_FOUND when it is called on a
    * task that has already succeeded or permanently failed.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.runTask({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def runTask(data: NamedRequest with RunTaskRequest): PromiseLike[js.Array[Task]] = js.native
  /**
    * Forces a task to run now.
    *
    * When this method is called, Cloud Tasks will dispatch the task, even if
    * the task is already running, the queue has reached its RateLimits or
    * is PAUSED.
    *
    * This command is meant to be used for manual debugging. For
    * example, RunTask can be used to retry a failed
    * task after a fix has been made or to manually force a task to be
    * dispatched now.
    *
    * The dispatched task is returned. That is, the task that is returned
    * contains the status after the task is dispatched but
    * before the task is received by its target.
    *
    * If Cloud Tasks receives a successful response from the task's
    * target, then the task will be deleted; otherwise the task's
    * schedule_time will be reset to the time that
    * RunTask was called plus the retry delay specified
    * in the queue's RetryConfig.
    *
    * RunTask returns
    * NOT_FOUND when it is called on a
    * task that has already succeeded or permanently failed.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.runTask({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def runTask(data: NamedRequest with RunTaskRequest, callback: APICallback[Task]): Unit = js.native
  def runTask(data: NamedRequest with RunTaskRequest, options: CallOptions): PromiseLike[js.Array[Task]] = js.native
  /**
    * Forces a task to run now.
    *
    * When this method is called, Cloud Tasks will dispatch the task, even if
    * the task is already running, the queue has reached its RateLimits or
    * is PAUSED.
    *
    * This command is meant to be used for manual debugging. For
    * example, RunTask can be used to retry a failed
    * task after a fix has been made or to manually force a task to be
    * dispatched now.
    *
    * The dispatched task is returned. That is, the task that is returned
    * contains the status after the task is dispatched but
    * before the task is received by its target.
    *
    * If Cloud Tasks receives a successful response from the task's
    * target, then the task will be deleted; otherwise the task's
    * schedule_time will be reset to the time that
    * RunTask was called plus the retry delay specified
    * in the queue's RetryConfig.
    *
    * RunTask returns
    * NOT_FOUND when it is called on a
    * task that has already succeeded or permanently failed.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.name
    *   Required.
    *
    *   The task name. For example:
    *   `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * @param [request.responseView]
    *   The response_view specifies which subset of the Task will be
    *   returned.
    *
    *   By default response_view is BASIC; not all
    *   information is retrieved by default because some data, such as
    *   payloads, might be desirable to return only when needed because
    *   of its large size or because of the sensitivity of data that it
    *   contains.
    *
    *   Authorization for FULL requires
    *   `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    *   permission on the Task resource.
    *
    *   The number should be among the values of [View]{@link google.cloud.tasks.v2beta3.View}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The first element of the array is an object representing [Task]{@link google.cloud.tasks.v2beta3.Task}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedName = client.taskPath('[PROJECT]', '[LOCATION]', '[QUEUE]', '[TASK]');
    * client.runTask({name: formattedName})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def runTask(data: NamedRequest with RunTaskRequest, options: CallOptions, callback: APICallback[Task]): Unit = js.native
  /**
    * Sets the access control policy for a Queue. Replaces any existing
    * policy.
    *
    * Note: The Cloud Console does not check queue-level IAM permissions yet.
    * Project-level permissions are required to use the Cloud Console.
    *
    * Authorization requires the following
    * [Google IAM](https://cloud.google.com/iam) permission on the specified
    * resource parent:
    *
    * * `cloudtasks.queues.setIamPolicy`
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy is being specified.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param request.policy
    *   REQUIRED: The complete policy to be applied to the `resource`. The size of
    *   the policy is limited to a few 10s of KB. An empty policy is a
    *   valid policy but certain Cloud Platform services (such as Projects)
    *   might reject them.
    *
    *   This object should have the same structure as [Policy]{@link google.iam.v1.Policy}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const policy = {};
    * const request = {
    *   resource: formattedResource,
    *   policy: policy,
    * };
    * client.setIamPolicy(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def setIamPolicy(data: ResourceRequest with SetIamPolicyRequest): PromiseLike[js.Array[Policy]] = js.native
  /**
    * Sets the access control policy for a Queue. Replaces any existing
    * policy.
    *
    * Note: The Cloud Console does not check queue-level IAM permissions yet.
    * Project-level permissions are required to use the Cloud Console.
    *
    * Authorization requires the following
    * [Google IAM](https://cloud.google.com/iam) permission on the specified
    * resource parent:
    *
    * * `cloudtasks.queues.setIamPolicy`
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy is being specified.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param request.policy
    *   REQUIRED: The complete policy to be applied to the `resource`. The size of
    *   the policy is limited to a few 10s of KB. An empty policy is a
    *   valid policy but certain Cloud Platform services (such as Projects)
    *   might reject them.
    *
    *   This object should have the same structure as [Policy]{@link google.iam.v1.Policy}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const policy = {};
    * const request = {
    *   resource: formattedResource,
    *   policy: policy,
    * };
    * client.setIamPolicy(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def setIamPolicy(data: ResourceRequest with SetIamPolicyRequest, callback: APICallback[Policy]): Unit = js.native
  def setIamPolicy(data: ResourceRequest with SetIamPolicyRequest, options: CallOptions): PromiseLike[js.Array[Policy]] = js.native
  /**
    * Sets the access control policy for a Queue. Replaces any existing
    * policy.
    *
    * Note: The Cloud Console does not check queue-level IAM permissions yet.
    * Project-level permissions are required to use the Cloud Console.
    *
    * Authorization requires the following
    * [Google IAM](https://cloud.google.com/iam) permission on the specified
    * resource parent:
    *
    * * `cloudtasks.queues.setIamPolicy`
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy is being specified.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param request.policy
    *   REQUIRED: The complete policy to be applied to the `resource`. The size of
    *   the policy is limited to a few 10s of KB. An empty policy is a
    *   valid policy but certain Cloud Platform services (such as Projects)
    *   might reject them.
    *
    *   This object should have the same structure as [Policy]{@link google.iam.v1.Policy}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const policy = {};
    * const request = {
    *   resource: formattedResource,
    *   policy: policy,
    * };
    * client.setIamPolicy(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def setIamPolicy(
    data: ResourceRequest with SetIamPolicyRequest,
    options: CallOptions,
    callback: APICallback[Policy]
  ): Unit = js.native
  /**
    * Return a fully-qualified task resource name string.
    *
    * @param project
    * @param location
    * @param queue
    * @param task
    */
  def taskPath(project: String, location: String, queue: String, task: String): String = js.native
  /**
    * Returns permissions that a caller has on a Queue.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy detail is being requested.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param request.permissions
    *   The set of permissions to check for the `resource`. Permissions with
    *   wildcards (such as '*' or 'storage.*') are not allowed. For more
    *   information see
    *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
    *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const permissions = [];
    * const request = {
    *   resource: formattedResource,
    *   permissions: permissions,
    * };
    * client.testIamPermissions(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def testIamPermissions(data: ResourceRequest with TestIamPermissionsRequest): PromiseLike[js.Array[TestIamPermissionsResponse]] = js.native
  /**
    * Returns permissions that a caller has on a Queue.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy detail is being requested.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param request.permissions
    *   The set of permissions to check for the `resource`. Permissions with
    *   wildcards (such as '*' or 'storage.*') are not allowed. For more
    *   information see
    *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
    *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const permissions = [];
    * const request = {
    *   resource: formattedResource,
    *   permissions: permissions,
    * };
    * client.testIamPermissions(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def testIamPermissions(
    data: ResourceRequest with TestIamPermissionsRequest,
    callback: APICallback[TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(data: ResourceRequest with TestIamPermissionsRequest, options: CallOptions): PromiseLike[js.Array[TestIamPermissionsResponse]] = js.native
  /**
    * Returns permissions that a caller has on a Queue.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.resource
    *   REQUIRED: The resource for which the policy detail is being requested.
    *   `resource` is usually specified as a path. For example, a Project
    *   resource is specified as `projects/{project}`.
    * @param request.permissions
    *   The set of permissions to check for the `resource`. Permissions with
    *   wildcards (such as '*' or 'storage.*') are not allowed. For more
    *   information see
    *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
    *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const formattedResource = client.queuePath('[PROJECT]', '[LOCATION]', '[QUEUE]');
    * const permissions = [];
    * const request = {
    *   resource: formattedResource,
    *   permissions: permissions,
    * };
    * client.testIamPermissions(request)
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def testIamPermissions(
    data: ResourceRequest with TestIamPermissionsRequest,
    options: CallOptions,
    callback: APICallback[TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Updates a queue.
    *
    * This method creates the queue if it does not exist and updates
    * the queue if it does exist.
    *
    * Queues created with this method allow tasks to live for a maximum of 31
    * days. After a task is 31 days old, the task will be deleted regardless of whether
    * it was dispatched or not.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.queue
    *   Required.
    *
    *   The queue to create or update.
    *
    *   The queue's name must be specified.
    *
    *   Output only fields cannot be modified using UpdateQueue.
    *   Any value specified for an output only field will be ignored.
    *   The queue's name cannot be changed.
    *
    *   This object should have the same structure as [Queue]{@link google.cloud.tasks.v2beta3.Queue}
    * @param [request.updateMask]
    *   A mask used to specify which fields of the queue are being updated.
    *
    *   If empty, then all fields will be updated.
    *
    *   This object should have the same structure as [FieldMask]{@link google.protobuf.FieldMask}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const queue = {};
    * client.updateQueue({queue: queue})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def updateQueue(
    data: UpdateNamedRequest[queue, EnhancedPick[Queue, name, appEngineHttpQueue | rateLimits | retryConfig]]
  ): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Updates a queue.
    *
    * This method creates the queue if it does not exist and updates
    * the queue if it does exist.
    *
    * Queues created with this method allow tasks to live for a maximum of 31
    * days. After a task is 31 days old, the task will be deleted regardless of whether
    * it was dispatched or not.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.queue
    *   Required.
    *
    *   The queue to create or update.
    *
    *   The queue's name must be specified.
    *
    *   Output only fields cannot be modified using UpdateQueue.
    *   Any value specified for an output only field will be ignored.
    *   The queue's name cannot be changed.
    *
    *   This object should have the same structure as [Queue]{@link google.cloud.tasks.v2beta3.Queue}
    * @param [request.updateMask]
    *   A mask used to specify which fields of the queue are being updated.
    *
    *   If empty, then all fields will be updated.
    *
    *   This object should have the same structure as [FieldMask]{@link google.protobuf.FieldMask}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const queue = {};
    * client.updateQueue({queue: queue})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def updateQueue(
    data: UpdateNamedRequest[queue, EnhancedPick[Queue, name, appEngineHttpQueue | rateLimits | retryConfig]],
    callback: APICallback[Queue]
  ): Unit = js.native
  def updateQueue(
    data: UpdateNamedRequest[queue, EnhancedPick[Queue, name, appEngineHttpQueue | rateLimits | retryConfig]],
    options: CallOptions
  ): PromiseLike[js.Array[Queue]] = js.native
  /**
    * Updates a queue.
    *
    * This method creates the queue if it does not exist and updates
    * the queue if it does exist.
    *
    * Queues created with this method allow tasks to live for a maximum of 31
    * days. After a task is 31 days old, the task will be deleted regardless of whether
    * it was dispatched or not.
    *
    * WARNING: Using this method may have unintended side effects if you are
    * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
    * Read
    * [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml)
    * before using this method.
    *
    * @param request
    *   The request object that will be sent.
    * @param request.queue
    *   Required.
    *
    *   The queue to create or update.
    *
    *   The queue's name must be specified.
    *
    *   Output only fields cannot be modified using UpdateQueue.
    *   Any value specified for an output only field will be ignored.
    *   The queue's name cannot be changed.
    *
    *   This object should have the same structure as [Queue]{@link google.cloud.tasks.v2beta3.Queue}
    * @param [request.updateMask]
    *   A mask used to specify which fields of the queue are being updated.
    *
    *   If empty, then all fields will be updated.
    *
    *   This object should have the same structure as [FieldMask]{@link google.protobuf.FieldMask}
    * @param [options]
    *   Optional parameters. You can override the default settings for this call, e.g, timeout,
    *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
    * @param [callback]
    *   The function which will be called with the result of the API call.
    *
    *   The second parameter to the callback is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The first element of the array is an object representing [Queue]{@link google.cloud.tasks.v2beta3.Queue}.
    *   The promise has a method named "cancel" which cancels the ongoing API call.
    *
    * @example
    *
    * import CloudTasks from '@google-cloud/tasks';
    *
    * const client = new tasks.v2beta3.CloudTasksClient({
    *   // optional auth parameters.
    * });
    *
    * const queue = {};
    * client.updateQueue({queue: queue})
    *   .then(responses => {
    *     const response = responses[0];
    *     // doThingsWith(response)
    *   })
    *   .catch(err => {
    *     console.error(err);
    *   });
    */
  def updateQueue(
    data: UpdateNamedRequest[queue, EnhancedPick[Queue, name, appEngineHttpQueue | rateLimits | retryConfig]],
    options: CallOptions,
    callback: APICallback[Queue]
  ): Unit = js.native
}

