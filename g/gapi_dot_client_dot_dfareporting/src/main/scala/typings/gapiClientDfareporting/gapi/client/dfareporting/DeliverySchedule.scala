package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliverySchedule extends js.Object {
  /** Limit on the number of times an individual user can be served the ad within a specified period of time. */
  var frequencyCap: js.UndefOr[FrequencyCap] = js.undefined
  /**
    * Whether or not hard cutoff is enabled. If true, the ad will not serve after the end date and time. Otherwise the ad will continue to be served until it
    * has reached its delivery goals.
    */
  var hardCutoff: js.UndefOr[Boolean] = js.undefined
  /**
    * Impression ratio for this ad. This ratio determines how often each ad is served relative to the others. For example, if ad A has an impression ratio of
    * 1 and ad B has an impression ratio of 3, then DCM will serve ad B three times as often as ad A. Acceptable values are 1 to 10, inclusive.
    */
  var impressionRatio: js.UndefOr[String] = js.undefined
  /** Serving priority of an ad, with respect to other ads. The lower the priority number, the greater the priority with which it is served. */
  var priority: js.UndefOr[String] = js.undefined
}

object DeliverySchedule {
  @scala.inline
  def apply(
    frequencyCap: FrequencyCap = null,
    hardCutoff: js.UndefOr[Boolean] = js.undefined,
    impressionRatio: String = null,
    priority: String = null
  ): DeliverySchedule = {
    val __obj = js.Dynamic.literal()
    if (frequencyCap != null) __obj.updateDynamic("frequencyCap")(frequencyCap.asInstanceOf[js.Any])
    if (!js.isUndefined(hardCutoff)) __obj.updateDynamic("hardCutoff")(hardCutoff.get.asInstanceOf[js.Any])
    if (impressionRatio != null) __obj.updateDynamic("impressionRatio")(impressionRatio.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliverySchedule]
  }
}

