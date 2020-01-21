package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Availability extends js.Object {
  /** DS advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** DS agency ID. */
  var agencyId: js.UndefOr[String] = js.undefined
  /** The time by which all conversions have been uploaded, in epoch millis UTC. */
  var availabilityTimestamp: js.UndefOr[String] = js.undefined
  /** The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID). */
  var segmentationId: js.UndefOr[String] = js.undefined
  /** The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name). */
  var segmentationName: js.UndefOr[String] = js.undefined
  /** The segmentation type that this availability is for (its default value is FLOODLIGHT). */
  var segmentationType: js.UndefOr[String] = js.undefined
}

object Availability {
  @scala.inline
  def apply(
    advertiserId: String = null,
    agencyId: String = null,
    availabilityTimestamp: String = null,
    segmentationId: String = null,
    segmentationName: String = null,
    segmentationType: String = null
  ): Availability = {
    val __obj = js.Dynamic.literal()
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId.asInstanceOf[js.Any])
    if (availabilityTimestamp != null) __obj.updateDynamic("availabilityTimestamp")(availabilityTimestamp.asInstanceOf[js.Any])
    if (segmentationId != null) __obj.updateDynamic("segmentationId")(segmentationId.asInstanceOf[js.Any])
    if (segmentationName != null) __obj.updateDynamic("segmentationName")(segmentationName.asInstanceOf[js.Any])
    if (segmentationType != null) __obj.updateDynamic("segmentationType")(segmentationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Availability]
  }
}

