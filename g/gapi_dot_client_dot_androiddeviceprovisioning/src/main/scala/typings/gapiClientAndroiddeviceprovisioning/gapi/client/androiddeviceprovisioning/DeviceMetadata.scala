package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMetadata extends js.Object {
  /** Metadata entries */
  var entries: js.UndefOr[Record[String, String]] = js.native
}

object DeviceMetadata {
  @scala.inline
  def apply(): DeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMetadata]
  }
  @scala.inline
  implicit class DeviceMetadataOps[Self <: DeviceMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntries(value: Record[String, String]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}

