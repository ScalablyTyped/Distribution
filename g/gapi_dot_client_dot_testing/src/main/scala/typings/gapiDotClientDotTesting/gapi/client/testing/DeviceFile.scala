package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceFile extends js.Object {
  /** A reference to an opaque binary blob file */
  var obbFile: js.UndefOr[ObbFile] = js.undefined
}

object DeviceFile {
  @scala.inline
  def apply(obbFile: ObbFile = null): DeviceFile = {
    val __obj = js.Dynamic.literal()
    if (obbFile != null) __obj.updateDynamic("obbFile")(obbFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceFile]
  }
}

