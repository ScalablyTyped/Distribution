package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficPercentStrategy extends js.Object {
  /**
    * Maps service configuration IDs to their corresponding traffic percentage.
    * Key is the service configuration ID, Value is the traffic percentage
    * which must be greater than 0.0 and the sum must equal to 100.0.
    */
  var percentages: js.UndefOr[stdLib.Record[java.lang.String, scala.Double]] = js.undefined
}

object TrafficPercentStrategy {
  @scala.inline
  def apply(percentages: stdLib.Record[java.lang.String, scala.Double] = null): TrafficPercentStrategy = {
    val __obj = js.Dynamic.literal()
    if (percentages != null) __obj.updateDynamic("percentages")(percentages)
    __obj.asInstanceOf[TrafficPercentStrategy]
  }
}

