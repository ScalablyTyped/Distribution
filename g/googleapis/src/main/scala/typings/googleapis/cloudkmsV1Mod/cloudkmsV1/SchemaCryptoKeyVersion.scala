package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

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
trait SchemaCryptoKeyVersion extends js.Object {
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
  var attestation: js.UndefOr[SchemaKeyOperationAttestation] = js.native
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

object SchemaCryptoKeyVersion {
  @scala.inline
  def apply(): SchemaCryptoKeyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoKeyVersion]
  }
  @scala.inline
  implicit class SchemaCryptoKeyVersionOps[Self <: SchemaCryptoKeyVersion] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setAttestation(value: SchemaKeyOperationAttestation): Self = this.set("attestation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttestation: Self = this.set("attestation", js.undefined)
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
    def setGenerateTime(value: String): Self = this.set("generateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateTime: Self = this.set("generateTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProtectionLevel(value: String): Self = this.set("protectionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtectionLevel: Self = this.set("protectionLevel", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

