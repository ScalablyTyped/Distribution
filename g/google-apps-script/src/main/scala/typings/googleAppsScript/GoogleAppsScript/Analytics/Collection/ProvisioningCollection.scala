package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTicket
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeRequest
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningCollection extends js.Object {
  
  // Creates an account ticket.
  def createAccountTicket(resource: AccountTicket): AccountTicket = js.native
  
  // Provision account.
  def createAccountTree(resource: AccountTreeRequest): AccountTreeResponse = js.native
}
object ProvisioningCollection {
  
  @scala.inline
  def apply(
    createAccountTicket: AccountTicket => AccountTicket,
    createAccountTree: AccountTreeRequest => AccountTreeResponse
  ): ProvisioningCollection = {
    val __obj = js.Dynamic.literal(createAccountTicket = js.Any.fromFunction1(createAccountTicket), createAccountTree = js.Any.fromFunction1(createAccountTree))
    __obj.asInstanceOf[ProvisioningCollection]
  }
  
  @scala.inline
  implicit class ProvisioningCollectionOps[Self <: ProvisioningCollection] (val x: Self) extends AnyVal {
    
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
    def setCreateAccountTicket(value: AccountTicket => AccountTicket): Self = this.set("createAccountTicket", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAccountTree(value: AccountTreeRequest => AccountTreeResponse): Self = this.set("createAccountTree", js.Any.fromFunction1(value))
  }
}
