package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Account
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Accounts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsCollection extends js.Object {
  var Adclients: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.AdclientsCollection
  ] = js.native
  var Adunits: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.AdunitsCollection
  ] = js.native
  var Alerts: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.AlertsCollection
  ] = js.native
  var Customchannels: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.CustomchannelsCollection
  ] = js.native
  var Payments: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.PaymentsCollection
  ] = js.native
  var Reports: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.ReportsCollection
  ] = js.native
  var Savedadstyles: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.SavedadstylesCollection
  ] = js.native
  var Urlchannels: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.UrlchannelsCollection
  ] = js.native
  // Get information about the selected AdSense account.
  def get(accountId: String): Account = js.native
  // Get information about the selected AdSense account.
  def get(accountId: String, optionalArgs: js.Object): Account = js.native
  // List all accounts available to this AdSense account.
  def list(): Accounts = js.native
  // List all accounts available to this AdSense account.
  def list(optionalArgs: js.Object): Accounts = js.native
}

