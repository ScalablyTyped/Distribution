package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterBgp extends js.Object {
  /**
    * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource.
    * All VPN tunnels that link to this router will have the same local ASN.
    */
  var asn: js.UndefOr[scala.Double] = js.undefined
}

object RouterBgp {
  @scala.inline
  def apply(asn: scala.Int | scala.Double = null): RouterBgp = {
    val __obj = js.Dynamic.literal()
    if (asn != null) __obj.updateDynamic("asn")(asn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterBgp]
  }
}

