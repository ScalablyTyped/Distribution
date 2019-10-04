package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs

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
    val __obj = js.Dynamic.literal(lastRefresh = lastRefresh)
    if (!js.isUndefined(sampleExtraction)) __obj.updateDynamic("sampleExtraction")(sampleExtraction)
    __obj.asInstanceOf[ScriptParams]
  }
}

