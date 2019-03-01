package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTimeseriesRequest extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listTimeseriesRequest". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ListTimeseriesRequest {
  @scala.inline
  def apply(kind: java.lang.String = null): ListTimeseriesRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ListTimeseriesRequest]
  }
}

