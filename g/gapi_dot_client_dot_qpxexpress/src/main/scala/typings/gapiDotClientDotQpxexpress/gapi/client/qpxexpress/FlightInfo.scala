package typings.gapiDotClientDotQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlightInfo extends js.Object {
  var carrier: js.UndefOr[String] = js.undefined
  /** The flight number. */
  var number: js.UndefOr[String] = js.undefined
}

object FlightInfo {
  @scala.inline
  def apply(carrier: String = null, number: String = null): FlightInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (number != null) __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[FlightInfo]
  }
}

