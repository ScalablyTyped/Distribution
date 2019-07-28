package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Operating system collection. */
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.undefined
}

object OperatingSystemsListResponse {
  @scala.inline
  def apply(kind: String = null, operatingSystems: js.Array[OperatingSystem] = null): OperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (operatingSystems != null) __obj.updateDynamic("operatingSystems")(operatingSystems)
    __obj.asInstanceOf[OperatingSystemsListResponse]
  }
}

