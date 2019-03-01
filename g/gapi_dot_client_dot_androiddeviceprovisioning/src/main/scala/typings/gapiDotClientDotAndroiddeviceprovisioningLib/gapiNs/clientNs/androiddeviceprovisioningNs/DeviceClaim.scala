package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceClaim extends js.Object {
  /** Owner ID. */
  var ownerCompanyId: js.UndefOr[java.lang.String] = js.undefined
  /** Section type of the device claim. */
  var sectionType: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceClaim {
  @scala.inline
  def apply(ownerCompanyId: java.lang.String = null, sectionType: java.lang.String = null): DeviceClaim = {
    val __obj = js.Dynamic.literal()
    if (ownerCompanyId != null) __obj.updateDynamic("ownerCompanyId")(ownerCompanyId)
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType)
    __obj.asInstanceOf[DeviceClaim]
  }
}

