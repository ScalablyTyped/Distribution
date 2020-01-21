package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolResultsHistory extends js.Object {
  /**
    * A tool results history ID.
    * Required
    */
  var historyId: js.UndefOr[String] = js.undefined
  /**
    * The cloud project that owns the tool results history.
    * Required
    */
  var projectId: js.UndefOr[String] = js.undefined
}

object ToolResultsHistory {
  @scala.inline
  def apply(historyId: String = null, projectId: String = null): ToolResultsHistory = {
    val __obj = js.Dynamic.literal()
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolResultsHistory]
  }
}

