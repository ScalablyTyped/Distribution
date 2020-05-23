package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningResource extends js.Object {
  /** Creates an account ticket. */
  def createAccountTicket(request: FieldsKey): Request[AccountTicket]
}

object ProvisioningResource {
  @scala.inline
  def apply(createAccountTicket: FieldsKey => Request[AccountTicket]): ProvisioningResource = {
    val __obj = js.Dynamic.literal(createAccountTicket = js.Any.fromFunction1(createAccountTicket))
    __obj.asInstanceOf[ProvisioningResource]
  }
}

