package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteTimeseriesResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#writeTimeseriesResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object WriteTimeseriesResponse {
  @scala.inline
  def apply(kind: String = null): WriteTimeseriesResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTimeseriesResponse]
  }
}

