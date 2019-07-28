package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Payments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsCollection extends js.Object {
  // List the payments for this AdSense account.
  def list(): Payments
}

object PaymentsCollection {
  @scala.inline
  def apply(list: () => Payments): PaymentsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[PaymentsCollection]
  }
}

