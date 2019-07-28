package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.AccountActiveAdSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummariesCollection extends js.Object {
  // Gets the account's active ad summary by account ID.
  def get(profileId: String, summaryAccountId: String): AccountActiveAdSummary
}

object AccountActiveAdSummariesCollection {
  @scala.inline
  def apply(get: (String, String) => AccountActiveAdSummary): AccountActiveAdSummariesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[AccountActiveAdSummariesCollection]
  }
}

