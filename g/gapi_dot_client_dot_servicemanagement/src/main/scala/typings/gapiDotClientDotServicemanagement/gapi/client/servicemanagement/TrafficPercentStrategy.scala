package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficPercentStrategy extends js.Object {
  /**
    * Maps service configuration IDs to their corresponding traffic percentage.
    * Key is the service configuration ID, Value is the traffic percentage
    * which must be greater than 0.0 and the sum must equal to 100.0.
    */
  var percentages: js.UndefOr[Record[String, Double]] = js.undefined
}

object TrafficPercentStrategy {
  @scala.inline
  def apply(percentages: Record[String, Double] = null): TrafficPercentStrategy = {
    val __obj = js.Dynamic.literal()
    if (percentages != null) __obj.updateDynamic("percentages")(percentages.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficPercentStrategy]
  }
}

