package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningResource extends js.Object {
  /** Creates an account ticket. */
  def createAccountTicket(request: FieldsKey): Request[AccountTicket] = js.native
}

object ProvisioningResource {
  @scala.inline
  def apply(createAccountTicket: FieldsKey => Request[AccountTicket]): ProvisioningResource = {
    val __obj = js.Dynamic.literal(createAccountTicket = js.Any.fromFunction1(createAccountTicket))
    __obj.asInstanceOf[ProvisioningResource]
  }
  @scala.inline
  implicit class ProvisioningResourceOps[Self <: ProvisioningResource] (val x: Self) extends AnyVal {
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
    def setCreateAccountTicket(value: FieldsKey => Request[AccountTicket]): Self = this.set("createAccountTicket", js.Any.fromFunction1(value))
  }
  
}

