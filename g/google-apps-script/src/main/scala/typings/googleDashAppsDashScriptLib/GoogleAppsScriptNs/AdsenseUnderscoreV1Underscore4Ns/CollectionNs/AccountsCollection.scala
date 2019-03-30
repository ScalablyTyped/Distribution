package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsCollection extends js.Object {
  var Adclients: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs.AdclientsCollection
  ] = js.native
  var Adunits: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs.AdunitsCollection
  ] = js.native
  var Alerts: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs.AlertsCollection
  ] = js.native
  var Customchannels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs.CustomchannelsCollection
  ] = js.native
  var Payments: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs.PaymentsCollection
  ] = js.native
  var Reports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs.ReportsCollection
  ] = js.native
  var Savedadstyles: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs.SavedadstylesCollection
  ] = js.native
  var Urlchannels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs.UrlchannelsCollection
  ] = js.native
  // Get information about the selected AdSense account.
  def get(accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.Account = js.native
  // Get information about the selected AdSense account.
  def get(accountId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.Account = js.native
  // List all accounts available to this AdSense account.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.Accounts = js.native
  // List all accounts available to this AdSense account.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.Accounts = js.native
}

