package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObbFile extends js.Object {
  /**
    * Opaque Binary Blob (OBB) file(s) to install on the device
    * Required
    */
  var obb: js.UndefOr[FileReference] = js.undefined
  /**
    * OBB file name which must conform to the format as specified by
    * Android
    * e.g. [main|patch].0300110.com.example.android.obb
    * which will be installed into
    * <shared-storage>/Android/obb/<package-name>/
    * on the device
    * Required
    */
  var obbFileName: js.UndefOr[String] = js.undefined
}

object ObbFile {
  @scala.inline
  def apply(obb: FileReference = null, obbFileName: String = null): ObbFile = {
    val __obj = js.Dynamic.literal()
    if (obb != null) __obj.updateDynamic("obb")(obb)
    if (obbFileName != null) __obj.updateDynamic("obbFileName")(obbFileName)
    __obj.asInstanceOf[ObbFile]
  }
}

