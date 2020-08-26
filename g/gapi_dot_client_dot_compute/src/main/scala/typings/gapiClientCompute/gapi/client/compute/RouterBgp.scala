package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterBgp extends js.Object {
  /**
    * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource.
    * All VPN tunnels that link to this router will have the same local ASN.
    */
  var asn: js.UndefOr[Double] = js.native
}

object RouterBgp {
  @scala.inline
  def apply(): RouterBgp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterBgp]
  }
  @scala.inline
  implicit class RouterBgpOps[Self <: RouterBgp] (val x: Self) extends AnyVal {
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
    def setAsn(value: Double): Self = this.set("asn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsn: Self = this.set("asn", js.undefined)
  }
  
}

