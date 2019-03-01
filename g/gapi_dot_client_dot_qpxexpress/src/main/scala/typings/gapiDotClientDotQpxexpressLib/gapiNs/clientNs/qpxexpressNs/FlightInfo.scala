package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlightInfo extends js.Object {
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /** The flight number. */
  var number: js.UndefOr[java.lang.String] = js.undefined
}

object FlightInfo {
  @scala.inline
  def apply(carrier: java.lang.String = null, number: java.lang.String = null): FlightInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (number != null) __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[FlightInfo]
  }
}

