package typings.gapiDotClientDotServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaProperties extends js.Object {
  /** Quota mode for this operation. */
  var quotaMode: js.UndefOr[String] = js.undefined
}

object QuotaProperties {
  @scala.inline
  def apply(quotaMode: String = null): QuotaProperties = {
    val __obj = js.Dynamic.literal()
    if (quotaMode != null) __obj.updateDynamic("quotaMode")(quotaMode)
    __obj.asInstanceOf[QuotaProperties]
  }
}

