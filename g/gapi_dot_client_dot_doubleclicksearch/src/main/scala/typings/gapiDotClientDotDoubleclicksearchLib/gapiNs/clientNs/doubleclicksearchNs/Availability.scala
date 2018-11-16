package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Availability extends js.Object {
  /** DS advertiser ID. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** DS agency ID. */
  var agencyId: js.UndefOr[java.lang.String] = js.undefined
  /** The time by which all conversions have been uploaded, in epoch millis UTC. */
  var availabilityTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID). */
  var segmentationId: js.UndefOr[java.lang.String] = js.undefined
  /** The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name). */
  var segmentationName: js.UndefOr[java.lang.String] = js.undefined
  /** The segmentation type that this availability is for (its default value is FLOODLIGHT). */
  var segmentationType: js.UndefOr[java.lang.String] = js.undefined
}

