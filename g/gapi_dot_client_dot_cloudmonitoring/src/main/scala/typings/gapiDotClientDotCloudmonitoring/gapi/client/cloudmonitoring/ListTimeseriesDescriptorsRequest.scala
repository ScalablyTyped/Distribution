package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTimeseriesDescriptorsRequest extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listTimeseriesDescriptorsRequest". */
  var kind: js.UndefOr[String] = js.undefined
}

object ListTimeseriesDescriptorsRequest {
  @scala.inline
  def apply(kind: String = null): ListTimeseriesDescriptorsRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ListTimeseriesDescriptorsRequest]
  }
}

