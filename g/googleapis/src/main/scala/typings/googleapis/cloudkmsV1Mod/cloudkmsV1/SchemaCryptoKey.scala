package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CryptoKey represents a logical key that can be used for cryptographic
  * operations.  A CryptoKey is made up of one or more versions, which
  * represent the actual key material used in cryptographic operations.
  */
@js.native
trait SchemaCryptoKey extends js.Object {
  /**
    * Output only. The time at which this CryptoKey was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Labels with user-defined metadata. For more information, see [Labeling
    * Keys](/kms/docs/labeling-keys).
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. The resource name for this CryptoKey in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * At next_rotation_time, the Key Management Service will automatically:  1.
    * Create a new version of this CryptoKey. 2. Mark the new version as
    * primary.  Key rotations performed manually via CreateCryptoKeyVersion and
    * UpdateCryptoKeyPrimaryVersion do not affect next_rotation_time.  Keys
    * with purpose ENCRYPT_DECRYPT support automatic rotation. For other keys,
    * this field must be omitted.
    */
  var nextRotationTime: js.UndefOr[String] = js.native
  /**
    * Output only. A copy of the &quot;primary&quot; CryptoKeyVersion that will
    * be used by Encrypt when this CryptoKey is given in EncryptRequest.name.
    * The CryptoKey&#39;s primary version can be updated via
    * UpdateCryptoKeyPrimaryVersion.  All keys with purpose ENCRYPT_DECRYPT
    * have a primary. For other keys, this field will be omitted.
    */
  var primary: js.UndefOr[SchemaCryptoKeyVersion] = js.native
  /**
    * The immutable purpose of this CryptoKey.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * next_rotation_time will be advanced by this period when the service
    * automatically rotates a key. Must be at least one day.  If
    * rotation_period is set, next_rotation_time must also be set.  Keys with
    * purpose ENCRYPT_DECRYPT support automatic rotation. For other keys, this
    * field must be omitted.
    */
  var rotationPeriod: js.UndefOr[String] = js.native
  /**
    * A template describing settings for new CryptoKeyVersion instances. The
    * properties of new CryptoKeyVersion instances created by either
    * CreateCryptoKeyVersion or auto-rotation are controlled by this template.
    */
  var versionTemplate: js.UndefOr[SchemaCryptoKeyVersionTemplate] = js.native
}

object SchemaCryptoKey {
  @scala.inline
  def apply(
    createTime: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    nextRotationTime: String = null,
    primary: SchemaCryptoKeyVersion = null,
    purpose: String = null,
    rotationPeriod: String = null,
    versionTemplate: SchemaCryptoKeyVersionTemplate = null
  ): SchemaCryptoKey = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextRotationTime != null) __obj.updateDynamic("nextRotationTime")(nextRotationTime.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (rotationPeriod != null) __obj.updateDynamic("rotationPeriod")(rotationPeriod.asInstanceOf[js.Any])
    if (versionTemplate != null) __obj.updateDynamic("versionTemplate")(versionTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCryptoKey]
  }
}

