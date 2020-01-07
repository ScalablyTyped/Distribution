package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A shielded VM identity entry.
  */
@js.native
trait Schema$ShieldedVmIdentity extends js.Object {
  /**
    * An Endorsement Key (EK) issued to the Shielded VM&#39;s vTPM.
    */
  var encryptionKey: js.UndefOr[Schema$ShieldedVmIdentityEntry] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#shieldedVmIdentity for
    * shielded VM identity entry.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An Attestation Key (AK) issued to the Shielded VM&#39;s vTPM.
    */
  var signingKey: js.UndefOr[Schema$ShieldedVmIdentityEntry] = js.native
}

object Schema$ShieldedVmIdentity {
  @scala.inline
  def apply(
    encryptionKey: Schema$ShieldedVmIdentityEntry = null,
    kind: String = null,
    signingKey: Schema$ShieldedVmIdentityEntry = null
  ): Schema$ShieldedVmIdentity = {
    val __obj = js.Dynamic.literal()
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (signingKey != null) __obj.updateDynamic("signingKey")(signingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShieldedVmIdentity]
  }
}

