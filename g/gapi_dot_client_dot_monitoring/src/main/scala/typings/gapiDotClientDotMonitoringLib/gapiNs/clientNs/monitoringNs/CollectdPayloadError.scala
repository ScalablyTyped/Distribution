package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CollectdPayloadError extends js.Object {
  /** Records the error status for the payload. If this field is present, the partial errors for nested values won't be populated. */
  var error: js.UndefOr[Status] = js.undefined
  /** The zero-based index in CreateCollectdTimeSeriesRequest.collectd_payloads. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
               * Records the error status for values that were not written due to an error.Failed payloads for which nothing is written will not include partial value
               * errors.
               */
  var valueErrors: js.UndefOr[js.Array[CollectdValueError]] = js.undefined
}

