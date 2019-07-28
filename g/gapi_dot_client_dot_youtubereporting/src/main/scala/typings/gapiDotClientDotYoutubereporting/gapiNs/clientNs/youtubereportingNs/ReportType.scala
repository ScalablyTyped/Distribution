package typings.gapiDotClientDotYoutubereporting.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportType extends js.Object {
  /** The date/time when this report type was/will be deprecated. */
  var deprecateTime: js.UndefOr[String] = js.undefined
  /** The ID of the report type (max. 100 characters). */
  var id: js.UndefOr[String] = js.undefined
  /** The name of the report type (max. 100 characters). */
  var name: js.UndefOr[String] = js.undefined
  /**
    * True if this a system-managed report type; otherwise false. Reporting jobs
    * for system-managed report types are created automatically and can thus not
    * be used in the `CreateJob` method.
    */
  var systemManaged: js.UndefOr[Boolean] = js.undefined
}

object ReportType {
  @scala.inline
  def apply(
    deprecateTime: String = null,
    id: String = null,
    name: String = null,
    systemManaged: js.UndefOr[Boolean] = js.undefined
  ): ReportType = {
    val __obj = js.Dynamic.literal()
    if (deprecateTime != null) __obj.updateDynamic("deprecateTime")(deprecateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(systemManaged)) __obj.updateDynamic("systemManaged")(systemManaged)
    __obj.asInstanceOf[ReportType]
  }
}

