package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrequencyCap extends js.Object {
  var duration: js.UndefOr[String] = js.undefined
  var impressions: js.UndefOr[String] = js.undefined
}

object FrequencyCap {
  @scala.inline
  def apply(duration: String = null, impressions: String = null): FrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (impressions != null) __obj.updateDynamic("impressions")(impressions)
    __obj.asInstanceOf[FrequencyCap]
  }
}

