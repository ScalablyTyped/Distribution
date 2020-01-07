package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a single performance measure or data point
  */
@js.native
trait Schema$PerfSample extends js.Object {
  /**
    * Timestamp of collection
    */
  var sampleTime: js.UndefOr[Schema$Timestamp] = js.native
  /**
    * Value observed
    */
  var value: js.UndefOr[Double] = js.native
}

object Schema$PerfSample {
  @scala.inline
  def apply(sampleTime: Schema$Timestamp = null, value: Int | Double = null): Schema$PerfSample = {
    val __obj = js.Dynamic.literal()
    if (sampleTime != null) __obj.updateDynamic("sampleTime")(sampleTime.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PerfSample]
  }
}

