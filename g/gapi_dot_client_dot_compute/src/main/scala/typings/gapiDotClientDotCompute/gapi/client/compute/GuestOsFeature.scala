package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuestOsFeature extends js.Object {
  /**
    * The type of supported feature. Currently only VIRTIO_SCSI_MULTIQUEUE is supported. For newer Windows images, the server might also populate this
    * property with the value WINDOWS to indicate that this is a Windows image.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object GuestOsFeature {
  @scala.inline
  def apply(`type`: String = null): GuestOsFeature = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuestOsFeature]
  }
}

