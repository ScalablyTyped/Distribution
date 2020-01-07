package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EffectiveTime extends js.Object {
  var effectiveTime: js.UndefOr[String] = js.native
  var isLocked: js.UndefOr[Boolean] = js.native
  var retentionPeriod: js.UndefOr[String] = js.native
}

object Anon_EffectiveTime {
  @scala.inline
  def apply(
    effectiveTime: String = null,
    isLocked: js.UndefOr[Boolean] = js.undefined,
    retentionPeriod: String = null
  ): Anon_EffectiveTime = {
    val __obj = js.Dynamic.literal()
    if (effectiveTime != null) __obj.updateDynamic("effectiveTime")(effectiveTime.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocked)) __obj.updateDynamic("isLocked")(isLocked.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EffectiveTime]
  }
}

