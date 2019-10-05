package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsCollection extends js.Object {
  var Adclients: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts.AdclientsCollection
  ] = js.native
  var Adunits: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts.AdunitsCollection
  ] = js.native
  var Alerts: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts.AlertsCollection
  ] = js.native
  var Customchannels: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts.CustomchannelsCollection
  ] = js.native
  var Payments: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts.PaymentsCollection
  ] = js.native
  var Reports: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts.ReportsCollection
  ] = js.native
  var Savedadstyles: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts.SavedadstylesCollection
  ] = js.native
  var Urlchannels: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts.UrlchannelsCollection
  ] = js.native
  // Get information about the selected AdSense account.
  def get(accountId: String): Account = js.native
  // Get information about the selected AdSense account.
  def get(accountId: String, optionalArgs: js.Object): Account = js.native
  // List all accounts available to this AdSense account.
  def list(): typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.Accounts = js.native
  // List all accounts available to this AdSense account.
  def list(optionalArgs: js.Object): typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.Accounts = js.native
}

