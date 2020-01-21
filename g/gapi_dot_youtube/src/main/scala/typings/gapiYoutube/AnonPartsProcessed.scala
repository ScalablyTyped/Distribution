package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartsProcessed extends js.Object {
  /**
    * The number of parts of the video that YouTube has already processed.
    */
  var partsProcessed: Double
  /**
    * An estimate of the total number of parts that need to be processed for the video. The number may be updated with more precise estimates while YouTube processes the video.
    */
  var partsTotal: Double
  /**
    * An estimate of the amount of time, in millseconds, that YouTube needs to finish processing the video.
    */
  var timeLeftMs: Double
}

object AnonPartsProcessed {
  @scala.inline
  def apply(partsProcessed: Double, partsTotal: Double, timeLeftMs: Double): AnonPartsProcessed = {
    val __obj = js.Dynamic.literal(partsProcessed = partsProcessed.asInstanceOf[js.Any], partsTotal = partsTotal.asInstanceOf[js.Any], timeLeftMs = timeLeftMs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPartsProcessed]
  }
}

