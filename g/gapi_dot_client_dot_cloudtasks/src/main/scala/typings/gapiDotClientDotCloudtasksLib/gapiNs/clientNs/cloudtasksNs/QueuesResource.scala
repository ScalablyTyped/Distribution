package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuesResource extends js.Object {
  var tasks: TasksResource
  /**
    * Creates a queue.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def create(request: gapiDotClientDotCloudtasksLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Queue]
  /**
    * Deletes a queue.
    *
    * This command will delete the queue even if it has tasks in it.
    *
    * Note: If you delete a queue, a queue with the same name can't be created
    * for 7 days.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def delete(request: gapiDotClientDotCloudtasksLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a queue. */
  def get(request: gapiDotClientDotCloudtasksLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Queue]
  /**
    * Gets the access control policy for a Queue.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    *
    * Authorization requires the following [Google IAM](/iam) permission on the
    * specified resource parent:
    *
    * &#42; `cloudtasks.queues.getIamPolicy`
    */
  def getIamPolicy(request: gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    */
  def list(request: gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[ListQueuesResponse]
  /**
    * Updates a queue.
    *
    * This method creates the queue if it does not exist and updates
    * the queue if it does exist.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def patch(request: gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Queue]
  /**
    * Pauses the queue.
    *
    * If a queue is paused then the system will stop executing the
    * tasks in the queue until it is resumed via
    * CloudTasks.ResumeQueue. Tasks can still be added when the
    * queue is paused. The state of the queue is stored in
    * Queue.queue_state; if paused it will be set to
    * Queue.QueueState.PAUSED.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def pause(request: gapiDotClientDotCloudtasksLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Queue]
  /**
    * Purges a queue by deleting all of its tasks.
    *
    * All tasks created before this method is called are permanently deleted.
    *
    * Purge operations can take up to one minute to take effect. Tasks
    * might be dispatched before the purge takes effect. A purge is irreversible.
    */
  def purge(request: gapiDotClientDotCloudtasksLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Queue]
  /**
    * Resume a queue.
    *
    * This method resumes a queue after it has been
    * Queue.QueueState.PAUSED or Queue.QueueState.DISABLED. The state of
    * a queue is stored in Queue.queue_state; after calling this method it
    * will be set to Queue.QueueState.RUNNING.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    *
    * WARNING: Resuming many high-QPS queues at the same time can
    * lead to target overloading. If you are resuming high-QPS
    * queues, follow the 500/50/5 pattern described in
    * [Managing Cloud Tasks Scaling Risks](/cloud-tasks/pdfs/managing-cloud-tasks-scaling-risks-2017-06-05.pdf).
    */
  def resume(request: gapiDotClientDotCloudtasksLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Queue]
  /**
    * Sets the access control policy for a Queue. Replaces any existing
    * policy.
    *
    * Authorization requires the following [Google IAM](/iam) permission on the
    * specified resource parent:
    *
    * &#42; `cloudtasks.queues.setIamPolicy`
    */
  def setIamPolicy(request: gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Returns permissions that a caller has on a Queue.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a google.rpc.Code.NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
}

object QueuesResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Queue]
    ],
    delete: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Queue]
    ],
    getIamPolicy: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    list: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListQueuesResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Queue]
    ],
    pause: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Queue]
    ],
    purge: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Queue]
    ],
    resume: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Queue]
    ],
    setIamPolicy: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    tasks: TasksResource,
    testIamPermissions: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
    ]
  ): QueuesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getIamPolicy")(getIamPolicy)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("purge")(purge)
    __obj.updateDynamic("resume")(resume)
    __obj.updateDynamic("setIamPolicy")(setIamPolicy)
    __obj.updateDynamic("tasks")(tasks)
    __obj.updateDynamic("testIamPermissions")(testIamPermissions)
    __obj.asInstanceOf[QueuesResource]
  }
}

