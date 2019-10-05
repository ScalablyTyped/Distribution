package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReportsResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "doubleclickbidmanager#listReportsResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Retrieved reports. */
  var reports: js.UndefOr[js.Array[Report]] = js.undefined
}

object ListReportsResponse {
  @scala.inline
  def apply(kind: String = null, reports: js.Array[Report] = null): ListReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (reports != null) __obj.updateDynamic("reports")(reports)
    __obj.asInstanceOf[ListReportsResponse]
  }
}

