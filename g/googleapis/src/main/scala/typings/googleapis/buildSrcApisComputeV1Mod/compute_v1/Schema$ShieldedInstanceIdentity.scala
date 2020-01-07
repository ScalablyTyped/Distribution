package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A shielded Instance identity entry.
  */
@js.native
trait Schema$ShieldedInstanceIdentity extends js.Object {
  /**
    * An Endorsement Key (EK) issued to the Shielded Instance&#39;s vTPM.
    */
  var encryptionKey: js.UndefOr[Schema$ShieldedInstanceIdentityEntry] = js.native
  /**
    * [Output Only] Type of the resource. Always
    * compute#shieldedInstanceIdentity for shielded Instance identity entry.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An Attestation Key (AK) issued to the Shielded Instance&#39;s vTPM.
    */
  var signingKey: js.UndefOr[Schema$ShieldedInstanceIdentityEntry] = js.native
}

object Schema$ShieldedInstanceIdentity {
  @scala.inline
  def apply(
    encryptionKey: Schema$ShieldedInstanceIdentityEntry = null,
    kind: String = null,
    signingKey: Schema$ShieldedInstanceIdentityEntry = null
  ): Schema$ShieldedInstanceIdentity = {
    val __obj = js.Dynamic.literal()
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (signingKey != null) __obj.updateDynamic("signingKey")(signingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShieldedInstanceIdentity]
  }
}

