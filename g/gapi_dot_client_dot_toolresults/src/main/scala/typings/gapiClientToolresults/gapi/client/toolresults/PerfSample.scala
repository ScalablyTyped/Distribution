package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfSample extends js.Object {
  /** Timestamp of collection */
  var sampleTime: js.UndefOr[Timestamp] = js.undefined
  /** Value observed */
  var value: js.UndefOr[Double] = js.undefined
}

object PerfSample {
  @scala.inline
  def apply(sampleTime: Timestamp = null, value: js.UndefOr[Double] = js.undefined): PerfSample = {
    val __obj = js.Dynamic.literal()
    if (sampleTime != null) __obj.updateDynamic("sampleTime")(sampleTime.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerfSample]
  }
}

