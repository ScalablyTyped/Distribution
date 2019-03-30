package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCollection extends js.Object {
  var Delegates: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.DelegatesCollection
  ] = js.undefined
  var Filters: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.FiltersCollection
  ] = js.undefined
  var ForwardingAddresses: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.ForwardingAddressesCollection
  ] = js.undefined
  var SendAs: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.SendAsCollection
  ] = js.undefined
  // Gets the auto-forwarding setting for the specified account.
  def getAutoForwarding(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.AutoForwarding
  // Gets IMAP settings.
  def getImap(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ImapSettings
  // Gets POP settings.
  def getPop(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.PopSettings
  // Gets vacation responder settings.
  def getVacation(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.VacationSettings
  // Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def updateAutoForwarding(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.AutoForwarding,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.AutoForwarding
  // Updates IMAP settings.
  def updateImap(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ImapSettings,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ImapSettings
  // Updates POP settings.
  def updatePop(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.PopSettings,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.PopSettings
  // Updates vacation responder settings.
  def updateVacation(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.VacationSettings,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.VacationSettings
}

object SettingsCollection {
  @scala.inline
  def apply(
    getAutoForwarding: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.AutoForwarding,
    getImap: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ImapSettings,
    getPop: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.PopSettings,
    getVacation: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.VacationSettings,
    updateAutoForwarding: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.AutoForwarding, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.AutoForwarding,
    updateImap: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ImapSettings, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ImapSettings,
    updatePop: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.PopSettings, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.PopSettings,
    updateVacation: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.VacationSettings, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.VacationSettings,
    Delegates: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.DelegatesCollection = null,
    Filters: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.FiltersCollection = null,
    ForwardingAddresses: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.ForwardingAddressesCollection = null,
    SendAs: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.SendAsCollection = null
  ): SettingsCollection = {
    val __obj = js.Dynamic.literal(getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), updateAutoForwarding = js.Any.fromFunction2(updateAutoForwarding), updateImap = js.Any.fromFunction2(updateImap), updatePop = js.Any.fromFunction2(updatePop), updateVacation = js.Any.fromFunction2(updateVacation))
    if (Delegates != null) __obj.updateDynamic("Delegates")(Delegates)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (ForwardingAddresses != null) __obj.updateDynamic("ForwardingAddresses")(ForwardingAddresses)
    if (SendAs != null) __obj.updateDynamic("SendAs")(SendAs)
    __obj.asInstanceOf[SettingsCollection]
  }
}

