package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CryptoKeyVersion represents an individual cryptographic key, and the
  * associated key material.  An ENABLED version can be used for cryptographic
  * operations.  For security reasons, the raw cryptographic key material
  * represented by a CryptoKeyVersion can never be viewed or exported. It can
  * only be used to encrypt, decrypt, or sign data when an authorized user or
  * application invokes Cloud KMS.
  */
@js.native
trait Schema$CryptoKeyVersion extends js.Object {
  /**
    * Output only. The CryptoKeyVersionAlgorithm that this CryptoKeyVersion
    * supports.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * Output only. Statement that was generated and signed by the HSM at key
    * creation time. Use this statement to verify attributes of the key as
    * stored on the HSM, independently of Google. Only provided for key
    * versions with protection_level HSM.
    */
  var attestation: js.UndefOr[Schema$KeyOperationAttestation] = js.native
  /**
    * Output only. The time at which this CryptoKeyVersion was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion&#39;s key material was
    * destroyed. Only present if state is DESTROYED.
    */
  var destroyEventTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion&#39;s key material is
    * scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
    */
  var destroyTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time this CryptoKeyVersion&#39;s key material was
    * generated.
    */
  var generateTime: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name for this CryptoKeyVersion in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x/cryptoKeyVersions/x.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The ProtectionLevel describing how crypto operations are
    * performed with this CryptoKeyVersion.
    */
  var protectionLevel: js.UndefOr[String] = js.native
  /**
    * The current state of the CryptoKeyVersion.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$CryptoKeyVersion {
  @scala.inline
  def apply(
    algorithm: String = null,
    attestation: Schema$KeyOperationAttestation = null,
    createTime: String = null,
    destroyEventTime: String = null,
    destroyTime: String = null,
    generateTime: String = null,
    name: String = null,
    protectionLevel: String = null,
    state: String = null
  ): Schema$CryptoKeyVersion = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (attestation != null) __obj.updateDynamic("attestation")(attestation.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (destroyEventTime != null) __obj.updateDynamic("destroyEventTime")(destroyEventTime.asInstanceOf[js.Any])
    if (destroyTime != null) __obj.updateDynamic("destroyTime")(destroyTime.asInstanceOf[js.Any])
    if (generateTime != null) __obj.updateDynamic("generateTime")(generateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protectionLevel != null) __obj.updateDynamic("protectionLevel")(protectionLevel.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CryptoKeyVersion]
  }
}

