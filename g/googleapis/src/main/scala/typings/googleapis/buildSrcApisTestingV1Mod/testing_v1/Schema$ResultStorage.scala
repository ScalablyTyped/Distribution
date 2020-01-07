package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Locations where the results of running the test are stored.
  */
@js.native
trait Schema$ResultStorage extends js.Object {
  /**
    * Required.
    */
  var googleCloudStorage: js.UndefOr[Schema$GoogleCloudStorage] = js.native
  /**
    * Output only. The tool results execution that results are written to.
    */
  var toolResultsExecution: js.UndefOr[Schema$ToolResultsExecution] = js.native
  /**
    * The tool results history that contains the tool results execution that
    * results are written to.  If not provided, the service will choose an
    * appropriate value.
    */
  var toolResultsHistory: js.UndefOr[Schema$ToolResultsHistory] = js.native
}

object Schema$ResultStorage {
  @scala.inline
  def apply(
    googleCloudStorage: Schema$GoogleCloudStorage = null,
    toolResultsExecution: Schema$ToolResultsExecution = null,
    toolResultsHistory: Schema$ToolResultsHistory = null
  ): Schema$ResultStorage = {
    val __obj = js.Dynamic.literal()
    if (googleCloudStorage != null) __obj.updateDynamic("googleCloudStorage")(googleCloudStorage.asInstanceOf[js.Any])
    if (toolResultsExecution != null) __obj.updateDynamic("toolResultsExecution")(toolResultsExecution.asInstanceOf[js.Any])
    if (toolResultsHistory != null) __obj.updateDynamic("toolResultsHistory")(toolResultsHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultStorage]
  }
}

