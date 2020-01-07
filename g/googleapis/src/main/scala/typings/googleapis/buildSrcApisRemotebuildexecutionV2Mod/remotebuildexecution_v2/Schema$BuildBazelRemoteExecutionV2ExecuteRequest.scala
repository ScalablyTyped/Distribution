package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for Execution.Execute.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2ExecuteRequest extends js.Object {
  /**
    * The digest of the Action to execute.
    */
  var actionDigest: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * An optional policy for execution of the action. The server will have a
    * default policy if this is not provided.
    */
  var executionPolicy: js.UndefOr[Schema$BuildBazelRemoteExecutionV2ExecutionPolicy] = js.native
  /**
    * An optional policy for the results of this execution in the remote cache.
    * The server will have a default policy if this is not provided. This may
    * be applied to both the ActionResult and the associated blobs.
    */
  var resultsCachePolicy: js.UndefOr[Schema$BuildBazelRemoteExecutionV2ResultsCachePolicy] = js.native
  /**
    * If true, the action will be executed anew even if its result was already
    * present in the cache. If false, the result may be served from the
    * ActionCache.
    */
  var skipCacheLookup: js.UndefOr[Boolean] = js.native
}

object Schema$BuildBazelRemoteExecutionV2ExecuteRequest {
  @scala.inline
  def apply(
    actionDigest: Schema$BuildBazelRemoteExecutionV2Digest = null,
    executionPolicy: Schema$BuildBazelRemoteExecutionV2ExecutionPolicy = null,
    resultsCachePolicy: Schema$BuildBazelRemoteExecutionV2ResultsCachePolicy = null,
    skipCacheLookup: js.UndefOr[Boolean] = js.undefined
  ): Schema$BuildBazelRemoteExecutionV2ExecuteRequest = {
    val __obj = js.Dynamic.literal()
    if (actionDigest != null) __obj.updateDynamic("actionDigest")(actionDigest.asInstanceOf[js.Any])
    if (executionPolicy != null) __obj.updateDynamic("executionPolicy")(executionPolicy.asInstanceOf[js.Any])
    if (resultsCachePolicy != null) __obj.updateDynamic("resultsCachePolicy")(resultsCachePolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(skipCacheLookup)) __obj.updateDynamic("skipCacheLookup")(skipCacheLookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2ExecuteRequest]
  }
}

