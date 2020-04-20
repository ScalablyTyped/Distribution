package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningResource extends js.Object {
  /** Creates an account ticket. */
  def createAccountTicket(request: AnonFieldsKey): Request_[AccountTicket]
}

object ProvisioningResource {
  @scala.inline
  def apply(createAccountTicket: AnonFieldsKey => Request_[AccountTicket]): ProvisioningResource = {
    val __obj = js.Dynamic.literal(createAccountTicket = js.Any.fromFunction1(createAccountTicket))
    __obj.asInstanceOf[ProvisioningResource]
  }
}

