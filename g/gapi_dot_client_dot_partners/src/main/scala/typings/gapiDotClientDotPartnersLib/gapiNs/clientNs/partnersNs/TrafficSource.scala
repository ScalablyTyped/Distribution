package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficSource extends js.Object {
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var trafficSourceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var trafficSubId: js.UndefOr[java.lang.String] = js.undefined
}

object TrafficSource {
  @scala.inline
  def apply(trafficSourceId: java.lang.String = null, trafficSubId: java.lang.String = null): TrafficSource = {
    val __obj = js.Dynamic.literal()
    if (trafficSourceId != null) __obj.updateDynamic("trafficSourceId")(trafficSourceId)
    if (trafficSubId != null) __obj.updateDynamic("trafficSubId")(trafficSubId)
    __obj.asInstanceOf[TrafficSource]
  }
}

