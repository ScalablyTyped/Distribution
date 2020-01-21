package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Shielded Instance Identity Entry.
  */
@js.native
trait SchemaShieldedInstanceIdentityEntry extends js.Object {
  /**
    * A PEM-encoded X.509 certificate. This field can be empty.
    */
  var ekCert: js.UndefOr[String] = js.native
  /**
    * A PEM-encoded public key.
    */
  var ekPub: js.UndefOr[String] = js.native
}

object SchemaShieldedInstanceIdentityEntry {
  @scala.inline
  def apply(ekCert: String = null, ekPub: String = null): SchemaShieldedInstanceIdentityEntry = {
    val __obj = js.Dynamic.literal()
    if (ekCert != null) __obj.updateDynamic("ekCert")(ekCert.asInstanceOf[js.Any])
    if (ekPub != null) __obj.updateDynamic("ekPub")(ekPub.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShieldedInstanceIdentityEntry]
  }
}

