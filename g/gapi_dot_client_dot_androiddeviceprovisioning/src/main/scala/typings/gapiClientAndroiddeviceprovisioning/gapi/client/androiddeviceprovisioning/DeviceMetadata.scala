package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMetadata extends js.Object {
  /** Metadata entries */
  var entries: js.UndefOr[Record[String, String]] = js.undefined
}

object DeviceMetadata {
  @scala.inline
  def apply(entries: Record[String, String] = null): DeviceMetadata = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetadata]
  }
}

