package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExecutedActionMetadata contains details about a completed execution.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2ExecutedActionMetadata extends js.Object {
  /**
    * When the worker completed executing the action command.
    */
  var executionCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker started executing the action command.
    */
  var executionStartTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker finished fetching action inputs.
    */
  var inputFetchCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker started fetching action inputs.
    */
  var inputFetchStartTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker finished uploading action outputs.
    */
  var outputUploadCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker started uploading action outputs.
    */
  var outputUploadStartTimestamp: js.UndefOr[String] = js.native
  /**
    * When was the action added to the queue.
    */
  var queuedTimestamp: js.UndefOr[String] = js.native
  /**
    * The name of the worker which ran the execution.
    */
  var worker: js.UndefOr[String] = js.native
  /**
    * When the worker completed the action, including all stages.
    */
  var workerCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker received the action.
    */
  var workerStartTimestamp: js.UndefOr[String] = js.native
}

object Schema$BuildBazelRemoteExecutionV2ExecutedActionMetadata {
  @scala.inline
  def apply(
    executionCompletedTimestamp: String = null,
    executionStartTimestamp: String = null,
    inputFetchCompletedTimestamp: String = null,
    inputFetchStartTimestamp: String = null,
    outputUploadCompletedTimestamp: String = null,
    outputUploadStartTimestamp: String = null,
    queuedTimestamp: String = null,
    worker: String = null,
    workerCompletedTimestamp: String = null,
    workerStartTimestamp: String = null
  ): Schema$BuildBazelRemoteExecutionV2ExecutedActionMetadata = {
    val __obj = js.Dynamic.literal()
    if (executionCompletedTimestamp != null) __obj.updateDynamic("executionCompletedTimestamp")(executionCompletedTimestamp.asInstanceOf[js.Any])
    if (executionStartTimestamp != null) __obj.updateDynamic("executionStartTimestamp")(executionStartTimestamp.asInstanceOf[js.Any])
    if (inputFetchCompletedTimestamp != null) __obj.updateDynamic("inputFetchCompletedTimestamp")(inputFetchCompletedTimestamp.asInstanceOf[js.Any])
    if (inputFetchStartTimestamp != null) __obj.updateDynamic("inputFetchStartTimestamp")(inputFetchStartTimestamp.asInstanceOf[js.Any])
    if (outputUploadCompletedTimestamp != null) __obj.updateDynamic("outputUploadCompletedTimestamp")(outputUploadCompletedTimestamp.asInstanceOf[js.Any])
    if (outputUploadStartTimestamp != null) __obj.updateDynamic("outputUploadStartTimestamp")(outputUploadStartTimestamp.asInstanceOf[js.Any])
    if (queuedTimestamp != null) __obj.updateDynamic("queuedTimestamp")(queuedTimestamp.asInstanceOf[js.Any])
    if (worker != null) __obj.updateDynamic("worker")(worker.asInstanceOf[js.Any])
    if (workerCompletedTimestamp != null) __obj.updateDynamic("workerCompletedTimestamp")(workerCompletedTimestamp.asInstanceOf[js.Any])
    if (workerStartTimestamp != null) __obj.updateDynamic("workerStartTimestamp")(workerStartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2ExecutedActionMetadata]
  }
}

