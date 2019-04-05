package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCollection extends js.Object {
  var Delegates: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.DelegatesCollection
  ] = js.undefined
  var Filters: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.FiltersCollection
  ] = js.undefined
  var ForwardingAddresses: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.ForwardingAddressesCollection
  ] = js.undefined
  var SendAs: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.SendAsCollection
  ] = js.undefined
  // Gets the auto-forwarding setting for the specified account.
  def getAutoForwarding(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.AutoForwarding
  // Gets IMAP settings.
  def getImap(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ImapSettings
  // Gets POP settings.
  def getPop(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.PopSettings
  // Gets vacation responder settings.
  def getVacation(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.VacationSettings
  // Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def updateAutoForwarding(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.AutoForwarding,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.AutoForwarding
  // Updates IMAP settings.
  def updateImap(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ImapSettings,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ImapSettings
  // Updates POP settings.
  def updatePop(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.PopSettings,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.PopSettings
  // Updates vacation responder settings.
  def updateVacation(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.VacationSettings,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.VacationSettings
}

object SettingsCollection {
  @scala.inline
  def apply(
    getAutoForwarding: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.AutoForwarding,
    getImap: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ImapSettings,
    getPop: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.PopSettings,
    getVacation: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.VacationSettings,
    updateAutoForwarding: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.AutoForwarding, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.AutoForwarding,
    updateImap: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ImapSettings, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ImapSettings,
    updatePop: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.PopSettings, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.PopSettings,
    updateVacation: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.VacationSettings, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.VacationSettings,
    Delegates: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.DelegatesCollection = null,
    Filters: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.FiltersCollection = null,
    ForwardingAddresses: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.ForwardingAddressesCollection = null,
    SendAs: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs.SendAsCollection = null
  ): SettingsCollection = {
    val __obj = js.Dynamic.literal(getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), updateAutoForwarding = js.Any.fromFunction2(updateAutoForwarding), updateImap = js.Any.fromFunction2(updateImap), updatePop = js.Any.fromFunction2(updatePop), updateVacation = js.Any.fromFunction2(updateVacation))
    if (Delegates != null) __obj.updateDynamic("Delegates")(Delegates)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (ForwardingAddresses != null) __obj.updateDynamic("ForwardingAddresses")(ForwardingAddresses)
    if (SendAs != null) __obj.updateDynamic("SendAs")(SendAs)
    __obj.asInstanceOf[SettingsCollection]
  }
}

