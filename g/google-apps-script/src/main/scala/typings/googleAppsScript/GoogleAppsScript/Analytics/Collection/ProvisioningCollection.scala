package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTicket
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeRequest
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningCollection extends js.Object {
  // Creates an account ticket.
  def createAccountTicket(resource: AccountTicket): AccountTicket
  // Provision account.
  def createAccountTree(resource: AccountTreeRequest): AccountTreeResponse
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
}

