package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  /** Filters used to match traffic data in your report. */
  var filters: js.UndefOr[js.Array[FilterPair]] = js.undefined
  /** Data is grouped by the filters listed in this field. */
  var groupBys: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether to include data from Invite Media. */
  var includeInviteData: js.UndefOr[Boolean] = js.undefined
  /** Metrics to include as columns in your report. */
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  /** Report type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(
    filters: js.Array[FilterPair] = null,
    groupBys: js.Array[String] = null,
    includeInviteData: js.UndefOr[Boolean] = js.undefined,
    metrics: js.Array[String] = null,
    `type`: String = null
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (groupBys != null) __obj.updateDynamic("groupBys")(groupBys)
    if (!js.isUndefined(includeInviteData)) __obj.updateDynamic("includeInviteData")(includeInviteData)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Parameters]
  }
}

