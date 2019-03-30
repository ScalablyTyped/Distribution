package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsCollection extends js.Object {
  // List the payments for this AdSense account.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.Payments
}

object PaymentsCollection {
  @scala.inline
  def apply(
    list: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.Payments
  ): PaymentsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[PaymentsCollection]
  }
}

