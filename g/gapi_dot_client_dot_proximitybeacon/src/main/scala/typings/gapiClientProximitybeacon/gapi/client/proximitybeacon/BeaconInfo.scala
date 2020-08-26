package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeaconInfo extends js.Object {
  /** The ID advertised by the beacon. */
  var advertisedId: js.UndefOr[AdvertisedId] = js.native
  /**
    * Attachments matching the type(s) requested.
    * May be empty if no attachment types were requested.
    */
  var attachments: js.UndefOr[js.Array[AttachmentInfo]] = js.native
  /** The name under which the beacon is registered. */
  var beaconName: js.UndefOr[String] = js.native
}

object BeaconInfo {
  @scala.inline
  def apply(): BeaconInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeaconInfo]
  }
  @scala.inline
  implicit class BeaconInfoOps[Self <: BeaconInfo] (val x: Self) extends AnyVal {
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
    def setAdvertisedId(value: AdvertisedId): Self = this.set("advertisedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisedId: Self = this.set("advertisedId", js.undefined)
    @scala.inline
    def setAttachmentsVarargs(value: AttachmentInfo*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[AttachmentInfo]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBeaconName(value: String): Self = this.set("beaconName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeaconName: Self = this.set("beaconName", js.undefined)
  }
  
}

