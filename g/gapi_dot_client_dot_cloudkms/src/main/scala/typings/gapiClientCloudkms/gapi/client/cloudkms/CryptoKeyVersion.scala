package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKeyVersion extends js.Object {
  /** Output only. The time at which this CryptoKeyVersion was created. */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion's key material was
    * destroyed. Only present if state is
    * DESTROYED.
    */
  var destroyEventTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion's key material is scheduled
    * for destruction. Only present if state is
    * DESTROY_SCHEDULED.
    */
  var destroyTime: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name for this CryptoKeyVersion in the format
    * `projects/&#42;/locations/&#42;/keyRings/&#42;/cryptoKeys/&#42;/cryptoKeyVersions/&#42;`.
    */
  var name: js.UndefOr[String] = js.native
  /** The current state of the CryptoKeyVersion. */
  var state: js.UndefOr[String] = js.native
}

object CryptoKeyVersion {
  @scala.inline
  def apply(): CryptoKeyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKeyVersion]
  }
  @scala.inline
  implicit class CryptoKeyVersionOps[Self <: CryptoKeyVersion] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDestroyEventTime(value: String): Self = this.set("destroyEventTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyEventTime: Self = this.set("destroyEventTime", js.undefined)
    @scala.inline
    def setDestroyTime(value: String): Self = this.set("destroyTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyTime: Self = this.set("destroyTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

