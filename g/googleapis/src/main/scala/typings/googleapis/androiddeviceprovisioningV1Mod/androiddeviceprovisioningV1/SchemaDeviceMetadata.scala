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
  def apply(): SchemaDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceMetadata]
  }
  @scala.inline
  implicit class SchemaDeviceMetadataOps[Self <: SchemaDeviceMetadata] (val x: Self) extends AnyVal {
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
    def setEntries(value: StringDictionary[String]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}

