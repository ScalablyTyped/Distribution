package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SubnetworksSetPrivateIpGoogleAccessRequest extends js.Object {
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
}

object Schema$SubnetworksSetPrivateIpGoogleAccessRequest {
  @scala.inline
  def apply(privateIpGoogleAccess: js.UndefOr[Boolean] = js.undefined): Schema$SubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(privateIpGoogleAccess)) __obj.updateDynamic("privateIpGoogleAccess")(privateIpGoogleAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubnetworksSetPrivateIpGoogleAccessRequest]
  }
}

