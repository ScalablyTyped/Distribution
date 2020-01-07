package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Shielded Instance Identity Entry.
  */
@js.native
trait Schema$ShieldedInstanceIdentityEntry extends js.Object {
  /**
    * A PEM-encoded X.509 certificate. This field can be empty.
    */
  var ekCert: js.UndefOr[String] = js.native
  /**
    * A PEM-encoded public key.
    */
  var ekPub: js.UndefOr[String] = js.native
}

object Schema$ShieldedInstanceIdentityEntry {
  @scala.inline
  def apply(ekCert: String = null, ekPub: String = null): Schema$ShieldedInstanceIdentityEntry = {
    val __obj = js.Dynamic.literal()
    if (ekCert != null) __obj.updateDynamic("ekCert")(ekCert.asInstanceOf[js.Any])
    if (ekPub != null) __obj.updateDynamic("ekPub")(ekPub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShieldedInstanceIdentityEntry]
  }
}

