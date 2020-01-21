package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata entries that can be attached to a `Device`. To learn more, read
  * [Device metadata](/zero-touch/guides/metadata).
  */
@js.native
trait SchemaDeviceMetadata extends js.Object {
  /**
    * Metadata entries recorded as key-value pairs.
    */
  var entries: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaDeviceMetadata {
  @scala.inline
  def apply(entries: StringDictionary[String] = null): SchemaDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeviceMetadata]
  }
}

