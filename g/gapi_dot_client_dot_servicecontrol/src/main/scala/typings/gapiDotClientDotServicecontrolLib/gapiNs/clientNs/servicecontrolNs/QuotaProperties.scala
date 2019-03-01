package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaProperties extends js.Object {
  /** Quota mode for this operation. */
  var quotaMode: js.UndefOr[java.lang.String] = js.undefined
}

object QuotaProperties {
  @scala.inline
  def apply(quotaMode: java.lang.String = null): QuotaProperties = {
    val __obj = js.Dynamic.literal()
    if (quotaMode != null) __obj.updateDynamic("quotaMode")(quotaMode)
    __obj.asInstanceOf[QuotaProperties]
  }
}

