package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMetadata extends js.Object {
  /** Metadata entries */
  var entries: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object DeviceMetadata {
  @scala.inline
  def apply(entries: stdLib.Record[java.lang.String, java.lang.String] = null): DeviceMetadata = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[DeviceMetadata]
  }
}

