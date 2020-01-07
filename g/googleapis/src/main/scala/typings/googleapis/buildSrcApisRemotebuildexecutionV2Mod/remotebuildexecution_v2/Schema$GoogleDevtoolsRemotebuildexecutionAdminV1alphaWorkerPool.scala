package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A worker pool resource in the Remote Build Execution API.
  */
@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool extends js.Object {
  /**
    * WorkerPool resource name formatted as:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    * name should not be populated when creating a worker pool since it is
    * provided in the `poolId` field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. State of the worker pool.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Specifies the properties, such as machine type and disk size, used for
    * creating workers in a worker pool.
    */
  var workerConfig: js.UndefOr[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] = js.native
  /**
    * The desired number of workers in the worker pool. Must be a value between
    * 0 and 1000.
    */
  var workerCount: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool {
  @scala.inline
  def apply(
    name: String = null,
    state: String = null,
    workerConfig: Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig = null,
    workerCount: String = null
  ): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (workerConfig != null) __obj.updateDynamic("workerConfig")(workerConfig.asInstanceOf[js.Any])
    if (workerCount != null) __obj.updateDynamic("workerCount")(workerCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  }
}

