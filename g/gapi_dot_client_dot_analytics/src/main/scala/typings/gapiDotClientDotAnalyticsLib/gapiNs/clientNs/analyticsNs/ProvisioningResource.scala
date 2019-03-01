package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningResource extends js.Object {
  /** Creates an account ticket. */
  def createAccountTicket(request: gapiDotClientDotAnalyticsLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[AccountTicket]
}

object ProvisioningResource {
  @scala.inline
  def apply(
    createAccountTicket: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountTicket]
    ]
  ): ProvisioningResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAccountTicket")(createAccountTicket)
    __obj.asInstanceOf[ProvisioningResource]
  }
}

