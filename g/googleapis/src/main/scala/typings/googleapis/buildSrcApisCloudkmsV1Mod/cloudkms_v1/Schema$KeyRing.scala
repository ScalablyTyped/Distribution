package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A KeyRing is a toplevel logical grouping of CryptoKeys.
  */
@js.native
trait Schema$KeyRing extends js.Object {
  /**
    * Output only. The time at which this KeyRing was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name for the KeyRing in the format
    * `projects/x/locations/x/keyRings/x.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$KeyRing {
  @scala.inline
  def apply(createTime: String = null, name: String = null): Schema$KeyRing = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$KeyRing]
  }
}

