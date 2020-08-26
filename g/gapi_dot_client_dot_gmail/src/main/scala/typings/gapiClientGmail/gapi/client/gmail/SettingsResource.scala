package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsResource extends js.Object {
  var filters: FiltersResource = js.native
  var forwardingAddresses: ForwardingAddressesResource = js.native
  var sendAs: SendAsResource = js.native
  /** Gets the auto-forwarding setting for the specified account. */
  def getAutoForwarding(request: Alt): Request[AutoForwarding] = js.native
  /** Gets IMAP settings. */
  def getImap(request: Alt): Request[ImapSettings] = js.native
  /** Gets POP settings. */
  def getPop(request: Alt): Request[PopSettings] = js.native
  /** Gets vacation responder settings. */
  def getVacation(request: Alt): Request[VacationSettings] = js.native
  /**
    * Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def updateAutoForwarding(request: Alt): Request[AutoForwarding] = js.native
  /** Updates IMAP settings. */
  def updateImap(request: Alt): Request[ImapSettings] = js.native
  /** Updates POP settings. */
  def updatePop(request: Alt): Request[PopSettings] = js.native
  /** Updates vacation responder settings. */
  def updateVacation(request: Alt): Request[VacationSettings] = js.native
}

object SettingsResource {
  @scala.inline
  def apply(
    filters: FiltersResource,
    forwardingAddresses: ForwardingAddressesResource,
    getAutoForwarding: Alt => Request[AutoForwarding],
    getImap: Alt => Request[ImapSettings],
    getPop: Alt => Request[PopSettings],
    getVacation: Alt => Request[VacationSettings],
    sendAs: SendAsResource,
    updateAutoForwarding: Alt => Request[AutoForwarding],
    updateImap: Alt => Request[ImapSettings],
    updatePop: Alt => Request[PopSettings],
    updateVacation: Alt => Request[VacationSettings]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], forwardingAddresses = forwardingAddresses.asInstanceOf[js.Any], getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), sendAs = sendAs.asInstanceOf[js.Any], updateAutoForwarding = js.Any.fromFunction1(updateAutoForwarding), updateImap = js.Any.fromFunction1(updateImap), updatePop = js.Any.fromFunction1(updatePop), updateVacation = js.Any.fromFunction1(updateVacation))
    __obj.asInstanceOf[SettingsResource]
  }
  @scala.inline
  implicit class SettingsResourceOps[Self <: SettingsResource] (val x: Self) extends AnyVal {
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
    def setFilters(value: FiltersResource): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setForwardingAddresses(value: ForwardingAddressesResource): Self = this.set("forwardingAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAutoForwarding(value: Alt => Request[AutoForwarding]): Self = this.set("getAutoForwarding", js.Any.fromFunction1(value))
    @scala.inline
    def setGetImap(value: Alt => Request[ImapSettings]): Self = this.set("getImap", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPop(value: Alt => Request[PopSettings]): Self = this.set("getPop", js.Any.fromFunction1(value))
    @scala.inline
    def setGetVacation(value: Alt => Request[VacationSettings]): Self = this.set("getVacation", js.Any.fromFunction1(value))
    @scala.inline
    def setSendAs(value: SendAsResource): Self = this.set("sendAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateAutoForwarding(value: Alt => Request[AutoForwarding]): Self = this.set("updateAutoForwarding", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateImap(value: Alt => Request[ImapSettings]): Self = this.set("updateImap", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdatePop(value: Alt => Request[PopSettings]): Self = this.set("updatePop", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateVacation(value: Alt => Request[VacationSettings]): Self = this.set("updateVacation", js.Any.fromFunction1(value))
  }
  
}

