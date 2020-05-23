package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksSetPrivateIpGoogleAccessRequest extends js.Object {
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.undefined
}

object SubnetworksSetPrivateIpGoogleAccessRequest {
  @scala.inline
  def apply(privateIpGoogleAccess: js.UndefOr[Boolean] = js.undefined): SubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(privateIpGoogleAccess)) __obj.updateDynamic("privateIpGoogleAccess")(privateIpGoogleAccess.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetworksSetPrivateIpGoogleAccessRequest]
  }
}

