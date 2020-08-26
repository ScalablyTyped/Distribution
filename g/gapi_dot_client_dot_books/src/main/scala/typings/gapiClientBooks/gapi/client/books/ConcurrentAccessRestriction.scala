package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcurrentAccessRestriction extends js.Object {
  /** Whether access is granted for this (user, device, volume). */
  var deviceAllowed: js.UndefOr[Boolean] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** The maximum number of concurrent access licenses for this volume. */
  var maxConcurrentDevices: js.UndefOr[Double] = js.native
  /** Error/warning message. */
  var message: js.UndefOr[String] = js.native
  /** Client nonce for verification. Download access and client-validation only. */
  var nonce: js.UndefOr[String] = js.native
  /** Error/warning reason code. */
  var reasonCode: js.UndefOr[String] = js.native
  /** Whether this volume has any concurrent access restrictions. */
  var restricted: js.UndefOr[Boolean] = js.native
  /** Response signature. */
  var signature: js.UndefOr[String] = js.native
  /** Client app identifier for verification. Download access and client-validation only. */
  var source: js.UndefOr[String] = js.native
  /** Time in seconds for license auto-expiration. */
  var timeWindowSeconds: js.UndefOr[Double] = js.native
  /** Identifies the volume for which this entry applies. */
  var volumeId: js.UndefOr[String] = js.native
}

object ConcurrentAccessRestriction {
  @scala.inline
  def apply(): ConcurrentAccessRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrentAccessRestriction]
  }
  @scala.inline
  implicit class ConcurrentAccessRestrictionOps[Self <: ConcurrentAccessRestriction] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaxConcurrentDevices(value: Double): Self = this.set("maxConcurrentDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrentDevices: Self = this.set("maxConcurrentDevices", js.undefined)
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
    def setTimeWindowSeconds(value: Double): Self = this.set("timeWindowSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeWindowSeconds: Self = this.set("timeWindowSeconds", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

