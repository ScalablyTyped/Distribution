package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing temporal values of a variable.
  */
@js.native
trait Schema$IntegerGauge extends js.Object {
  /**
    * The time at which this value was measured. Measured as msecs from epoch.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * The value of the variable represented by this gauge.
    */
  var value: js.UndefOr[Schema$SplitInt64] = js.native
}

object Schema$IntegerGauge {
  @scala.inline
  def apply(timestamp: String = null, value: Schema$SplitInt64 = null): Schema$IntegerGauge = {
    val __obj = js.Dynamic.literal()
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IntegerGauge]
  }
}

