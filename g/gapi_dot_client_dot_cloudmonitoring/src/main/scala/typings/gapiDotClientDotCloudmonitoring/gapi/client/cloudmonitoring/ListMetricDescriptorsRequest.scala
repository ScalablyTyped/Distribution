package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMetricDescriptorsRequest extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listMetricDescriptorsRequest". */
  var kind: js.UndefOr[String] = js.undefined
}

object ListMetricDescriptorsRequest {
  @scala.inline
  def apply(kind: String = null): ListMetricDescriptorsRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ListMetricDescriptorsRequest]
  }
}

