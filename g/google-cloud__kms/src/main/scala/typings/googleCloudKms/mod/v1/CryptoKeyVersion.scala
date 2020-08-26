package typings.googleCloudKms.mod.v1

import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKeyVersion extends js.Object {
  var algorithm: CryptoKeyVersionAlgorithm = js.native
  var attestation: js.UndefOr[KeyOperationAttestation] = js.native
  var createTime: AsObject = js.native
  var destroyEventTime: js.UndefOr[AsObject] = js.native
  var destroyTime: js.UndefOr[AsObject] = js.native
  var generateTime: AsObject = js.native
  var name: String = js.native
  var protectionLevel: ProtectionLevel = js.native
  var state: CryptoKeyVersionState = js.native
}

object CryptoKeyVersion {
  @scala.inline
  def apply(
    algorithm: CryptoKeyVersionAlgorithm,
    createTime: AsObject,
    generateTime: AsObject,
    name: String,
    protectionLevel: ProtectionLevel,
    state: CryptoKeyVersionState
  ): CryptoKeyVersion = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], generateTime = generateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
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
    def setAlgorithm(value: CryptoKeyVersionAlgorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateTime(value: AsObject): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateTime(value: AsObject): Self = this.set("generateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtectionLevel(value: ProtectionLevel): Self = this.set("protectionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: CryptoKeyVersionState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttestation(value: KeyOperationAttestation): Self = this.set("attestation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttestation: Self = this.set("attestation", js.undefined)
    @scala.inline
    def setDestroyEventTime(value: AsObject): Self = this.set("destroyEventTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyEventTime: Self = this.set("destroyEventTime", js.undefined)
    @scala.inline
    def setDestroyTime(value: AsObject): Self = this.set("destroyTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyTime: Self = this.set("destroyTime", js.undefined)
  }
  
}

