package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the error status for values that were not written.
  */
@js.native
trait Schema$CollectdValueError extends js.Object {
  /**
    * Records the error status for the value.
    */
  var error: js.UndefOr[Schema$Status] = js.native
  /**
    * The zero-based index in CollectdPayload.values within the parent
    * CreateCollectdTimeSeriesRequest.collectd_payloads.
    */
  var index: js.UndefOr[Double] = js.native
}

object Schema$CollectdValueError {
  @scala.inline
  def apply(error: Schema$Status = null, index: Int | Double = null): Schema$CollectdValueError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CollectdValueError]
  }
}

