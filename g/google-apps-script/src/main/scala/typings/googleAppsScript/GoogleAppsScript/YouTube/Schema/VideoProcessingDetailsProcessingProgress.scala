package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProcessingDetailsProcessingProgress extends js.Object {
  var partsProcessed: js.UndefOr[String] = js.undefined
  var partsTotal: js.UndefOr[String] = js.undefined
  var timeLeftMs: js.UndefOr[String] = js.undefined
}

object VideoProcessingDetailsProcessingProgress {
  @scala.inline
  def apply(partsProcessed: String = null, partsTotal: String = null, timeLeftMs: String = null): VideoProcessingDetailsProcessingProgress = {
    val __obj = js.Dynamic.literal()
    if (partsProcessed != null) __obj.updateDynamic("partsProcessed")(partsProcessed.asInstanceOf[js.Any])
    if (partsTotal != null) __obj.updateDynamic("partsTotal")(partsTotal.asInstanceOf[js.Any])
    if (timeLeftMs != null) __obj.updateDynamic("timeLeftMs")(timeLeftMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProcessingDetailsProcessingProgress]
  }
}

