package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolResultsHistory extends js.Object {
  /**
    * A tool results history ID.
    * Required
    */
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The cloud project that owns the tool results history.
    * Required
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object ToolResultsHistory {
  @scala.inline
  def apply(historyId: java.lang.String = null, projectId: java.lang.String = null): ToolResultsHistory = {
    val __obj = js.Dynamic.literal()
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ToolResultsHistory]
  }
}

