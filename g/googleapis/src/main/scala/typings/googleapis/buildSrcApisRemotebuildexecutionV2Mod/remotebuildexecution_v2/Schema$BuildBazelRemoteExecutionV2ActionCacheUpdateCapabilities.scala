package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the server/instance capabilities for updating the action cache.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities extends js.Object {
  var updateEnabled: js.UndefOr[Boolean] = js.native
}

object Schema$BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities {
  @scala.inline
  def apply(updateEnabled: js.UndefOr[Boolean] = js.undefined): Schema$BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateEnabled)) __obj.updateDynamic("updateEnabled")(updateEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities]
  }
}

