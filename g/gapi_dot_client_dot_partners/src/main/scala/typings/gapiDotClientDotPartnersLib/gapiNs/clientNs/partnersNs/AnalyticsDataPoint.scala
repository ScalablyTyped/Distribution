package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsDataPoint extends js.Object {
  /**
    * Number of times the type of event occurred.
    * Meaning depends on context (e.g. profile views, contacts, etc.).
    */
  var eventCount: js.UndefOr[scala.Double] = js.undefined
  /** Location information of where these events occurred. */
  var eventLocations: js.UndefOr[js.Array[LatLng]] = js.undefined
}

object AnalyticsDataPoint {
  @scala.inline
  def apply(eventCount: scala.Int | scala.Double = null, eventLocations: js.Array[LatLng] = null): AnalyticsDataPoint = {
    val __obj = js.Dynamic.literal()
    if (eventCount != null) __obj.updateDynamic("eventCount")(eventCount.asInstanceOf[js.Any])
    if (eventLocations != null) __obj.updateDynamic("eventLocations")(eventLocations)
    __obj.asInstanceOf[AnalyticsDataPoint]
  }
}

