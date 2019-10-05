package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.Account
import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.AccountsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsCollection extends js.Object {
  // Gets one account by ID.
  def get(profileId: String, id: String): Account = js.native
  // Retrieves the list of accounts, possibly filtered. This method supports paging.
  def list(profileId: String): AccountsListResponse = js.native
  // Retrieves the list of accounts, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): AccountsListResponse = js.native
  // Updates an existing account. This method supports patch semantics.
  def patch(resource: Account, profileId: String, id: String): Account = js.native
  // Updates an existing account.
  def update(resource: Account, profileId: String): Account = js.native
}

