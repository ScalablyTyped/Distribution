package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMetricDescriptorsRequest extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listMetricDescriptorsRequest". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ListMetricDescriptorsRequest {
  @scala.inline
  def apply(kind: java.lang.String = null): ListMetricDescriptorsRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ListMetricDescriptorsRequest]
  }
}

