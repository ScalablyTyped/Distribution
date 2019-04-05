package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummariesCollection extends js.Object {
  // Gets the account's active ad summary by account ID.
  def get(profileId: java.lang.String, summaryAccountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AccountActiveAdSummary
}

object AccountActiveAdSummariesCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AccountActiveAdSummary
  ): AccountActiveAdSummariesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[AccountActiveAdSummariesCollection]
  }
}

