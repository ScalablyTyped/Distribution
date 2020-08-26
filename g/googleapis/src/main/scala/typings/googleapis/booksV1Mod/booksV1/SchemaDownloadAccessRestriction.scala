package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDownloadAccessRestriction extends js.Object {
  /**
    * If restricted, whether access is granted for this (user, device, volume).
    */
  var deviceAllowed: js.UndefOr[Boolean] = js.native
  /**
    * If restricted, the number of content download licenses already acquired
    * (including the requesting client, if licensed).
    */
  var downloadsAcquired: js.UndefOr[Double] = js.native
  /**
    * If deviceAllowed, whether access was just acquired with this request.
    */
  var justAcquired: js.UndefOr[Boolean] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * If restricted, the maximum number of content download licenses for this
    * volume.
    */
  var maxDownloadDevices: js.UndefOr[Double] = js.native
  /**
    * Error/warning message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Client nonce for verification. Download access and client-validation
    * only.
    */
  var nonce: js.UndefOr[String] = js.native
  /**
    * Error/warning reason code. Additional codes may be added in the future. 0
    * OK 100 ACCESS_DENIED_PUBLISHER_LIMIT 101 ACCESS_DENIED_LIMIT 200
    * WARNING_USED_LAST_ACCESS
    */
  var reasonCode: js.UndefOr[String] = js.native
  /**
    * Whether this volume has any download access restrictions.
    */
  var restricted: js.UndefOr[Boolean] = js.native
  /**
    * Response signature.
    */
  var signature: js.UndefOr[String] = js.native
  /**
    * Client app identifier for verification. Download access and
    * client-validation only.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Identifies the volume for which this entry applies.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object SchemaDownloadAccessRestriction {
  @scala.inline
  def apply(): SchemaDownloadAccessRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadAccessRestriction]
  }
  @scala.inline
  implicit class SchemaDownloadAccessRestrictionOps[Self <: SchemaDownloadAccessRestriction] (val x: Self) extends AnyVal {
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
    def setDeviceAllowed(value: Boolean): Self = this.set("deviceAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceAllowed: Self = this.set("deviceAllowed", js.undefined)
    @scala.inline
    def setDownloadsAcquired(value: Double): Self = this.set("downloadsAcquired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadsAcquired: Self = this.set("downloadsAcquired", js.undefined)
    @scala.inline
    def setJustAcquired(value: Boolean): Self = this.set("justAcquired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustAcquired: Self = this.set("justAcquired", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaxDownloadDevices(value: Double): Self = this.set("maxDownloadDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDownloadDevices: Self = this.set("maxDownloadDevices", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setReasonCode(value: String): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    @scala.inline
    def setRestricted(value: Boolean): Self = this.set("restricted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestricted: Self = this.set("restricted", js.undefined)
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

