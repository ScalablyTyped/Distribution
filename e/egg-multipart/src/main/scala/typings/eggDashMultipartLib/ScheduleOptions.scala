package typings
package eggDashMultipartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleOptions extends js.Object {
  var cron: js.UndefOr[java.lang.String] = js.undefined
  var cronOptions: js.UndefOr[Anon_CurrentDate] = js.undefined
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ScheduleOptions {
  @scala.inline
  def apply(
    cron: java.lang.String = null,
    cronOptions: Anon_CurrentDate = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    env: js.Array[java.lang.String] = null,
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Double | java.lang.String = null,
    `type`: java.lang.String = null
  ): ScheduleOptions = {
    val __obj = js.Dynamic.literal()
    if (cron != null) __obj.updateDynamic("cron")(cron)
    if (cronOptions != null) __obj.updateDynamic("cronOptions")(cronOptions)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ScheduleOptions]
  }
}

