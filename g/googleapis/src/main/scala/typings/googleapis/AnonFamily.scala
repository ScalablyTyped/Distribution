package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFamily extends js.Object {
  var family: js.UndefOr[String] = js.native
  var firmwareVersion: js.UndefOr[String] = js.native
  var manufacturer: js.UndefOr[String] = js.native
  var specLevel: js.UndefOr[String] = js.native
  var tpmModel: js.UndefOr[String] = js.native
  var vendorSpecific: js.UndefOr[String] = js.native
}

object AnonFamily {
  @scala.inline
  def apply(
    family: String = null,
    firmwareVersion: String = null,
    manufacturer: String = null,
    specLevel: String = null,
    tpmModel: String = null,
    vendorSpecific: String = null
  ): AnonFamily = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (firmwareVersion != null) __obj.updateDynamic("firmwareVersion")(firmwareVersion.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (specLevel != null) __obj.updateDynamic("specLevel")(specLevel.asInstanceOf[js.Any])
    if (tpmModel != null) __obj.updateDynamic("tpmModel")(tpmModel.asInstanceOf[js.Any])
    if (vendorSpecific != null) __obj.updateDynamic("vendorSpecific")(vendorSpecific.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamily]
  }
}

