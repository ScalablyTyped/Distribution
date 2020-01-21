package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProcessingDetailsProcessingProgress extends js.Object {
  /**
    * The number of parts of the video that YouTube has already processed. You can estimate the percentage of the video that YouTube has already processed by
    * calculating:
    * 100 &#42; parts_processed / parts_total
    *
    * Note that since the estimated number of parts could increase without a corresponding increase in the number of parts that have already been processed,
    * it is possible that the calculated progress could periodically decrease while YouTube processes a video.
    */
  var partsProcessed: js.UndefOr[String] = js.undefined
  /**
    * An estimate of the total number of parts that need to be processed for the video. The number may be updated with more precise estimates while YouTube
    * processes the video.
    */
  var partsTotal: js.UndefOr[String] = js.undefined
  /** An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the video. */
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

