package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksSetPrivateIpGoogleAccessRequest extends js.Object {
  var privateIpGoogleAccess: js.UndefOr[scala.Boolean] = js.undefined
}

object SubnetworksSetPrivateIpGoogleAccessRequest {
  @scala.inline
  def apply(privateIpGoogleAccess: js.UndefOr[scala.Boolean] = js.undefined): SubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(privateIpGoogleAccess)) __obj.updateDynamic("privateIpGoogleAccess")(privateIpGoogleAccess)
    __obj.asInstanceOf[SubnetworksSetPrivateIpGoogleAccessRequest]
  }
}

