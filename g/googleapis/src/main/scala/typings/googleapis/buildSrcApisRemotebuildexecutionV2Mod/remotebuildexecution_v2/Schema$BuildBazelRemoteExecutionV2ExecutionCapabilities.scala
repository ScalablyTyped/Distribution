package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Capabilities of the remote execution system.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2ExecutionCapabilities extends js.Object {
  /**
    * Remote execution may only support a single digest function.
    */
  var digestFunction: js.UndefOr[String] = js.native
  /**
    * Whether remote execution is enabled for the particular server/instance.
    */
  var execEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Supported execution priority range.
    */
  var executionPriorityCapabilities: js.UndefOr[Schema$BuildBazelRemoteExecutionV2PriorityCapabilities] = js.native
}

object Schema$BuildBazelRemoteExecutionV2ExecutionCapabilities {
  @scala.inline
  def apply(
    digestFunction: String = null,
    execEnabled: js.UndefOr[Boolean] = js.undefined,
    executionPriorityCapabilities: Schema$BuildBazelRemoteExecutionV2PriorityCapabilities = null
  ): Schema$BuildBazelRemoteExecutionV2ExecutionCapabilities = {
    val __obj = js.Dynamic.literal()
    if (digestFunction != null) __obj.updateDynamic("digestFunction")(digestFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(execEnabled)) __obj.updateDynamic("execEnabled")(execEnabled.asInstanceOf[js.Any])
    if (executionPriorityCapabilities != null) __obj.updateDynamic("executionPriorityCapabilities")(executionPriorityCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2ExecutionCapabilities]
  }
}

