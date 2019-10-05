package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMetricDescriptorResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#deleteMetricDescriptorResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object DeleteMetricDescriptorResponse {
  @scala.inline
  def apply(kind: String = null): DeleteMetricDescriptorResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DeleteMetricDescriptorResponse]
  }
}

