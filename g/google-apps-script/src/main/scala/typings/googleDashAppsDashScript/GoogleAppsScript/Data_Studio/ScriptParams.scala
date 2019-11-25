package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptParams extends js.Object {
  /** A timestamp that marks the most recent request for a refresh of data. */
  var lastRefresh: String
  /** If true, the getData() request is for automatic semantic type detection. */
  var sampleExtraction: js.UndefOr[Boolean] = js.undefined
}

object ScriptParams {
  @scala.inline
  def apply(lastRefresh: String, sampleExtraction: js.UndefOr[Boolean] = js.undefined): ScriptParams = {
    val __obj = js.Dynamic.literal(lastRefresh = lastRefresh.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleExtraction)) __obj.updateDynamic("sampleExtraction")(sampleExtraction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptParams]
  }
}

