package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersionsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemVersionsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Operating system version collection. */
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.undefined
}

object OperatingSystemVersionsListResponse {
  @scala.inline
  def apply(kind: String = null, operatingSystemVersions: js.Array[OperatingSystemVersion] = null): OperatingSystemVersionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (operatingSystemVersions != null) __obj.updateDynamic("operatingSystemVersions")(operatingSystemVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatingSystemVersionsListResponse]
  }
}

