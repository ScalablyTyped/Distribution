package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata entries that can be attached to a `Device`. To learn more, read
  * [Device metadata](/zero-touch/guides/metadata).
  */
@js.native
trait Schema$DeviceMetadata extends js.Object {
  /**
    * Metadata entries recorded as key-value pairs.
    */
  var entries: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$DeviceMetadata {
  @scala.inline
  def apply(entries: StringDictionary[String] = null): Schema$DeviceMetadata = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeviceMetadata]
  }
}

