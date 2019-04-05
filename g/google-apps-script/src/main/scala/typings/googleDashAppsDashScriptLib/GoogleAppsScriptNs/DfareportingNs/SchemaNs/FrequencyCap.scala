package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrequencyCap extends js.Object {
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var impressions: js.UndefOr[java.lang.String] = js.undefined
}

object FrequencyCap {
  @scala.inline
  def apply(duration: java.lang.String = null, impressions: java.lang.String = null): FrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (impressions != null) __obj.updateDynamic("impressions")(impressions)
    __obj.asInstanceOf[FrequencyCap]
  }
}

