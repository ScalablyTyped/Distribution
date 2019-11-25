package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Collection.Users

import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Collection.Users.Settings.DelegatesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Collection.Users.Settings.FiltersCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Collection.Users.Settings.ForwardingAddressesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.AutoForwarding
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.ImapSettings
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.PopSettings
import typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema.VacationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCollection extends js.Object {
  var Delegates: js.UndefOr[DelegatesCollection] = js.undefined
  var Filters: js.UndefOr[FiltersCollection] = js.undefined
  var ForwardingAddresses: js.UndefOr[ForwardingAddressesCollection] = js.undefined
  var SendAs: js.UndefOr[SendAsCollection] = js.undefined
  // Gets the auto-forwarding setting for the specified account.
  def getAutoForwarding(userId: String): AutoForwarding
  // Gets IMAP settings.
  def getImap(userId: String): ImapSettings
  // Gets POP settings.
  def getPop(userId: String): PopSettings
  // Gets vacation responder settings.
  def getVacation(userId: String): VacationSettings
  // Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def updateAutoForwarding(resource: AutoForwarding, userId: String): AutoForwarding
  // Updates IMAP settings.
  def updateImap(resource: ImapSettings, userId: String): ImapSettings
  // Updates POP settings.
  def updatePop(resource: PopSettings, userId: String): PopSettings
  // Updates vacation responder settings.
  def updateVacation(resource: VacationSettings, userId: String): VacationSettings
}

object SettingsCollection {
  @scala.inline
  def apply(
    getAutoForwarding: String => AutoForwarding,
    getImap: String => ImapSettings,
    getPop: String => PopSettings,
    getVacation: String => VacationSettings,
    updateAutoForwarding: (AutoForwarding, String) => AutoForwarding,
    updateImap: (ImapSettings, String) => ImapSettings,
    updatePop: (PopSettings, String) => PopSettings,
    updateVacation: (VacationSettings, String) => VacationSettings,
    Delegates: DelegatesCollection = null,
    Filters: FiltersCollection = null,
    ForwardingAddresses: ForwardingAddressesCollection = null,
    SendAs: SendAsCollection = null
  ): SettingsCollection = {
    val __obj = js.Dynamic.literal(getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), updateAutoForwarding = js.Any.fromFunction2(updateAutoForwarding), updateImap = js.Any.fromFunction2(updateImap), updatePop = js.Any.fromFunction2(updatePop), updateVacation = js.Any.fromFunction2(updateVacation))
    if (Delegates != null) __obj.updateDynamic("Delegates")(Delegates.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (ForwardingAddresses != null) __obj.updateDynamic("ForwardingAddresses")(ForwardingAddresses.asInstanceOf[js.Any])
    if (SendAs != null) __obj.updateDynamic("SendAs")(SendAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsCollection]
  }
}

