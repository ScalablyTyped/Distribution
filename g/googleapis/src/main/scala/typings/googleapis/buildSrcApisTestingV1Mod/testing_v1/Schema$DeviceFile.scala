package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single device file description.
  */
@js.native
trait Schema$DeviceFile extends js.Object {
  /**
    * A reference to an opaque binary blob file
    */
  var obbFile: js.UndefOr[Schema$ObbFile] = js.native
  /**
    * A reference to a regular file
    */
  var regularFile: js.UndefOr[Schema$RegularFile] = js.native
}

object Schema$DeviceFile {
  @scala.inline
  def apply(obbFile: Schema$ObbFile = null, regularFile: Schema$RegularFile = null): Schema$DeviceFile = {
    val __obj = js.Dynamic.literal()
    if (obbFile != null) __obj.updateDynamic("obbFile")(obbFile.asInstanceOf[js.Any])
    if (regularFile != null) __obj.updateDynamic("regularFile")(regularFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeviceFile]
  }
}

