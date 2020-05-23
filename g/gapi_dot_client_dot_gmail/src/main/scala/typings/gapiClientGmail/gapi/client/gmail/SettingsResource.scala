package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  var filters: FiltersResource
  var forwardingAddresses: ForwardingAddressesResource
  var sendAs: SendAsResource
  /** Gets the auto-forwarding setting for the specified account. */
  def getAutoForwarding(request: Alt): Request[AutoForwarding]
  /** Gets IMAP settings. */
  def getImap(request: Alt): Request[ImapSettings]
  /** Gets POP settings. */
  def getPop(request: Alt): Request[PopSettings]
  /** Gets vacation responder settings. */
  def getVacation(request: Alt): Request[VacationSettings]
  /**
    * Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def updateAutoForwarding(request: Alt): Request[AutoForwarding]
  /** Updates IMAP settings. */
  def updateImap(request: Alt): Request[ImapSettings]
  /** Updates POP settings. */
  def updatePop(request: Alt): Request[PopSettings]
  /** Updates vacation responder settings. */
  def updateVacation(request: Alt): Request[VacationSettings]
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
}

