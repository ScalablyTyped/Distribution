package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.ListHistoryResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryCollection extends js.Object {
  // Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId).
  def list(userId: String): ListHistoryResponse = js.native
  // Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId).
  def list(userId: String, optionalArgs: js.Object): ListHistoryResponse = js.native
}

