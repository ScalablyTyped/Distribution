package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOffset extends js.Object {
  var offsetPercentage: js.UndefOr[Double] = js.undefined
  var offsetSeconds: js.UndefOr[Double] = js.undefined
}

object VideoOffset {
  @scala.inline
  def apply(offsetPercentage: Int | Double = null, offsetSeconds: Int | Double = null): VideoOffset = {
    val __obj = js.Dynamic.literal()
    if (offsetPercentage != null) __obj.updateDynamic("offsetPercentage")(offsetPercentage.asInstanceOf[js.Any])
    if (offsetSeconds != null) __obj.updateDynamic("offsetSeconds")(offsetSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOffset]
  }
}

