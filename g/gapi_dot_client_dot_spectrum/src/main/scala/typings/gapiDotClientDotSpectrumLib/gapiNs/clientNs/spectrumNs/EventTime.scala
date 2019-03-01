package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTime extends js.Object {
  /** The inclusive start of the event. It will be present. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The exclusive end of the event. It will be present. */
  var stopTime: js.UndefOr[java.lang.String] = js.undefined
}

object EventTime {
  @scala.inline
  def apply(startTime: java.lang.String = null, stopTime: java.lang.String = null): EventTime = {
    val __obj = js.Dynamic.literal()
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (stopTime != null) __obj.updateDynamic("stopTime")(stopTime)
    __obj.asInstanceOf[EventTime]
  }
}

