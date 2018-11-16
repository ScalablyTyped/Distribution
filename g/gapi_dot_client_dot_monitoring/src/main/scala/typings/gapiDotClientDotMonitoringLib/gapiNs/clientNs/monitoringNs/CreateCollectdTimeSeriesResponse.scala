package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateCollectdTimeSeriesResponse extends js.Object {
  /**
               * Records the error status for points that were not written due to an error.Failed requests for which nothing is written will return an error response
               * instead.
               */
  var payloadErrors: js.UndefOr[js.Array[CollectdPayloadError]] = js.undefined
}

