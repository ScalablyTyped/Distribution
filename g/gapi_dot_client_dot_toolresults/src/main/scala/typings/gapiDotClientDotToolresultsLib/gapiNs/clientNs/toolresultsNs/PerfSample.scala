package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfSample extends js.Object {
  /** Timestamp of collection */
  var sampleTime: js.UndefOr[Timestamp] = js.undefined
  /** Value observed */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object PerfSample {
  @scala.inline
  def apply(sampleTime: Timestamp = null, value: scala.Int | scala.Double = null): PerfSample = {
    val __obj = js.Dynamic.literal()
    if (sampleTime != null) __obj.updateDynamic("sampleTime")(sampleTime)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerfSample]
  }
}

