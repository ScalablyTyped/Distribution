package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKey extends js.Object {
  /** Output only. The time at which this CryptoKey was created. */
  var createTime: js.UndefOr[String] = js.undefined
  /** Labels with user defined metadata. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Output only. The resource name for this CryptoKey in the format
    * `projects/&#42;/locations/&#42;/keyRings/&#42;/cryptoKeys/&#42;`.
    */
  var name: js.UndefOr[String] = js.undefined
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
  var nextRotationTime: js.UndefOr[String] = js.undefined
  /**
    * Output only. A copy of the "primary" CryptoKeyVersion that will be used
    * by Encrypt when this CryptoKey is given
    * in EncryptRequest.name.
    *
    * The CryptoKey's primary version can be updated via
    * UpdateCryptoKeyPrimaryVersion.
    */
  var primary: js.UndefOr[CryptoKeyVersion] = js.undefined
  /**
    * The immutable purpose of this CryptoKey. Currently, the only acceptable
    * purpose is ENCRYPT_DECRYPT.
    */
  var purpose: js.UndefOr[String] = js.undefined
  /**
    * next_rotation_time will be advanced by this period when the service
    * automatically rotates a key. Must be at least one day.
    *
    * If rotation_period is set, next_rotation_time must also be set.
    */
  var rotationPeriod: js.UndefOr[String] = js.undefined
}

object CryptoKey {
  @scala.inline
  def apply(
    createTime: String = null,
    labels: Record[String, String] = null,
    name: String = null,
    nextRotationTime: String = null,
    primary: CryptoKeyVersion = null,
    purpose: String = null,
    rotationPeriod: String = null
  ): CryptoKey = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextRotationTime != null) __obj.updateDynamic("nextRotationTime")(nextRotationTime.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (rotationPeriod != null) __obj.updateDynamic("rotationPeriod")(rotationPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
}

