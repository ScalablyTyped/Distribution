package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatusDataQualityIssue extends js.Object {
  /** A more detailed error string. */
  var detail: js.UndefOr[String] = js.undefined
  /** The fetch status for landing_page_errors. */
  var fetchStatus: js.UndefOr[String] = js.undefined
  /** The id of the data quality issue. */
  var id: js.UndefOr[String] = js.undefined
  /** The attribute name that is relevant for the issue. */
  var location: js.UndefOr[String] = js.undefined
  /** The severity of the data quality issue. */
  var severity: js.UndefOr[String] = js.undefined
  /** The time stamp of the data quality issue. */
  var timestamp: js.UndefOr[String] = js.undefined
  /** The value of that attribute that was found on the landing page */
  var valueOnLandingPage: js.UndefOr[String] = js.undefined
  /** The value the attribute had at time of evaluation. */
  var valueProvided: js.UndefOr[String] = js.undefined
}

object ProductStatusDataQualityIssue {
  @scala.inline
  def apply(
    detail: String = null,
    fetchStatus: String = null,
    id: String = null,
    location: String = null,
    severity: String = null,
    timestamp: String = null,
    valueOnLandingPage: String = null,
    valueProvided: String = null
  ): ProductStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (fetchStatus != null) __obj.updateDynamic("fetchStatus")(fetchStatus)
    if (id != null) __obj.updateDynamic("id")(id)
    if (location != null) __obj.updateDynamic("location")(location)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (valueOnLandingPage != null) __obj.updateDynamic("valueOnLandingPage")(valueOnLandingPage)
    if (valueProvided != null) __obj.updateDynamic("valueProvided")(valueProvided)
    __obj.asInstanceOf[ProductStatusDataQualityIssue]
  }
}

