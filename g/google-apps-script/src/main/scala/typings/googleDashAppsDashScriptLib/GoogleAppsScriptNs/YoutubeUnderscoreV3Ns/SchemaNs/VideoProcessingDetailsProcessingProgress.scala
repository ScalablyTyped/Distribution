package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProcessingDetailsProcessingProgress extends js.Object {
  var partsProcessed: js.UndefOr[java.lang.String] = js.undefined
  var partsTotal: js.UndefOr[java.lang.String] = js.undefined
  var timeLeftMs: js.UndefOr[java.lang.String] = js.undefined
}

object VideoProcessingDetailsProcessingProgress {
  @scala.inline
  def apply(
    partsProcessed: java.lang.String = null,
    partsTotal: java.lang.String = null,
    timeLeftMs: java.lang.String = null
  ): VideoProcessingDetailsProcessingProgress = {
    val __obj = js.Dynamic.literal()
    if (partsProcessed != null) __obj.updateDynamic("partsProcessed")(partsProcessed)
    if (partsTotal != null) __obj.updateDynamic("partsTotal")(partsTotal)
    if (timeLeftMs != null) __obj.updateDynamic("timeLeftMs")(timeLeftMs)
    __obj.asInstanceOf[VideoProcessingDetailsProcessingProgress]
  }
}

