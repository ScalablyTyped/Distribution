package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContentDetailsRegionRestriction extends js.Object {
  var allowed: js.UndefOr[js.Array[String]] = js.undefined
  var blocked: js.UndefOr[js.Array[String]] = js.undefined
}

object VideoContentDetailsRegionRestriction {
  @scala.inline
  def apply(allowed: js.Array[String] = null, blocked: js.Array[String] = null): VideoContentDetailsRegionRestriction = {
    val __obj = js.Dynamic.literal()
    if (allowed != null) __obj.updateDynamic("allowed")(allowed.asInstanceOf[js.Any])
    if (blocked != null) __obj.updateDynamic("blocked")(blocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoContentDetailsRegionRestriction]
  }
}

