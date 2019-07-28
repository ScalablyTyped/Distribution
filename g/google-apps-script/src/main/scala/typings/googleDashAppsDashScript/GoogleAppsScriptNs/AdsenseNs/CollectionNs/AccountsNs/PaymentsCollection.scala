package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Payments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsCollection extends js.Object {
  // List the payments for the specified AdSense account.
  def list(accountId: String): Payments
}

object PaymentsCollection {
  @scala.inline
  def apply(list: String => Payments): PaymentsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PaymentsCollection]
  }
}

