package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOffset extends js.Object {
  var offsetPercentage: js.UndefOr[scala.Double] = js.undefined
  var offsetSeconds: js.UndefOr[scala.Double] = js.undefined
}

object VideoOffset {
  @scala.inline
  def apply(offsetPercentage: scala.Int | scala.Double = null, offsetSeconds: scala.Int | scala.Double = null): VideoOffset = {
    val __obj = js.Dynamic.literal()
    if (offsetPercentage != null) __obj.updateDynamic("offsetPercentage")(offsetPercentage.asInstanceOf[js.Any])
    if (offsetSeconds != null) __obj.updateDynamic("offsetSeconds")(offsetSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOffset]
  }
}

