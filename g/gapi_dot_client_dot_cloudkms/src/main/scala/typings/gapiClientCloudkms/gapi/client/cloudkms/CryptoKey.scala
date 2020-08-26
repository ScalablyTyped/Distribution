package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKey extends js.Object {
  /** Output only. The time at which this CryptoKey was created. */
  var createTime: js.UndefOr[String] = js.native
  /** Labels with user defined metadata. */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Output only. The resource name for this CryptoKey in the format
    * `projects/&#42;/locations/&#42;/keyRings/&#42;/cryptoKeys/&#42;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * At next_rotation_time, the Key Management Service will automatically:
    *
    * 1. Create a new version of this CryptoKey.
    * 2. Mark the new version as primary.
    *
    * Key rotations performed manually via
    * CreateCryptoKeyVersion and
    * UpdateCryptoKeyPrimaryVersion
    * do not affect next_rotation_time.
    */
  var nextRotationTime: js.UndefOr[String] = js.native
  /**
    * Output only. A copy of the "primary" CryptoKeyVersion that will be used
    * by Encrypt when this CryptoKey is given
    * in EncryptRequest.name.
    *
    * The CryptoKey's primary version can be updated via
    * UpdateCryptoKeyPrimaryVersion.
    */
  var primary: js.UndefOr[CryptoKeyVersion] = js.native
  /**
    * The immutable purpose of this CryptoKey. Currently, the only acceptable
    * purpose is ENCRYPT_DECRYPT.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * next_rotation_time will be advanced by this period when the service
    * automatically rotates a key. Must be at least one day.
    *
    * If rotation_period is set, next_rotation_time must also be set.
    */
  var rotationPeriod: js.UndefOr[String] = js.native
}

object CryptoKey {
  @scala.inline
  def apply(): CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKey]
  }
  @scala.inline
  implicit class CryptoKeyOps[Self <: CryptoKey] (val x: Self) extends AnyVal {
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
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNextRotationTime(value: String): Self = this.set("nextRotationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextRotationTime: Self = this.set("nextRotationTime", js.undefined)
    @scala.inline
    def setPrimary(value: CryptoKeyVersion): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setPurpose(value: String): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setRotationPeriod(value: String): Self = this.set("rotationPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationPeriod: Self = this.set("rotationPeriod", js.undefined)
  }
  
}

