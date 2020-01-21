package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultStorage extends js.Object {
  /** Required. */
  var googleCloudStorage: js.UndefOr[GoogleCloudStorage] = js.undefined
  /**
    * The tool results execution that results are written to.
    * @OutputOnly
    */
  var toolResultsExecution: js.UndefOr[ToolResultsExecution] = js.undefined
  /**
    * The tool results history that contains the tool results execution that
    * results are written to.
    *
    * Optional, if not provided the service will choose an appropriate value.
    */
  var toolResultsHistory: js.UndefOr[ToolResultsHistory] = js.undefined
}

object ResultStorage {
  @scala.inline
  def apply(
    googleCloudStorage: GoogleCloudStorage = null,
    toolResultsExecution: ToolResultsExecution = null,
    toolResultsHistory: ToolResultsHistory = null
  ): ResultStorage = {
    val __obj = js.Dynamic.literal()
    if (googleCloudStorage != null) __obj.updateDynamic("googleCloudStorage")(googleCloudStorage.asInstanceOf[js.Any])
    if (toolResultsExecution != null) __obj.updateDynamic("toolResultsExecution")(toolResultsExecution.asInstanceOf[js.Any])
    if (toolResultsHistory != null) __obj.updateDynamic("toolResultsHistory")(toolResultsHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultStorage]
  }
}

