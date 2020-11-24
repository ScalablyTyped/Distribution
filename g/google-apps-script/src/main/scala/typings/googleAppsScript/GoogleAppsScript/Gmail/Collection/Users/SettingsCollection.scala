package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users

import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.DelegatesCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.FiltersCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.ForwardingAddressesCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAsCollection
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.AutoForwarding
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ImapSettings
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.PopSettings
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.VacationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsCollection extends js.Object {
  
  var Delegates: js.UndefOr[DelegatesCollection] = js.native
  
  var Filters: js.UndefOr[FiltersCollection] = js.native
  
  var ForwardingAddresses: js.UndefOr[ForwardingAddressesCollection] = js.native
  
  var SendAs: js.UndefOr[SendAsCollection] = js.native
  
  // Gets the auto-forwarding setting for the specified account.
  def getAutoForwarding(userId: String): AutoForwarding = js.native
  
  // Gets IMAP settings.
  def getImap(userId: String): ImapSettings = js.native
  
  // Gets POP settings.
  def getPop(userId: String): PopSettings = js.native
  
  // Gets vacation responder settings.
  def getVacation(userId: String): VacationSettings = js.native
  
  // Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def updateAutoForwarding(resource: AutoForwarding, userId: String): AutoForwarding = js.native
  
  // Updates IMAP settings.
  def updateImap(resource: ImapSettings, userId: String): ImapSettings = js.native
  
  // Updates POP settings.
  def updatePop(resource: PopSettings, userId: String): PopSettings = js.native
  
  // Updates vacation responder settings.
  def updateVacation(resource: VacationSettings, userId: String): VacationSettings = js.native
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
    updateVacation: (VacationSettings, String) => VacationSettings
  ): SettingsCollection = {
    val __obj = js.Dynamic.literal(getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), updateAutoForwarding = js.Any.fromFunction2(updateAutoForwarding), updateImap = js.Any.fromFunction2(updateImap), updatePop = js.Any.fromFunction2(updatePop), updateVacation = js.Any.fromFunction2(updateVacation))
    __obj.asInstanceOf[SettingsCollection]
  }
  
  @scala.inline
  implicit class SettingsCollectionOps[Self <: SettingsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAutoForwarding(value: String => AutoForwarding): Self = this.set("getAutoForwarding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetImap(value: String => ImapSettings): Self = this.set("getImap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPop(value: String => PopSettings): Self = this.set("getPop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVacation(value: String => VacationSettings): Self = this.set("getVacation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateAutoForwarding(value: (AutoForwarding, String) => AutoForwarding): Self = this.set("updateAutoForwarding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateImap(value: (ImapSettings, String) => ImapSettings): Self = this.set("updateImap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdatePop(value: (PopSettings, String) => PopSettings): Self = this.set("updatePop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateVacation(value: (VacationSettings, String) => VacationSettings): Self = this.set("updateVacation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelegates(value: DelegatesCollection): Self = this.set("Delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegates: Self = this.set("Delegates", js.undefined)
    
    @scala.inline
    def setFilters(value: FiltersCollection): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setForwardingAddresses(value: ForwardingAddressesCollection): Self = this.set("ForwardingAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingAddresses: Self = this.set("ForwardingAddresses", js.undefined)
    
    @scala.inline
    def setSendAs(value: SendAsCollection): Self = this.set("SendAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendAs: Self = this.set("SendAs", js.undefined)
  }
}
