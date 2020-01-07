package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Execution.Execute, which will be contained in the
  * response field of the Operation.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2ExecuteResponse extends js.Object {
  /**
    * True if the result was served from cache, false if it was executed.
    */
  var cachedResult: js.UndefOr[Boolean] = js.native
  /**
    * Freeform informational message with details on the execution of the
    * action that may be displayed to the user upon failure or when requested
    * explicitly.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The result of the action.
    */
  var result: js.UndefOr[Schema$BuildBazelRemoteExecutionV2ActionResult] = js.native
  /**
    * An optional list of additional log outputs the server wishes to provide.
    * A server can use this to return execution-specific logs however it
    * wishes. This is intended primarily to make it easier for users to debug
    * issues that may be outside of the actual job execution, such as by
    * identifying the worker executing the action or by providing logs from the
    * worker&#39;s setup phase. The keys SHOULD be human readable so that a
    * client can display them to a user.
    */
  var serverLogs: js.UndefOr[StringDictionary[Schema$BuildBazelRemoteExecutionV2LogFile]] = js.native
  /**
    * If the status has a code other than `OK`, it indicates that the action
    * did not finish execution. For example, if the operation times out during
    * execution, the status will have a `DEADLINE_EXCEEDED` code. Servers MUST
    * use this field for errors in execution, rather than the error field on
    * the `Operation` object.  If the status code is other than `OK`, then the
    * result MUST NOT be cached. For an error status, the `result` field is
    * optional; the server may populate the output-, stdout-, and
    * stderr-related fields if it has any information available, such as the
    * stdout and stderr of a timed-out action.
    */
  var status: js.UndefOr[Schema$GoogleRpcStatus] = js.native
}

object Schema$BuildBazelRemoteExecutionV2ExecuteResponse {
  @scala.inline
  def apply(
    cachedResult: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    result: Schema$BuildBazelRemoteExecutionV2ActionResult = null,
    serverLogs: StringDictionary[Schema$BuildBazelRemoteExecutionV2LogFile] = null,
    status: Schema$GoogleRpcStatus = null
  ): Schema$BuildBazelRemoteExecutionV2ExecuteResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cachedResult)) __obj.updateDynamic("cachedResult")(cachedResult.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (serverLogs != null) __obj.updateDynamic("serverLogs")(serverLogs.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2ExecuteResponse]
  }
}

